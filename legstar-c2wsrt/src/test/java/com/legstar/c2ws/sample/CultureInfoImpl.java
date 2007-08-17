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
package com.legstar.c2ws.sample;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

import javax.jws.WebService;

@WebService
public class CultureInfoImpl {
	
	public CultureInfoReply getInfo(
			CultureInfoRequest request) throws CultureInfoException {
		
		/* Validate request */
		if (request.getCultureCode() == null
				|| request.getCultureCode().length() == 0) {
			throw new CultureInfoException("You must provide a CultureInfo");
		}
		/* Format of CultureInfo is expected to be xx-yy*/
		if ((request.getCultureCode().length() != 5)
				|| (request.getCultureCode().charAt(2) != '-')) {
			throw new CultureInfoException("CultureInfo " + request.getCultureCode()
					+ " does not conform to xx-yy format");
		}
		CultureInfoReply reply = new CultureInfoReply();
		
		Locale locale = new Locale(
				request.getCultureCode().substring(0,2),
				request.getCultureCode().substring(3,5));
		
		/* return corresponding language and country */
		reply.setDisplayLanguage(locale.getDisplayLanguage());
		reply.setDisplayCountry(locale.getDisplayCountry());
		
		/* Format date and time  */
		Date date = new Date();
		reply.setFormattedDate(
				DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL,
						locale).format(date));
		
		/* Get the currency code */
		reply.setCurrencySymbol(Currency.getInstance(locale).getSymbol());
		
		/* Format a decimal number */
		NumberFormat nf = NumberFormat.getInstance(locale);
		reply.setFormattedDecimalNumber(nf.format(request.getDecimalNumber()));
		
		/* Extract server locale and culture info */
		Locale serverLocale = Locale.getDefault();
		ServerCultureInfo serverCultureInfo = new ServerCultureInfo();
		serverCultureInfo.setDisplayCountry(serverLocale.getDisplayCountry());
		serverCultureInfo.setDisplayLanguage(serverLocale.getDisplayLanguage());
		serverCultureInfo.setCultureCode(
				serverLocale.getLanguage() + '-' + serverLocale.getCountry());
		reply.setServerCultureInfo(serverCultureInfo);
		
		return reply;
	}
}
