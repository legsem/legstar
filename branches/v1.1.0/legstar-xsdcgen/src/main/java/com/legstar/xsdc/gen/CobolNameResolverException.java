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
package com.legstar.xsdc.gen;

/**
 * Cobol name resolution exceptions.
 */
public class CobolNameResolverException extends Exception {
	
	/** Default serial ID. */
	private static final long serialVersionUID = 5089981853019789786L;
	/** 
	 * Constructor from an error message. 
	 * @param message the text message 
	 * */
	public CobolNameResolverException(final String message) {
		super(message);
	}
	/** 
	 * Constructor from an inner exception. 
	 * @param e the inner exception 
	 * */
	public CobolNameResolverException(final Exception e) {
		super(e);
	}

}
