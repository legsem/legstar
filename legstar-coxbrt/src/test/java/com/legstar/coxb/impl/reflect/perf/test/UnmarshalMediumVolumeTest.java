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
package com.legstar.coxb.impl.reflect.perf.test;

import com.legstar.coxb.CobolContext;
import com.legstar.coxb.CobolUnmarshalVisitor;
import com.legstar.coxb.convert.simple.CobolSimpleConverters;
import com.legstar.coxb.impl.reflect.CComplexReflectBinding;
import com.legstar.host.HostData;
import com.legstar.host.HostException;

import junit.framework.TestCase;

public class UnmarshalMediumVolumeTest extends TestCase {

	private static int ITERATIONS = 100;
	
	public void testUnmarshal() throws HostException {
		String hexString   = "00005c404040c340404040404040000000001f000000000064c6c9d3c5f0404040a38889a24b89a24b868993854bf0404040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f1404040a38889a24b89a24b868993854bf1404040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f2404040a38889a24b89a24b868993854bf2404040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f3404040a38889a24b89a24b868993854bf3404040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f4404040a38889a24b89a24b868993854bf4404040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f5404040a38889a24b89a24b868993854bf5404040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f6404040a38889a24b89a24b868993854bf6404040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f7404040a38889a24b89a24b868993854bf7404040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f8404040a38889a24b89a24b868993854bf8404040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f9404040a38889a24b89a24b868993854bf9404040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f1f04040a38889a24b89a24b868993854bf1f04040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f1f14040a38889a24b89a24b868993854bf1f14040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f1f24040a38889a24b89a24b868993854bf1f24040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f1f34040a38889a24b89a24b868993854bf1f34040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f1f44040a38889a24b89a24b868993854bf1f44040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f1f54040a38889a24b89a24b868993854bf1f54040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f1f64040a38889a24b89a24b868993854bf1f64040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f1f74040a38889a24b89a24b868993854bf1f74040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f1f84040a38889a24b89a24b868993854bf1f84040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f1f94040a38889a24b89a24b868993854bf1f94040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f2f04040a38889a24b89a24b868993854bf2f04040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f2f14040a38889a24b89a24b868993854bf2f14040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f2f24040a38889a24b89a24b868993854bf2f24040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f2f34040a38889a24b89a24b868993854bf2f34040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f2f44040a38889a24b89a24b868993854bf2f44040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f2f54040a38889a24b89a24b868993854bf2f54040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f2f64040a38889a24b89a24b868993854bf2f64040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f2f74040a38889a24b89a24b868993854bf2f74040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f2f84040a38889a24b89a24b868993854bf2f84040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f2f94040a38889a24b89a24b868993854bf2f94040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f3f04040a38889a24b89a24b868993854bf3f04040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f3f14040a38889a24b89a24b868993854bf3f14040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f3f24040a38889a24b89a24b868993854bf3f24040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f3f34040a38889a24b89a24b868993854bf3f34040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f3f44040a38889a24b89a24b868993854bf3f44040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f3f54040a38889a24b89a24b868993854bf3f54040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f3f64040a38889a24b89a24b868993854bf3f64040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f3f74040a38889a24b89a24b868993854bf3f74040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f3f84040a38889a24b89a24b868993854bf3f84040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f3f94040a38889a24b89a24b868993854bf3f94040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f4f04040a38889a24b89a24b868993854bf4f04040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f4f14040a38889a24b89a24b868993854bf4f14040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f4f24040a38889a24b89a24b868993854bf4f24040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f4f34040a38889a24b89a24b868993854bf4f34040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f4f44040a38889a24b89a24b868993854bf4f44040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f4f54040a38889a24b89a24b868993854bf4f54040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f4f64040a38889a24b89a24b868993854bf4f64040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f4f74040a38889a24b89a24b868993854bf4f74040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f4f84040a38889a24b89a24b868993854bf4f84040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f4f94040a38889a24b89a24b868993854bf4f94040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f5f04040a38889a24b89a24b868993854bf5f04040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f5f14040a38889a24b89a24b868993854bf5f14040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f5f24040a38889a24b89a24b868993854bf5f24040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f5f34040a38889a24b89a24b868993854bf5f34040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f5f44040a38889a24b89a24b868993854bf5f44040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f5f54040a38889a24b89a24b868993854bf5f54040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f5f64040a38889a24b89a24b868993854bf5f64040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f5f74040a38889a24b89a24b868993854bf5f74040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f5f84040a38889a24b89a24b868993854bf5f84040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f5f94040a38889a24b89a24b868993854bf5f94040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f6f04040a38889a24b89a24b868993854bf6f04040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f6f14040a38889a24b89a24b868993854bf6f14040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f6f24040a38889a24b89a24b868993854bf6f24040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f6f34040a38889a24b89a24b868993854bf6f34040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f6f44040a38889a24b89a24b868993854bf6f44040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f6f54040a38889a24b89a24b868993854bf6f54040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f6f64040a38889a24b89a24b868993854bf6f64040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f6f74040a38889a24b89a24b868993854bf6f74040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f6f84040a38889a24b89a24b868993854bf6f84040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f6f94040a38889a24b89a24b868993854bf6f94040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f7f04040a38889a24b89a24b868993854bf7f04040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f7f14040a38889a24b89a24b868993854bf7f14040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f7f24040a38889a24b89a24b868993854bf7f24040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f7f34040a38889a24b89a24b868993854bf7f34040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f7f44040a38889a24b89a24b868993854bf7f44040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f7f54040a38889a24b89a24b868993854bf7f54040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f7f64040a38889a24b89a24b868993854bf7f64040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f7f74040a38889a24b89a24b868993854bf7f74040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f7f84040a38889a24b89a24b868993854bf7f84040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f7f94040a38889a24b89a24b868993854bf7f94040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f8f04040a38889a24b89a24b868993854bf8f04040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f8f14040a38889a24b89a24b868993854bf8f14040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f8f24040a38889a24b89a24b868993854bf8f24040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f8f34040a38889a24b89a24b868993854bf8f34040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f8f44040a38889a24b89a24b868993854bf8f44040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f8f54040a38889a24b89a24b868993854bf8f54040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f8f64040a38889a24b89a24b868993854bf8f64040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f8f74040a38889a24b89a24b868993854bf8f74040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f8f84040a38889a24b89a24b868993854bf8f84040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f8f94040a38889a24b89a24b868993854bf8f94040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f9f04040a38889a24b89a24b868993854bf9f04040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f9f14040a38889a24b89a24b868993854bf9f14040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f9f24040a38889a24b89a24b868993854bf9f24040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f9f34040a38889a24b89a24b868993854bf9f34040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f9f44040a38889a24b89a24b868993854bf9f44040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f9f54040a38889a24b89a24b868993854bf9f54040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f9f64040a38889a24b89a24b868993854bf9f64040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f9f74040a38889a24b89a24b868993854bf9f74040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f9f84040a38889a24b89a24b868993854bf9f84040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040c6c9d3c5f9f94040a38889a24b89a24b868993854bf9f94040404040404040404040404040404040404040404040404040404040c5d5c1c2d3c5c44040404040";
		byte[] hostBytes = HostData.toByteArray(hexString);

		
		// Select a conversion strategy 
		CobolSimpleConverters cc = new CobolSimpleConverters(new CobolContext());
		// Create a concrete visitor
		CobolUnmarshalVisitor mv = new CobolUnmarshalVisitor(hostBytes, 0, cc);
		
		// Create an instance of the JAXB object factory
		com.legstar.test.coxb.dplarcht.ObjectFactory objectFactory = new com.legstar.test.coxb.dplarcht.ObjectFactory();
		
		// Perform mashaling a number of times
		for (int i = 0; i < ITERATIONS; i++) {
			// Create and populate an instance of an object (JAXB annotated)
			com.legstar.test.coxb.dplarcht.DfhcommareaType dfhcommarea = objectFactory.createDfhcommareaType();
			
			// Traverse the object structure, visiting each node with the visitor
			CComplexReflectBinding ccem = new CComplexReflectBinding(objectFactory, dfhcommarea);
			mv.setOffset(0);
			ccem.accept(mv);
		}
           assertEquals(6425, mv.getOffset());
	}
}
