package com.legstar.messaging.impl;

import com.legstar.coxb.convert.CobolConverters;
import com.legstar.coxb.host.HostData;
import com.legstar.messaging.impl.CobolTransformer;
import com.legstar.test.coxb.lsfileae.ComPersonalType;
import com.legstar.test.coxb.lsfileae.DfhcommareaType;
import com.legstar.test.coxb.lsfileae.bind.DfhcommareaTypeBinding;

import junit.framework.TestCase;

public class CobolTransformerTest extends TestCase {
	
	private static final String HOST_CHARSET = "IBM01140";
	
	private static final String HOST_DATA =
		"f0f0f0f1f0f0e3d6e3d640404040404040404040404040404040d3c1c2c1e240e2e3d9c5c5e34040404040404040f8f8f9f9f3f3f1f4f1f0f0f4f5f84040f0f0f1f0f04bf3f5c140e5d6c9d9404040";
	
	private CobolConverters mCobolConverters;
	
	public void setUp() {
		/* Select a conversion strategy */ 
		mCobolConverters = CobolTransformer.getCobolConverters(HOST_CHARSET);
	}
	
	public void testMarshal() throws Exception {
	    /* The request java object tree */
	    DfhcommareaType jaxbObject	= getJaxbObject();
	    /* Decorate object tree for static binding */
	    DfhcommareaTypeBinding binding = new DfhcommareaTypeBinding(jaxbObject);
	    /* Prepare a byte array to receive the result */
	    byte[] hostBytes = new byte[binding.calcByteLength()];
	    CobolTransformer.marshal(mCobolConverters, binding, hostBytes);
	    assertEquals(HOST_DATA, HostData.toHexString(hostBytes));
	}
	
	public void testUnmarshal() throws Exception {
	    byte[] hostBytes = HostData.toByteArray(HOST_DATA);
	    DfhcommareaTypeBinding binding = new DfhcommareaTypeBinding();
	    CobolTransformer.unmarshal(mCobolConverters, hostBytes, binding);
	    DfhcommareaType jaxbObject = binding.getDfhcommareaType();
	    assertEquals(100, jaxbObject.getComNumber());
	    assertEquals("00100.35", jaxbObject.getComAmount());
	    assertEquals("A VOIR", jaxbObject.getComComment());
	    assertEquals("100458", jaxbObject.getComDate());
	    assertEquals("LABAS STREET", jaxbObject.getComPersonal().getComAddress());
	    assertEquals("TOTO", jaxbObject.getComPersonal().getComName());
	    assertEquals("88993314", jaxbObject.getComPersonal().getComPhone());
	}

	/**
	 * This method creates an instance of a JAXB object and sets its properties.
	 * @return a JAXB object
	 */
	public static DfhcommareaType getJaxbObject() {
		DfhcommareaType dfhcommarea = new DfhcommareaType();
		dfhcommarea.setComNumber(100);
		dfhcommarea.setComDate("100458");
		dfhcommarea.setComAmount("00100.35");
		dfhcommarea.setComComment("A VOIR");
		ComPersonalType personal = new ComPersonalType();
		personal.setComName("TOTO");
		personal.setComAddress("LABAS STREET");
		personal.setComPhone("88993314");
		dfhcommarea.setComPersonal(personal);
		return dfhcommarea;
	}
}
