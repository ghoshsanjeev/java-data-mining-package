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

package org.jdmp.gui.sample;

import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jdmp.core.sample.Sample;
import org.ujmp.gui.AbstractGUIObject;

public class SampleGUIObject extends AbstractGUIObject {
	private static final long serialVersionUID = -3436220704455373493L;

	private Sample sample = null;

	private transient JFrame frame = null;

	private transient JPanel panel = null;

	public SampleGUIObject(Sample s) {
		this.sample = s;
	}

	public void clear() {
	}

	public Image getIcon() {
		return null;
	}

	public String getLabel() {
		return sample.getLabel();
	}

	public void setLabel(Object label) {
		sample.setLabel(label);
	}

	public String getDescription() {
		return sample.getDescription();
	}

	public void setDescription(String description) {
		sample.setDescription(description);
	}

	public Object getLabelObject() {
		return sample.getLabelObject();
	}

	public String toString() {
		return sample.toString();
	}

	public Sample getCoreObject() {
		return sample;
	}

	public JFrame getFrame() {
		if (frame == null) {
			frame = new SampleFrame(this);
		}
		return frame;
	}

	public JPanel getPanel() {
		if (panel == null) {
			panel = new SamplePanel(this);
		}
		return panel;
	}

}
