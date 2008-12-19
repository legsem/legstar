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
package com.legstar.test.coxb;

import com.legstar.test.coxb.fixarsim.Dfhcommarea;

import junit.framework.TestCase;

public class MarshalFixarsimTest extends TestCase {

	private final static String SCHEMA_NAME = "fixarsim";
	
	public void testFixarsim() throws Exception {

		// Create and populate an instance of an object (JAXB annotated)
		Dfhcommarea Dfhcommarea = (Dfhcommarea) Util.getJaxbObject(SCHEMA_NAME);
		Dfhcommarea.getCArray().add("PREMI");
		Dfhcommarea.getCArray().add("DEUXI");
		Dfhcommarea.getCArray().add("TROIS");

		//		      <---------------------------->
		//		      1 2 3 4 5 6 7 8 9 101112131415
		//		      P R E M I D E U X I T R O I S             
		assertEquals("d7d9c5d4c9c4c5e4e7c9e3d9d6c9e2",
				Util.marshal(SCHEMA_NAME, Dfhcommarea, 15));
	}
}