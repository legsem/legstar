/*******************************************************************************
 * Copyright (c) 2015 LegSem.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     LegSem - initial API and implementation
 ******************************************************************************/
package com.legstar.coxb.impl.reflect;

import com.legstar.test.coxb.EnumvarCases;
import com.legstar.test.coxb.enumvar.SearchRequestType;

/**
 * Test ENUMVAR.
 *
 */
public class UnmarshalEnumvarTest extends AbstractTestUnmarshal {
    /**
     * Unmarshal Enumvar.
     */
    public void testEnumvar() {
        SearchRequestType searchRequest = (SearchRequestType) convert(
                EnumvarCases.getFactory(),
                EnumvarCases.getHostBytesHex(),
                EnumvarCases.getJavaObject());
        EnumvarCases.checkJavaObject(searchRequest);
    }

}
