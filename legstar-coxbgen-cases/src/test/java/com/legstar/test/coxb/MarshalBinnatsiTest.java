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

import com.legstar.test.coxb.binnatsi.LsUnsignedNativeType;
import com.legstar.test.coxb.binnatsi.LsDoublewordsType;
import com.legstar.test.coxb.binnatsi.LsFullwordsType;
import com.legstar.test.coxb.binnatsi.LsHalfwordsType;
import com.legstar.test.coxb.binnatsi.DfhcommareaType;

import junit.framework.TestCase;

public class MarshalBinnatsiTest extends TestCase {

	private final static String SCHEMA_NAME = "binnatsi";
	
	public void testBinnatsi() throws Exception {

		// Create and populate an instance of an object (JAXB annotated)
		DfhcommareaType dfhcommareaType = (DfhcommareaType) Util.getJaxbObject(SCHEMA_NAME);
		
		LsUnsignedNativeType lsUnsignedNativeType = new LsUnsignedNativeType(); 
		
		LsHalfwordsType lsHalfwordsType = new LsHalfwordsType();
		lsHalfwordsType.setLsPs9X4High(new Short("1045"));
		lsHalfwordsType.setLsPs9X4Low(new Short("-128"));
		lsHalfwordsType.setLsPs9X4Max(new Short("32767"));
		lsHalfwordsType.setLsPs9X4Min(new Short("-32768"));
		
		LsFullwordsType lsFullwordsType = new LsFullwordsType();
		lsFullwordsType.setLsPs9X9High(123456789);
		lsFullwordsType.setLsPs9X9Low(-128);
		lsFullwordsType.setLsPs9X9Max(2147483647);
		lsFullwordsType.setLsPs9X9Min(-2147483648);
		
		LsDoublewordsType lsDoublewordsType = new LsDoublewordsType();
		lsDoublewordsType.setLsPs9X18High(17179869183l);
		lsDoublewordsType.setLsPs9X18Low(-4294967294l);
		lsDoublewordsType.setLsPs9X18Max(9223372036854775807l);
		lsDoublewordsType.setLsPs9X18Min(-9223372036854775808l);
		
		lsUnsignedNativeType.setLsHalfwords(lsHalfwordsType);
		lsUnsignedNativeType.setLsFullwords(lsFullwordsType);
		lsUnsignedNativeType.setLsDoublewords(lsDoublewordsType);
		
		dfhcommareaType.setLsUnsignedNative(lsUnsignedNativeType);
		
		assertEquals("8000ff8004157fff80000000ffffff80075bcd157fffffff8000000000000000ffffffff0000000200000003ffffffff7fffffffffffffff",
				Util.marshal(SCHEMA_NAME, dfhcommareaType, 56));
	}
}
