/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and Others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.actf.examples.scripteditor.actions;

import org.eclipse.actf.ai.internal.ui.scripteditor.event.EventManager;
import org.eclipse.actf.ai.internal.ui.scripteditor.event.PlayerControlEvent;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class MoviePlayAction implements IWorkbenchWindowActionDelegate {

	/**
	 * The constructor.
	 */
	public MoviePlayAction() {
	}

	public void run(IAction action) {
		EventManager.getInstance().firePlayerControlEvent(new PlayerControlEvent(this));
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	public void dispose() {
	}

	public void init(IWorkbenchWindow window) {
	}

}