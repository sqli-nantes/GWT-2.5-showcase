package com.binomed.sqli.gwt.client.view;

import com.binomed.sqli.gwt.client.presenter.itf.HomePresenter;
import com.github.gwtbootstrap.client.ui.Modal;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class HomeView extends Composite implements //
		com.binomed.sqli.gwt.client.presenter.HomeActivity.Display //
		, IsWidget//
{

	private static HomeViewUiBinder uiBinder = GWT.create(HomeViewUiBinder.class);

	@UiField
	Modal modal;
	@UiField
	SimplePanel mainContent;

	private final HomePresenter presenter;

	public HomeView(HomePresenter presenter) {
		// Initialization
		initWidget(uiBinder.createAndBindUi(this));
		this.presenter = presenter;
	}

	/*
	 * Events Part
	 */

	@UiHandler("aPropos")
	public void onAProposClick(ClickEvent event) {
		presenter.eventClick("A Propos");
	}

	@UiHandler("support")
	public void onSupportClick(ClickEvent event) {
		presenter.eventClick("Support");
	}

	@UiHandler("brand")
	public void onBrandClick(ClickEvent event) {
		presenter.brandClick();
	}

	public void showDialog(String content) {

		modal.setTitle(content);
		modal.show();

	}

	public AcceptsOneWidget registerMainPanel() {
		return mainContent;

	}

	interface HomeViewUiBinder extends UiBinder<Widget, HomeView> {
	}

	public Widget hasWidget() {
		return this;
	}

}