/*******************************************************************************
 * Copyright (c) 2011, 2012 IBM Corporation and Others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.actf.ai.scripteditor.data.event;

import java.util.Collection;
import java.util.EventObject;

import org.eclipse.actf.ai.scripteditor.data.IScriptData;

public class ScriptDataEvent extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1860351762555451972L;

	public static final int CLEAR = 0;
	public static final int ADD = 1;
	public static final int MULTIPLE_ADD = 2;
	public static final int DELETE = 3;
	// multiple remove?

	public static final int UPDATE = 10;
	public static final int MULTIPLE_UPDATE = 11;

	public static final int SELECT = 20;
	public static final int MULTIPLE_SELECT = 21;
	public static final int DESELECT = 22;

	public static final int PLAY = 33;
	// TODO play fin, select multi


	private int eventType;
	private IScriptData data = null;
	private Collection<IScriptData> cData = null;

	public ScriptDataEvent(int eventType, Object source) {
		super(source);
		this.eventType = eventType;
	}

	public ScriptDataEvent(int eventType, IScriptData data, Object source) {
		super(source);
		this.eventType = eventType;
		this.data = data;
	}

	public ScriptDataEvent(int eventType, Collection<IScriptData> cData,
			Object source) {
		super(source);
		this.eventType = eventType;
		this.cData = cData;
	}

	public int getEventType() {
		return eventType;
	}

	public IScriptData getData() {
		return data;
	}

	public Collection<IScriptData> getDataCollection() {
		return cData;
	}

}
