/*******************************************************************************
 * Copyright (c) 2008 LegSem.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     LegSem - initial API and implementation
 ******************************************************************************/
package com.legstar.xsdc.test.cases.cultureinfo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "cultureInfoParameters")
public class CultureInfoRequest {
	
	private BigDecimal mDecimalNumber;
	private String mCultureCode;
	/**
	 * @return the Culture Code
	 */
	public final String getCultureCode() {
		return mCultureCode;
	}
	/**
	 * @param culturecode the Culture Code to set
	 */
	public final void setCultureCode(String culturecode) {
		mCultureCode = culturecode;
	}
	/**
	 * @return the DecimalNumber
	 */
	public final BigDecimal getDecimalNumber() {
		return mDecimalNumber;
	}
	/**
	 * @param DecimalNumber the DecimalNumber to set
	 */
	public final void setDecimalNumber(BigDecimal DecimalNumber) {
		mDecimalNumber = DecimalNumber;
	}

}
