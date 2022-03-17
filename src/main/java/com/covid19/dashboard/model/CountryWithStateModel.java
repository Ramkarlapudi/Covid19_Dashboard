package com.covid19.dashboard.model;

import java.util.List;

public class CountryWithStateModel {
	
	public AllCountriesData CountryData;
	
	public List<StateWiseData> stateWiseData;

	public CountryWithStateModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AllCountriesData getCountryData() {
		return CountryData;
	}

	public void setCountryData(AllCountriesData countryData) {
		CountryData = countryData;
	}

	public List<StateWiseData> getStateWiseData() {
		return stateWiseData;
	}

	public void setStateWiseData(List<StateWiseData> stateWiseData) {
		this.stateWiseData = stateWiseData;
	}
	
	

}
