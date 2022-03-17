package com.covid19.dashboard.service;

import java.util.List;

import com.covid19.dashboard.model.AllCountriesData;
import com.covid19.dashboard.model.CaseswithVaccinationData;
import com.covid19.dashboard.model.CountryWithStateModel;
import com.covid19.dashboard.model.WorldCovidStats;
import com.covid19.dashboard.model.WorldStatistics;

public interface CovidStatistics {
	public List<WorldCovidStats> getWorldData();
	
	public List<AllCountriesData> getAllCountriesData();
	
	public CountryWithStateModel getCountryWiseData(String countryName);
	
	public List<WorldStatistics> getWorldStatistics();
	
	public List<CaseswithVaccinationData> getCovidVaccinationstats(); 

}
