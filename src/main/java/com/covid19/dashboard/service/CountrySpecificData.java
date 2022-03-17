package com.covid19.dashboard.service;

import com.covid19.dashboard.model.CountrySpecificModel;

public interface CountrySpecificData {
	public CountrySpecificModel[] getCovidData(String iso , String countryName );

}
