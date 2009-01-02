/*******************************************************************************
 * Copyright (c) 2008 LegSem.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     LegSem - initial API and implementation
 ******************************************************************************/
package com.legstar.cixs.jaxws.gen.vm;

import java.io.File;

import com.legstar.cixs.gen.AbstractTestTemplate;
import com.legstar.cixs.gen.Samples;
import com.legstar.cixs.gen.model.CixsOperation;
import com.legstar.cixs.gen.model.CixsStructure;
import com.legstar.cixs.jaxws.gen.Jaxws2CixsGenerator;
import com.legstar.cixs.jaxws.model.CixsJaxwsService;
import com.legstar.codegen.CodeGenUtil;

/**
 * Test the generation of various artifacts for an adapter.
 *
 */
public class MiscVelocityTemplatesTest extends AbstractTestTemplate {


    /**
     * Header class.
     * @throws Exception if test fails
     */
    public void testHostHeader() throws Exception {

        CixsJaxwsService jaxwsComponent = Samples.getLsfileae();

        File componentClassFilesDir = CodeGenUtil.classFilesLocation(
                GEN_SRC_DIR, jaxwsComponent.getPackageName(), true);
        Jaxws2CixsGenerator.generateHeader(
                jaxwsComponent, getParameters(), componentClassFilesDir);
        String resStr = getSource(
                componentClassFilesDir,
                jaxwsComponent.getHeaderClassName() + ".java");

        assertTrue(resStr.contains("package com.legstar.test.cixs.lsfileae;"));
        assertTrue(resStr.contains("@XmlType(name = \"LsfileaeHostHeader\","));
        assertTrue(resStr.contains("namespace = \"http://cixs.test.legstar.com/lsfileae\","));
        assertTrue(resStr.contains("public class LsfileaeHostHeader"));
    }

    /**
     * Holder class.
     * @throws Exception if test fails
     */
    public void testHolder() throws Exception {

        CixsJaxwsService jaxwsComponent = Samples.getLsfileac();
        CixsOperation operation = jaxwsComponent.getCixsOperations().get(0);

        getParameters().put("propertyName", "Request");

        File operationClassFilesDir = CodeGenUtil.classFilesLocation(
                GEN_SRC_DIR, operation.getPackageName(), true);
        Jaxws2CixsGenerator.generateHolders(
                operation, getParameters(), operationClassFilesDir);
        String resStr = getSource(
                operationClassFilesDir,
                operation.getRequestHolderType() + ".java");

        assertTrue(resStr.contains("package com.legstar.test.cixs.lsfileac;"));
        assertTrue(resStr.contains("import com.legstar.test.coxb.lsfileac.QueryLimit;"));
        assertTrue(resStr.contains("import com.legstar.test.coxb.lsfileac.QueryData;"));
        assertTrue(resStr.contains("@XmlType(name = \"LsfileacRequestHolder\","));
        assertTrue(resStr.contains("namespace = \"http://cixs.test.legstar.com/lsfileac\","));
        assertTrue(resStr.contains("\"queryLimit\","));
        assertTrue(resStr.contains("\"queryData\""));
        assertTrue(resStr.contains("public class LsfileacRequestHolder {"));
        assertTrue(resStr.contains("@XmlElement(name = \"queryLimit\","));
        assertTrue(resStr.contains("private QueryLimit queryLimit;"));
        assertTrue(resStr.contains("@XmlElement(name = \"queryData\","));
        assertTrue(resStr.contains("private QueryData queryData;"));
        assertTrue(resStr.contains("public final QueryLimit getQueryLimit() {"));
        assertTrue(resStr.contains("return queryLimit;"));
        assertTrue(resStr.contains("final QueryLimit value) {"));
        assertTrue(resStr.contains("queryLimit = value;"));
        assertTrue(resStr.contains("public final QueryData getQueryData() {"));
        assertTrue(resStr.contains("return queryData;"));
        assertTrue(resStr.contains("public final void setQueryData("));
        assertTrue(resStr.contains("private QueryData queryData;"));
        assertTrue(resStr.contains("final QueryData value) {"));
        assertTrue(resStr.contains("queryData = value;"));
    }

    /**
     * Wrapper class.
     * @throws Exception if test fails
     */
    public void testWrapper() throws Exception {

        CixsJaxwsService jaxwsComponent = Samples.getLsfileae();
        CixsOperation operation = jaxwsComponent.getCixsOperations().get(0);
        CixsStructure structure = operation.getInput().get(0);

        getParameters().put("propertyName", "Request");
        getParameters().put("fieldName", "request");
        getParameters().put("wrapperType", operation.getRequestWrapperType());
        getParameters().put("importType", structure.getJaxbPackageName()
                + '.' + structure.getJaxbType());
        getParameters().put("fieldType", structure.getJaxbType());

        File operationClassFilesDir = CodeGenUtil.classFilesLocation(
                GEN_SRC_DIR, operation.getPackageName(), true);
        Jaxws2CixsGenerator.generateWrappers(
                operation, getParameters(), operationClassFilesDir);
        String resStr = getSource(
                operationClassFilesDir,
                operation.getRequestWrapperType() + ".java");

        assertTrue(resStr.contains("package com.legstar.test.cixs.lsfileae;"));
        assertTrue(resStr.contains("import com.legstar.test.coxb.lsfileae.Dfhcommarea;"));
        assertTrue(resStr.contains("@XmlType(name = \"LsfileaeRequest\","));
        assertTrue(resStr.contains("namespace = \"http://cixs.test.legstar.com/lsfileae\","));
        assertTrue(resStr.contains("\"request\""));
        assertTrue(resStr.contains("public class LsfileaeRequest {"));
        assertTrue(resStr.contains("@XmlElement(name = \"Request\","));
        assertTrue(resStr.contains("private Dfhcommarea request;"));
        assertTrue(resStr.contains("public final Dfhcommarea getRequest() {"));
        assertTrue(resStr.contains("return request;"));
        assertTrue(resStr.contains("public final void setRequest("));
        assertTrue(resStr.contains("final Dfhcommarea value) {"));
        assertTrue(resStr.contains("request = value;"));
    }

    /**
     * Holder class with a single inner object.
     * @throws Exception if test fails
     */
    public void testHolderSingle() throws Exception {

        CixsJaxwsService jaxwsComponent = Samples.getLsfileaq();
        CixsOperation operation = jaxwsComponent.getCixsOperations().get(0);

        getParameters().put("propertyName", "Request");

        File operationClassFilesDir = CodeGenUtil.classFilesLocation(
                GEN_SRC_DIR, operation.getPackageName(), true);
        Jaxws2CixsGenerator.generateHolders(
                operation, getParameters(), operationClassFilesDir);
        String resStr = getSource(
                operationClassFilesDir,
                operation.getRequestHolderType() + ".java");

        assertTrue(resStr.contains("package com.legstar.test.cixs.lsfileaq;"));
        assertTrue(resStr.contains("import com.legstar.test.coxb.lsfileac.QueryData;"));
        assertTrue(resStr.contains("@XmlType(name = \"LsfileacRequestHolder\","));
        assertTrue(resStr.contains("namespace = \"http://cixs.test.legstar.com/lsfileaq\","));
        assertTrue(resStr.contains("\"queryData\""));
        assertTrue(resStr.contains("public class LsfileacRequestHolder {"));
        assertTrue(resStr.contains("@XmlElement(name = \"queryData\","));
        assertTrue(resStr.contains("private QueryData queryData;"));
        assertTrue(resStr.contains("public final QueryData getQueryData() {"));
        assertTrue(resStr.contains("return queryData;"));
        assertTrue(resStr.contains("public final void setQueryData("));
        assertTrue(resStr.contains("private QueryData queryData;"));
        assertTrue(resStr.contains("final QueryData value) {"));
        assertTrue(resStr.contains("queryData = value;"));
    }

    /**
     * Exception class.
     * @throws Exception if test fails
     */
    public void testFault() throws Exception {

        CixsJaxwsService jaxwsComponent = Samples.getLsfileae();
        CixsOperation operation = jaxwsComponent.getCixsOperations().get(0);

        File operationClassFilesDir = CodeGenUtil.classFilesLocation(
                GEN_SRC_DIR, operation.getPackageName(), true);
        Jaxws2CixsGenerator.generateFault(
                operation, getParameters(), operationClassFilesDir);
        String resStr = getSource(
                operationClassFilesDir,
                operation.getFaultType() + ".java");

        assertTrue(resStr.contains("package com.legstar.test.cixs.lsfileae;"));
        assertTrue(resStr.contains("@WebFault(name = \"LsfileaeFaultInfo\","));
        assertTrue(resStr.contains("targetNamespace = \"http://cixs.test.legstar.com/lsfileae\")"));
        assertTrue(resStr.contains("public class LsfileaeException"));
        assertTrue(resStr.contains("private LsfileaeFaultInfo faultInfo;"));
        assertTrue(resStr.contains("public LsfileaeException("));
        assertTrue(resStr.contains("final LsfileaeFaultInfo fault) {"));
        assertTrue(resStr.contains("final LsfileaeFaultInfo fault,"));
        assertTrue(resStr.contains("returns fault bean: com.legstar.test.cixs.lsfileae.LsfileaeFaultInfo"));
        assertTrue(resStr.contains("public final LsfileaeFaultInfo getFaultInfo() {"));
    }

    /**
     * Fault Info class.
     * @throws Exception if test fails
     */
    public void testFaultInfo() throws Exception {

        CixsJaxwsService jaxwsComponent = Samples.getLsfileae();
        CixsOperation operation = jaxwsComponent.getCixsOperations().get(0);

        File operationClassFilesDir = CodeGenUtil.classFilesLocation(
                GEN_SRC_DIR, operation.getPackageName(), true);
        Jaxws2CixsGenerator.generateFaultInfo(
                operation, getParameters(), operationClassFilesDir);
        String resStr = getSource(
                operationClassFilesDir,
                operation.getFaultInfoType() + ".java");

        assertTrue(resStr.contains("package com.legstar.test.cixs.lsfileae;"));
        assertTrue(resStr.contains("public class LsfileaeFaultInfo {"));
        assertTrue(resStr.contains("@XmlType(name = \"LsfileaeFaultInfo\","));
        assertTrue(resStr.contains("namespace = \"http://cixs.test.legstar.com/lsfileae\","));
    }

    /**
     * Program properties.
     * @throws Exception if test fails
     */
    public void testProgramPropertiesCommarea() throws Exception {

        CixsJaxwsService jaxwsComponent = Samples.getLsfileal();
        CixsOperation operation = jaxwsComponent.getCixsOperations().get(0);

        File operationPropertiesFilesDir =
            new File(GEN_PROP_DIR, jaxwsComponent.getName());
        CodeGenUtil.checkDirectory(operationPropertiesFilesDir, true);
        Jaxws2CixsGenerator.generateProgramProperties(
                operation, getParameters(), operationPropertiesFilesDir);
        String resStr = getSource(
                operationPropertiesFilesDir,
                operation.getCicsProgramName() + ".properties");

        assertTrue(resStr.contains("CICSProgramName=LSFILEAL"));
        assertTrue(resStr.contains("CICSLength=8043"));
        assertTrue(resStr.contains("CICSDataLength=20"));
    }

    /**
     * Program properties for containers.
     * @throws Exception if test fails
     */
    public void testProgramPropertiesContainer() throws Exception {

        CixsJaxwsService jaxwsComponent = Samples.getLsfileac();
        CixsOperation operation = jaxwsComponent.getCixsOperations().get(0);

        File operationPropertiesFilesDir = 
            new File(GEN_PROP_DIR, jaxwsComponent.getName());
        CodeGenUtil.checkDirectory(operationPropertiesFilesDir, true);
        Jaxws2CixsGenerator.generateProgramProperties(
                operation, getParameters(), operationPropertiesFilesDir);
        String resStr = getSource(
                operationPropertiesFilesDir,
                operation.getCicsProgramName() + ".properties");

        /* Maven tests the containers in this order but not Eclipse FIXME*/
        assertTrue(resStr.contains("CICSProgramName=LSFILEAC"));
        assertTrue(resStr.contains("CICSChannel=LSFILEAC-CHANNEL"));
        assertTrue(resStr.contains("CICSInContainers_1=QueryData"));
        assertTrue(resStr.contains("CICSInContainersLength_1=48"));
        assertTrue(resStr.contains("CICSInContainers_2=QueryLimit"));
        assertTrue(resStr.contains("CICSInContainersLength_2=10"));
        assertTrue(resStr.contains("CICSOutContainers_1=ReplyData"));
        assertTrue(resStr.contains("CICSOutContainersLength_1=7905"));
        assertTrue(resStr.contains("CICSOutContainers_2=ReplyStatus"));
        assertTrue(resStr.contains("CICSOutContainersLength_2=151"));
    }

    /**
     * sun-jaxws.xml.
     * @throws Exception if test fails
     */
    public void testSunJaxwsXml() throws Exception {

        CixsJaxwsService jaxwsComponent = Samples.getLsfileae();

        File componentWebFilesDir =
            new File(GEN_WDD_DIR, jaxwsComponent.getName());
        CodeGenUtil.checkDirectory(componentWebFilesDir, true);
        Jaxws2CixsGenerator.generateSunJaxwsXml(
                jaxwsComponent, getParameters(), componentWebFilesDir);
        String resStr = getSource(componentWebFilesDir, "sun-jaxws.xml");

        assertTrue(resStr.contains("<endpoint name=\"lsfileaeService\""));
        assertTrue(resStr.contains("implementation=\"com.legstar.test.cixs.lsfileae.LsfileaeImpl\""));
        assertTrue(resStr.contains("url-pattern=\"/lsfileae\"/>"));
    }

    /**
     * web.xml.
     * @throws Exception if test fails
     */
    public void testWebXml() throws Exception {

        CixsJaxwsService jaxwsComponent = Samples.getLsfileae();

        File componentWebFilesDir = 
            new File(GEN_WDD_DIR, jaxwsComponent.getName());
        CodeGenUtil.checkDirectory(componentWebFilesDir, true);
        Jaxws2CixsGenerator.generateWebXml(
                jaxwsComponent, getParameters(), componentWebFilesDir);
        String resStr = getSource(
                componentWebFilesDir,
        "web.xml");

        assertTrue(resStr.contains("<display-name>LegStar Jaxws lsfileae</display-name>"));
        assertTrue(resStr.contains("<description>LegStar Jaxws lsfileae Web Service</description>"));
        assertTrue(resStr.contains("<servlet-name>lsfileaeService</servlet-name>"));
        assertTrue(resStr.contains("<url-pattern>/lsfileae</url-pattern>"));
    }

    /**
     * War build anbt script.
     * @throws Exception if test fails
     */
    public void testAntBuildWar() throws Exception {

        CixsJaxwsService jaxwsComponent = Samples.getLsfileae();

        getParameters().put("targetWarDir", "/Servers/TOMDev/webapps");
        getParameters().put("targetWDDDir", "/Legsem/Legstar/Dev/WebContent/WEB-INF");
        getParameters().put("jaxbBinDir", "/legstar-jaxbgen-cases/target/classes");
        getParameters().put("coxbBinDir", "/legstar-coxbgen-cases/target/classes");
        getParameters().put("targetBinDir", "/legstar-cixsgen-cases/target/classes");
        getParameters().put("custBinDir", "/legstar-cixsgen-cust-cases/target/classes");
        getParameters().put("targetPropDir", "/Legsem/Legstar/Dev/WebContent/WEB-INF/classes");

        File componentAntFilesDir =
            new File(GEN_ANT_DIR, jaxwsComponent.getName());
        CodeGenUtil.checkDirectory(componentAntFilesDir, true);
        Jaxws2CixsGenerator.generateAntBuildWar(
                jaxwsComponent, getParameters(), componentAntFilesDir);
        String resStr = getSource(
                componentAntFilesDir,
        "build.xml");

        assertTrue(resStr.contains("<delete file=\"/Servers/TOMDev/webapps/cixs-lsfileae.war\""
                + " includeEmptyDirs=\"true\""));
        assertTrue(resStr.contains("<war warfile=\"/Servers/TOMDev/webapps/cixs-lsfileae.war\""));
        assertTrue(resStr.contains("webxml=\"/Legsem/Legstar/Dev/WebContent/WEB-INF/web.xml\">"));
        assertTrue(resStr.contains("<webinf dir=\"/Legsem/Legstar/Dev/WebContent/WEB-INF\""));
        assertTrue(resStr.contains("<classes dir=\"/legstar-jaxbgen-cases/target/classes\">"));
        assertTrue(resStr.contains("<include name=\"com/legstar/test/coxb/lsfileae/*.class\"/>"));
        assertTrue(resStr.contains("<classes dir=\"/legstar-coxbgen-cases/target/classes\">"));
        assertTrue(resStr.contains("<include name=\"com/legstar/test/coxb/lsfileae/bind/*.class\"/>"));
        assertTrue(resStr.contains("<classes dir=\"/legstar-cixsgen-cases/target/classes\">"));
        assertTrue(resStr.contains("<classes dir=\"/legstar-cixsgen-cust-cases/target/classes\"/>"));
    }

}
