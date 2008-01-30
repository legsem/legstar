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
package com.legstar.messaging;

import java.io.InputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * Messages represents the input and output of requests. A message is composed
 * of message parts: one header part and any number of data message parts.
 */
public class LegStarMessage {
	
	/** Header message part. */
	private LegStarHeaderPart mHeaderPart;
	
	/** Data message parts. */
	private List < LegStarMessagePart > mDataParts;

	/**
	 * Creates an empty message.
	 * @throws HeaderPartException if host encoding is wrong
	 */
	public LegStarMessage() throws HeaderPartException {
		mHeaderPart = new LegStarHeaderPart();
		mDataParts = new ArrayList < LegStarMessagePart >();
	}
	
	/**
	 * Construct a message from its message parts.
	 * @param headerPart the header message part
	 * @param dataParts the data message parts
	 */
	public LegStarMessage(
			final LegStarHeaderPart headerPart,
			final List < LegStarMessagePart > dataParts) {
		mHeaderPart = headerPart;
		mDataParts = dataParts;
	}
	
	/**
	 * Streaming an entire message is equivalent to streaming its header part
	 * followed by each of the data parts.
	 * @return an input stream
	 * @throws UnsupportedEncodingException if conversion fails
	 */
	public final InputStream sendToHost() throws UnsupportedEncodingException {
		Vector < InputStream > v = new Vector < InputStream >();
		v.add(mHeaderPart.sendToHost());
		for (LegStarMessagePart part : mDataParts) {
			v.add(part.sendToHost());
		}
		Enumeration < InputStream > e = v.elements();
		return new SequenceInputStream(e);
	}

	/**
	 * Recreates the message by creating each part.
	 * @param hostStream the host byte stream
	 * @throws HostReceiveException if creation fails
	 */
	public final void recvFromHost(
			final InputStream hostStream) throws HostReceiveException {
		mDataParts = new ArrayList < LegStarMessagePart >(); 
		mHeaderPart.recvFromHost(hostStream);
		for (int i = 0; i < mHeaderPart.getDataPartsNumber(); i++) {
			LegStarMessagePart part = new LegStarMessagePart();
			part.recvFromHost(hostStream);
			mDataParts.add(part);
		}
	}

	/**
	 * @return the size in bytes of this message host serialization
	 */
	public final int getHostSize() {
		int size = mHeaderPart.getHostSize();
		for (LegStarMessagePart part : mDataParts) {
			size += part.getHostSize();
		}
		return size;
	}
	
	/**
	 * @return the list of data message parts
	 */
	public final List < LegStarMessagePart > getDataParts() {
		return mDataParts;
	}
	
	/**
	 * @param dataParts the list of data message parts to set
	 */
	public final void setDataParts(
			final List < LegStarMessagePart > dataParts) {
		mDataParts = dataParts;
	}

	/**
	 * @return the header message part
	 */
	public final LegStarHeaderPart getHeaderPart() {
		return mHeaderPart;
	}

	/**
	 * @param headerPart the header message part to set
	 */
	public final void setHeaderPart(final LegStarHeaderPart headerPart) {
		mHeaderPart = headerPart;
	}

}
