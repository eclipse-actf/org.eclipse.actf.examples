/*******************************************************************************
 * Copyright (c) 2006, 2008 IBM Corporation and Others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Kentarou FUKUDA - initial API and implementation
 *******************************************************************************/

package org.eclipse.actf.examples.simplevisualizer.ui.perspectives;

import org.eclipse.actf.examples.simplevisualizer.ui.views.SimpleVisualizerView;
import org.eclipse.actf.visualization.ui.report.views.DetailedReportView;
import org.eclipse.actf.visualization.ui.report.views.SummaryReportView;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.PlatformUI;

public class HTMLPerspective implements IPerspectiveFactory {

	public static final String ID = HTMLPerspective.class.getName();

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);

		IFolderLayout reportFolder = layout.createFolder(
				"simplevizualizer.html.report.folder",
				IPageLayout.BOTTOM, 0.7f, editorArea);
		reportFolder.addView(SummaryReportView.ID);
		reportFolder.addView(DetailedReportView.ID);
		layout.getViewLayout(SummaryReportView.ID).setCloseable(false);
		layout.getViewLayout(DetailedReportView.ID).setCloseable(false);

		IFolderLayout simulatorFolder = layout.createFolder(
				"simplevizualizer.html.simulator.folder",
				IPageLayout.RIGHT, 0.5f, editorArea);
		simulatorFolder.addView(SimpleVisualizerView.ID);
		layout.getViewLayout(SimpleVisualizerView.ID).setCloseable(false);

		PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.addPerspectiveListener(
						new PerspectiveListenerForBrowserLaunch(ID));
	}
}