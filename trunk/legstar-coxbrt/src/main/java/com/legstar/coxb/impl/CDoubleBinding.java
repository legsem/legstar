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
package com.legstar.coxb.impl;

import java.math.BigDecimal;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.ICobolDoubleBinding;
import com.legstar.coxb.CobolElementVisitor;
import com.legstar.coxb.common.CBinding;
import com.legstar.coxb.host.HostException;

/**
 * This class implements the behavior of a comp-2 cobol element bound to
 * a JAXB Double property.
 *
 * @author Fady Moussallam
 * 
*/
public class CDoubleBinding	extends CBinding
	implements ICobolDoubleBinding {
	
	/** The current value for this element. */
	private Double mValue = null;
	
	/**
	 * Constructor for a cobol element to java binding.
	 * 
	 * @param bindingName the identifier for this binding
	 * @param jaxbName the name of the bound java property
	 * @param jaxbType the type of the bound java property
	 * @param cobolAnnotations the cobol annotations for this element
	 * @param parentBinding a reference to the parent binding
	 */
	public CDoubleBinding(
			final String bindingName,
			final String jaxbName,
			final Class < ? > jaxbType,
			final CobolElement cobolAnnotations,
			final ICobolComplexBinding parentBinding) {
		super(bindingName, jaxbName, jaxbType, cobolAnnotations, parentBinding);
	}

	/** {@inheritDoc} */
	public final void accept(final CobolElementVisitor cev)
		throws HostException {
		cev.visit(this);
	}
	
	/** {@inheritDoc} */
	public final Double getDoubleValue() throws HostException {
		return mValue;
	}

	/** {@inheritDoc} */
	public final void setDoubleValue(final Double value) throws HostException {
		mValue = value;
	}

	/** {@inheritDoc} */
	public final BigDecimal getBigDecimalValue() throws HostException {
		return new BigDecimal(mValue);
	}

	/** {@inheritDoc} */
	public final void setBigDecimalValue(
			final BigDecimal value) throws HostException {
		mValue = value.doubleValue();
	}

	/** {@inheritDoc} */
	public final int calcByteLength() throws HostException {
		return getByteLength();
	}
	
	/** {@inheritDoc} */
	public final Object getObjectValue(
			final Class < ? > type) throws HostException {
		if (type.equals(Double.class) || type.equals(double.class)) {
			return mValue;
		} else if (type.equals(BigDecimal.class)) {
			return getBigDecimalValue();
		} else {
			throw new HostException("Attempt to get binding " + getBindingName()
					+ " as an incompatible type " + type);
		}
	}

	/** {@inheritDoc} */
	public final void setObjectValue(final Object value) throws HostException {
		if (value == null) {
			mValue = null;
			return;
		}
		if (value instanceof Double) {
			 mValue = (Double) value;
		} else if (value instanceof BigDecimal) {
			setBigDecimalValue((BigDecimal) value);
		} else {
			throw new HostException("Attempt to set binding " + getBindingName()
					+ " from an incompatible value " + value);
		}
	}

	/** {@inheritDoc} */
	public final boolean isSet() {
		return (mValue != null);
	}
}
