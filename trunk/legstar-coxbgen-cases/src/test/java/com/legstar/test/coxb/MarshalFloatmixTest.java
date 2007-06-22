package com.legstar.test.coxb;

import com.legstar.test.coxb.floatmix.DfhcommareaType;

import junit.framework.TestCase;

public class MarshalFloatmixTest extends TestCase {

	private final static String SCHEMA_NAME = "floatmix";
	
	public void testFloatmix() throws Exception {

		// Create and populate an instance of an object (JAXB annotated)
		DfhcommareaType dfhcommareaType = (DfhcommareaType) Util.getJaxbObject(SCHEMA_NAME);

		dfhcommareaType.setCFloat0(0f);
		dfhcommareaType.setCFloat1(1f);
		dfhcommareaType.setCFloat1234(1234f);
		dfhcommareaType.setCFloat345006P5678(345006.5678f);
		dfhcommareaType.setCFloat3P40282347Ep38(3.40282347E+38f);
		dfhcommareaType.setCFloat798P20067Em16(798.20067E-16f);
		
		assertEquals("434d2000000000004110000045543ae9361677a460ffffff000000000000000000000000000000000000000000000000",
				Util.marshal(SCHEMA_NAME, dfhcommareaType, 48));
	}
}
