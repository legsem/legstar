package com.legstar.test.cixs;

import com.legstar.test.cixs.lsfileac.LsfileacFault;
import com.legstar.test.cixs.lsfileac.LsfileacImpl;
import com.legstar.test.cixs.lsfileac.LsfileacRequestHolder;
import com.legstar.test.cixs.lsfileac.LsfileacResponseHolder;
import com.legstar.test.cixs.lsfileac.LsfileacHostHeader;
import com.legstar.test.coxb.LsfileacCases;
import com.legstar.test.coxb.lsfileac.QueryData;
import com.legstar.test.coxb.lsfileac.QueryLimit;

import junit.framework.TestCase;

/**
 * Test LSFILEAC adapter.
 *
 */
public class LsfileacTest extends TestCase {
    
    /**
     * Direct host invoke.
     * @throws LsfileacFault if test fails
     */
    public void testLsfileacRequestSStar() throws LsfileacFault {
        LsfileacImpl port = new LsfileacImpl();
        QueryData queryData = LsfileacCases.getJavaObjectQueryData();
        QueryLimit queryLimit = LsfileacCases.getJavaObjectQueryLimit();
        LsfileacRequestHolder request = new LsfileacRequestHolder();
        request.setQueryData(queryData);
        request.setQueryLimit(queryLimit);
        LsfileacHostHeader header = new LsfileacHostHeader();
        header.setHostEndPoint("CICSTS31");
        LsfileacResponseHolder reply = port.lsfileac(request, header);
        LsfileacCases.checkJavaObjectReplyData(reply.getReplyData());
        LsfileacCases.checkJavaObjectReplyStatus(reply.getReplyStatus());
    }

}