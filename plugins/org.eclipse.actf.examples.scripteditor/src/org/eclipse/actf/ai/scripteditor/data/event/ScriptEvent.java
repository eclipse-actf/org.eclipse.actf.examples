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

public class ScriptEvent extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1860351762555451972L;

	public static final int CLEAR_DATA = 0;
	public static final int SELECT_DATA = 1;
	public static final int DESELECT_DATA = 2;
	public static final int PLAY_DATA = 3;
	// TODO play fin

	// Migrate from AudioEvent
	public static final int ADD_DATA = 5;
	public static final int ADD_MULTIPUL_DATA = 6;
	public static final int DELETE_DATA = 7;
	// TODO multiple remove?

	public static final int UPDATE_DATA = 9;
	public static final int UPDATE_MULTIPUL_DATA = 10;

	private int eventType;
	private IScriptData data = null;
	private Collection<IScriptData> cData = null;

	public ScriptEvent(int eventType, Object source) {
		super(source);
		this.eventType = eventType;
	}

	public ScriptEvent(int eventType, IScriptData data, Object source) {
		super(source);
		this.eventType = eventType;
		this.data = data;
	}

	public ScriptEvent(int eventType, Collection<IScriptData> cData,
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
