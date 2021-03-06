package com.binomed.sqli.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtUserGroupSqli implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or returns an error.
	 */

	@Override
	public void onModuleLoad() {
		// Load and initialize the window
		DOM.removeChild(RootPanel.getBodyElement(), DOM.getElementById("loading"));
		GWT.create(IClientFactory.class);

	}
}
