/*******************************************************************************
 * LegStar legacy Web-enablement .
 * Copyright (C)  2007 LegSem
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301  USA
 * 
 *     
 *****************************************************************************/
package com.legstar.cixs.gen;

import com.legstar.xslt.XSLTException;
import com.legstar.xslt.XSLTGenerator;

/**
 * This class contains the logic to generate WEB and JAXWS deployment XML using
 * previously generated descriptors and a set of XSL transforms.
 * 
 * @author Fady Moussallam
 * 
 */
public class CixsWebDescriptors extends XSLTGenerator {

	/** The XSL transform for web descriptors. */
	private static final String  WEBXML_STYLE = "/xslt/web-xml.xsl";
	
	/** The resulting web descriptor. */
	private static final String  WEBXML_FILE = "web.xml";
	
	/** The XSL transform for jaxws descriptors. */
	private static final String  JAXWS_STYLE = "/xslt/sun-jaxws-xml.xsl";
	
	/** The resulting jaxws descriptor. */
	private static final String  JAXWS_FILE = "sun-jaxws.xml";
	
	/**
	 * No-arg constructor.
	 * 
	 * @throws XSLTException if environment is not setup
	 */
	public CixsWebDescriptors() throws XSLTException {
		super();
	}
	
	/**
	 * Create deployment XML (WEB and JAXWS descriptors).
	 * 
	 * @param serviceDescriptorFile the descriptor previously generated
	 * @param targetDir the target location for the generated XML
	 * @throws XSLTException if XSLT transform fails
	 */
	public final void createWebDescriptors(
			final String serviceDescriptorFile,
			final String targetDir) throws XSLTException {

		/* Create a Web descriptor */
		transform(serviceDescriptorFile,
				targetDir + '/' + WEBXML_FILE, WEBXML_STYLE);

		/* Create a jaxws descriptor */
		transform(serviceDescriptorFile,
				targetDir + '/' + JAXWS_FILE, JAXWS_STYLE);
	}

}