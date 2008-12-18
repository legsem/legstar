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



import com.legstar.coxb.host.HostData;

import junit.framework.TestCase;
import com.legstar.test.coxb.fixarcom.Dfhcommarea;

/**
 * Unmarshal fixarcom.
 *
 */
public class UnmarshalFixarcomTest extends TestCase {

    /**
     * Unmarshal java data object and test host data result.
     * @throws Exception if marshaling fails
     */
    public void testFixarcom() throws Exception {

        String hexString   = "c1c2d1c1f00000"
            + "c1c2d1c1f10007"
            + "c1c2d1c1f2000e"
            + "c1c2d1c1f30015"
            + "c1c2d1c1f4001c"
            + "c1c2d1c1f50023"
            + "c1c2d1c1f6002a";
        byte[] hostBytes = HostData.toByteArray(hexString);
        Dfhcommarea dfhcommarea = (Dfhcommarea) Util.unmarshal(hostBytes, "fixarcom");

        for (int i = 0; i < 7; i++) {
            com.legstar.test.coxb.fixarcom.CArray item = dfhcommarea.getCArray().get(i);
            assertEquals("ABJA" + Integer.toString(i), item.getCItem1());
            assertEquals(Short.parseShort(Integer.toString(7 * i)), item.getCItem2());
        }
    }
}
