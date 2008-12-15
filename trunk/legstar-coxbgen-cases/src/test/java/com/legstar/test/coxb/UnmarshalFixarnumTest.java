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
import com.legstar.test.coxb.fixarnum.Dfhcommarea;

import junit.framework.TestCase;

public class UnmarshalFixarnumTest extends TestCase {

    public void testFixarnum() throws Exception {

        //		              <--C-ARRAY-PD-COMP-3-- ><-------C-ARRAY-ZD-DISPLAY---------><--C-ARRAY-ZI-DISPLAY--><---C-ARRAY-BI-COMP----><------------C-ARRAY-NI-COMP-5----------------->
        //		              <------><------><------><----------><----------><----------><------><------><------><------><------><------><--------------><--------------><-------------->
        //		              1 2 3 4 1 2 3 4 1 2 3 4 1 2 3 4 5 6 1 2 3 4 5 6 1 2 3 4 5 6 1 2 3 4 1 2 3 4 1 2 3 4 1 2 3 4 1 2 3 4 1 2 3 4 1 2 3 4 5 6 7 8 1 2 3 4 5 6 7 8 1 2 3 4 5 6 7 8 
        //		              1653423+0000150+0018400+5 3 4 2 3 6 0 4 5 0 0 7 0 0 1 9 5 0 9 9 9 8 0 0 0 0 0 1 7 89998999980067676736789013
        String hexString   = "1653423f0000150f0018400ff5f3f4f2f3f6f0f4f5f0f0f7f0f0f1f9f5f0f9f9f9f8f0f0f0f0f0f1f7f83b99435e000a539f02315b1501b69b4ba630f34e00000001936299fe0000000002315bc0";
        byte[] hostBytes = HostData.toByteArray(hexString);

        Dfhcommarea Dfhcommarea = (Dfhcommarea) Util.unmarshal(hostBytes, "fixarnum");

        assertEquals("16534.23",Dfhcommarea.getCArrayPd().get(0).toString());
        assertEquals("1.50",Dfhcommarea.getCArrayPd().get(1).toString());
        assertEquals("184.00",Dfhcommarea.getCArrayPd().get(2).toString());

        assertEquals("534.236",Dfhcommarea.getCArrayZd().get(0).toString());
        assertEquals("45.007",Dfhcommarea.getCArrayZd().get(1).toString());
        assertEquals("1.95",Dfhcommarea.getCArrayZd().get(2).toString());

        assertEquals("9998",Dfhcommarea.getCArrayZi().get(0).toString());
        assertEquals("0",Dfhcommarea.getCArrayZi().get(1).toString());
        assertEquals("178",Dfhcommarea.getCArrayZi().get(2).toString());

        assertEquals("999899998",Dfhcommarea.getCArrayBi().get(0).toString());
        assertEquals("676767",Dfhcommarea.getCArrayBi().get(1).toString());
        assertEquals("36789013",Dfhcommarea.getCArrayBi().get(2).toString());

        assertEquals("123456789012345678",Dfhcommarea.getCArrayNi().get(0).toString());
        assertEquals("6767679998",Dfhcommarea.getCArrayNi().get(1).toString());
        assertEquals("36789184",Dfhcommarea.getCArrayNi().get(2).toString());
    }
}
