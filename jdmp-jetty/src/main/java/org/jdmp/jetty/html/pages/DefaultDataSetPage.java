/*
 * Copyright (C) 2008-2016 by Holger Arndt
 *
 * This file is part of the Java Data Mining Package (JDMP).
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership and licensing.
 *
 * JDMP is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * JDMP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with JDMP; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin St, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.jdmp.jetty.html.pages;

import javax.servlet.http.HttpServletRequest;

import org.jdmp.core.dataset.ListDataSet;
import org.jdmp.jetty.html.Page;
import org.jdmp.jetty.html.tags.H1Tag;

public class DefaultDataSetPage extends Page {
	private static final long serialVersionUID = -2173854958860246122L;

	public DefaultDataSetPage(HttpServletRequest request, String path, ListDataSet dataSet, Object... parameters) {
		super();
		if (dataSet == null) {
			setTitle("JDMP Search: not found");
			add(new H1Tag("sample not found"));
		} else {
			setTitle("JDMP Search: " + dataSet.getLabel());
			add(new H1Tag(dataSet.getLabel()));
		}
	}

}
