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

package org.jdmp.lucene;

import static org.junit.Assert.assertEquals;

import org.jdmp.core.dataset.ListDataSet;
import org.junit.Test;

public class TestLuceneIndex {

	@Test
	public void testExampleSearch() throws Exception {
		ListDataSet ds = ListDataSet.Factory.IRIS();
		LuceneIndex index = new LuceneIndex();
		index.add(ds);
		ListDataSet result = index.search("setosa");
		assertEquals(50, result.size());
		index.close();
	}

}
