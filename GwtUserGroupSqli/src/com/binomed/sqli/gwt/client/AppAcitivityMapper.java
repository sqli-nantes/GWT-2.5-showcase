package com.binomed.sqli.gwt.client;

import com.binomed.sqli.gwt.client.place.CalendarPlace;
import com.binomed.sqli.gwt.client.place.CreateUserPlace;
import com.binomed.sqli.gwt.client.place.EventPlace;
import com.binomed.sqli.gwt.client.place.LoginPlace;
import com.binomed.sqli.gwt.client.presenter.CalendarActivity;
import com.binomed.sqli.gwt.client.presenter.CreateUserActivity;
import com.binomed.sqli.gwt.client.presenter.EventActivity;
import com.binomed.sqli.gwt.client.presenter.LoginActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class AppAcitivityMapper implements ActivityMapper {

	private final IClientFactory clientFactory;

	public AppAcitivityMapper(IClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof LoginPlace) {
			return new LoginActivity(clientFactory);
		}
		if (place instanceof CreateUserPlace) {
			return new CreateUserActivity(clientFactory);
		}
		if (place instanceof CalendarPlace) {
			return new CalendarActivity(clientFactory);
		}
		if (place instanceof EventPlace) {
			return new EventActivity(clientFactory);
		}
		return null;
	}
}
