/*******************************************************************************
 * Copyright (c) 2010 LegSem.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     LegSem - initial API and implementation
 ******************************************************************************/
package com.legstar.test.coxb;



import com.legstar.coxb.host.HostData;
import com.legstar.test.coxb.lsfilead.bind.DfhcommareaHostToJavaTransformer;
import com.legstar.test.coxb.lsfilead.Dfhcommarea;

import junit.framework.TestCase;

/**
 * Unmarshal lsfilead.
 *
 */
public class UnmarshalLsfileadTest extends TestCase {

    /**
     * Unmarshal host data and test java data object result.
     * @throws Exception if marshaling fails
     */
    public void testLsfilead() throws Exception {

        String hexString = LsfileadCases.getHostBytesHex();
        byte[] hostBytes = HostData.toByteArray(hexString);

        Dfhcommarea dfhcommarea = (Dfhcommarea) Util.unmarshal(hostBytes, "lsfilead");
        LsfileadCases.checkJavaObject(dfhcommarea);
    }
    /**
     * Transform host data and test java data object result.
     * @throws Exception if transforming fails
     */
    public void testHostToJavaTransformer() throws Exception {

        DfhcommareaHostToJavaTransformer transformer = new DfhcommareaHostToJavaTransformer();
        Dfhcommarea dfhcommarea = transformer.transform(HostData.toByteArray(LsfileadCases.getHostBytesHex()));
        LsfileadCases.checkJavaObject(dfhcommarea);
    }
}
