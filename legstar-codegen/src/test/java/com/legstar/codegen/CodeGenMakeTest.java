/*******************************************************************************
 *  LegStar legacy Web-enablement .
 *  Copyright (C) 2007 LegSem
 *  
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *  
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *   
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 *  02110-1301  USA
 *  
 *******************************************************************************/
package com.legstar.codegen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import junit.framework.TestCase;

/**
 * Test cases for CixsMake.
 */
public class CodeGenMakeTest extends TestCase {

    /** Logger. */
	private static final Log LOG = LogFactory.getLog(CodeGenMakeTest.class);

    /**
     * Check controls on input make file.
     */
    public final void testCixsMakeInputValidation() {
        CodeGenMake codeGenMake = new CodeGenMake();
        codeGenMake.setModelName("modelName");
        codeGenMake.setModel("model");
        try {
            codeGenMake.execute();
        } catch (RuntimeException e) {
            assertEquals("Missing make file parameter", e.getMessage());
        }
        codeGenMake.setCodeGenMakeFileName("tarass.boulba");
        try {
            codeGenMake.execute();
        } catch (RuntimeException e) {
            assertEquals("Code generation make file tarass.boulba does not exist", e.getMessage());
        }
    }
    
    /**
     * Check controls on input make file tag &lt;cixstarget&gt;.
     * @throws IOException if file cannot be read
     */
    public final void testCodeGenMakeNoTargetTag() throws IOException {
        File tempMakeFile = File.createTempFile("test-temp", "xml");
        /* Create a temporary make file */
        BufferedWriter out;
        out = new BufferedWriter(new FileWriter(tempMakeFile));
        out.write("<somethingElse/>");
        out.close();

        CodeGenMake codeGenMake = new CodeGenMake();
        codeGenMake.setModelName("modelName");
        codeGenMake.setModel("model");
        codeGenMake.setCodeGenMakeFileName(tempMakeFile.getPath());
        try {
            codeGenMake.execute();
        } catch (RuntimeException e) {
            assertEquals("Empty or invalid code generation make file", e.getMessage());
        }
    }
    
    /**
     * Check controls on input make file tag &lt;cixstarget name=""&gt;.
     * @throws IOException if file cannot be read
     */
    public final void testCodeGenMakeNoTargetName() throws IOException {
        File tempMakeFile = File.createTempFile("test-temp", "xml");
        /* Create a temporary make file */
        BufferedWriter out;
        out = new BufferedWriter(new FileWriter(tempMakeFile));
        out.write("<target/>");
        out.close();

        CodeGenMake codeGenMake = new CodeGenMake();
        codeGenMake.setModelName("modelName");
        codeGenMake.setModel("model");
        codeGenMake.setCodeGenMakeFileName(tempMakeFile.getPath());
        try {
            codeGenMake.execute();
        } catch (RuntimeException e) {
            assertEquals("Missing name attribute for target element", e.getMessage());
        }
    }

    /**
     * Check controls on input make file tag &lt;cixstemplate name=""&gt;.
     * @throws IOException if file cannot be read
     */
    public final void testCodeGenMakeTemplateNoTemplateName() throws IOException {
        File tempMakeFile = File.createTempFile("test-temp", "xml");
        /* Create a temporary make file */
        BufferedWriter out;
        out = new BufferedWriter(new FileWriter(tempMakeFile));
        out.write("<target name=\"aTarget\"><step/></target>");
        out.close();

        CodeGenMake codeGenMake = new CodeGenMake();
        codeGenMake.setModelName("modelName");
        codeGenMake.setModel("model");
        codeGenMake.setCodeGenMakeFileName(tempMakeFile.getPath());
        try {
            codeGenMake.execute();
        } catch (RuntimeException e) {
            assertEquals(
                    "Missing template name attribute for step element",
                    e.getMessage());
        }
    }

    /**
     * Check controls on input make file tag &lt;step targetFile=""&gt;.
     * @throws IOException if file cannot be read
     */
    public final void testCodeGenMakeTemplateNoTargetFileName() throws IOException {
        File tempMakeFile = File.createTempFile("test-temp", "xml");
        /* Create a temporary make file */
        BufferedWriter out;
        out = new BufferedWriter(new FileWriter(tempMakeFile));
        out.write(
                "<target name=\"aTarget\"><step templateName=\"tt.vm\"/>"
                +  "</target>");
        out.close();

        CodeGenMake codeGenMake = new CodeGenMake();
        codeGenMake.setModelName("modelName");
        codeGenMake.setModel("model");
        codeGenMake.setCodeGenMakeFileName(tempMakeFile.getPath());
        try {
            codeGenMake.execute();
        } catch (RuntimeException e) {
            assertEquals(
                    "Missing template target file name attribute for"
                    + " step element",
                    e.getMessage());
        }
    }

    /**
     * Check generation.
     * @throws IOException if file cannot be read
     */
    public final void testCodeGenMakeTemplateWithParameters() throws IOException {
        File tempMakeFile = File.createTempFile("test-temp", "xml");
        /* Create a temporary make file */
        BufferedWriter out;
        out = new BufferedWriter(new FileWriter(tempMakeFile));
        out.write("<target name=\"aTarget\" dir=\"test-gen\">"
                + "<step templateName=\"testtemplate.vm\" targetFile=\"test.text\">"
                + "<parm1 value=\"value1\"/><parm2 value=\"value2\"/>"
                + "</step></target>");
        out.close();

        CodeGenMake codeGenMake = new CodeGenMake();
        codeGenMake.init();
        codeGenMake.setModelName("modelName");
        codeGenMake.setModel("model");
        codeGenMake.setCodeGenMakeFileName(tempMakeFile.getPath());
        codeGenMake.execute();
        BufferedReader in = new BufferedReader(new FileReader("test-gen/test.text"));
        String resStr = "";
        String str = in.readLine();
        while (str != null) {
            LOG.debug(str);
            resStr += str;
            str = in.readLine();
        }
        in.close();
        assertTrue(resStr.contains("Using value1 and value2"));
    }
}