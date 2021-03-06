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

package org.jdmp.gui.dataset.actions;

import java.awt.event.KeyEvent;

import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

import org.jdmp.core.dataset.ListDataSet;
import org.jdmp.core.dataset.HasDataSetMap;
import org.ujmp.core.enums.DBType;
import org.ujmp.core.interfaces.GUIObject;
import org.ujmp.gui.actions.AbstractObjectAction;

public class ImportDataSetFromDatabaseAction extends AbstractObjectAction {
	private static final long serialVersionUID = 1708309879911224591L;

	public ImportDataSetFromDatabaseAction(JComponent c, GUIObject m) {
		super(c, m);
		putValue(Action.NAME, "from Database...");
		putValue(Action.SHORT_DESCRIPTION, "import a dataset from a JDBC database");
		putValue(Action.MNEMONIC_KEY, KeyEvent.VK_D);
	}

	public Object call() {
		try {
			DBType type = DBType.values()[JOptionPane.showOptionDialog(getComponent(),
					"Select database type", "Import DataSet", JOptionPane.OK_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, DBType.values(), DBType.MySQL)];

			String host = null;
			while (host == null) {
				host = JOptionPane.showInputDialog("Enter host name:", "localhost");
			}
			int port = 0;
			while (port <= 0) {
				try {
					port = Integer.parseInt(JOptionPane.showInputDialog("Enter port:", "3306"));
				} catch (Exception e) {
				}
			}
			String database = null;
			while (database == null) {
				database = JOptionPane.showInputDialog("Enter database name:", null);
			}
			String sql = null;
			while (sql == null) {
				sql = JOptionPane.showInputDialog("Enter SQL statement:", "SELECT * FROM ");
			}
			String username = null;
			username = JOptionPane.showInputDialog("Enter user name:", "root");
			String password = null;
			password = JOptionPane.showInputDialog("Enter password:", null);

			ListDataSet ds = ListDataSet.Factory.importFromJDBC(type, host, port, database, sql, username,
					password);
			if (getCoreObject() instanceof HasDataSetMap) {
				try {
					((HasDataSetMap) getCoreObject()).getDataSetMap().add(ds);
				} catch (Exception e) {
					ds.showGUI();
				}
			} else {
				ds.showGUI();
			}
			return ds;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
