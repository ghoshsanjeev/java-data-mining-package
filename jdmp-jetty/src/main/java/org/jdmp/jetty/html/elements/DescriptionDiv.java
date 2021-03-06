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

package org.jdmp.jetty.html.elements;

import org.jdmp.jetty.html.EmphasizedText;
import org.jdmp.jetty.html.tags.DivTag;

public class DescriptionDiv extends DivTag {
	private static final long serialVersionUID = 4950854806202181784L;

	public DescriptionDiv(String description, String... highlightedWords) {
		setParameter("class", "description");
		if (description != null && description.length() > 0) {
			add(new EmphasizedText(description, highlightedWords));
		}
	}
}
