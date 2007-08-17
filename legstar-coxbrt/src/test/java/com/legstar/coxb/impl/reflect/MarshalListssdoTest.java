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
package com.legstar.coxb.impl.reflect;

import java.util.ArrayList;
import java.util.List;

import com.legstar.coxb.CobolContext;
import com.legstar.coxb.convert.simple.CobolSimpleConverters;
import com.legstar.coxb.impl.reflect.CComplexReflectBinding;
import com.legstar.coxb.visitor.CobolMarshalVisitor;
import com.legstar.coxb.host.HostData;
import com.legstar.coxb.host.HostException;

import junit.framework.TestCase;
import com.legstar.test.coxb.listssdo.ObjectFactory;
import com.legstar.test.coxb.listssdo.DfhcommareaType;

public class MarshalListssdoTest extends TestCase {

	public void testListssdo() throws HostException{
		// Create a cobol context 
		CobolContext cobolContext = new CobolContext();
		// Select a conversion strategy 
		CobolSimpleConverters cc = new CobolSimpleConverters(cobolContext);
		// Create an instance of the JAXB object factory
		ObjectFactory objectFactory = new ObjectFactory();

		// Traverse the object structure, visiting each node with the visitor
		CComplexReflectBinding ccem = new CComplexReflectBinding(objectFactory, getListssdo(objectFactory));
		// Create a concrete visitor
		byte[] hostBytes = new byte[29];
		CobolMarshalVisitor mv = new CobolMarshalVisitor(hostBytes, 0, cc);
		ccem.accept(mv);
		//		              <------><------------------------------------------------>
		//		              1 2 3 4 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5
		//		              0 0 O 5 O D O 0 1 O D O 0 2 O D O 0 3 O D O 0 4 O D O 0 5 
				assertEquals("00000005d6c4d6f0f1d6c4d6f0f2d6c4d6f0f3d6c4d6f0f4d6c4d6f0f5",HostData.toHexString(hostBytes));
	}
	
	private Object getListssdo(ObjectFactory objectFactory) {
		// Create and populate an instance of an object (JAXB annotated)
		DfhcommareaType dfhcommarea = objectFactory.createDfhcommareaType();
		List <String> listOdo = new ArrayList <String>();
		listOdo.add("ODO01");
		listOdo.add("ODO02");
		listOdo.add("ODO03");
		listOdo.add("ODO04");
		listOdo.add("ODO05");
		dfhcommarea.getListOdo().addAll(listOdo);
		return dfhcommarea;
	}

}
