package com.covid19.dashboard.util;

public interface APIUrls {
	// API source https://rapidapi.com/vaccovidlive-vaccovidlive-default/api/vaccovid-coronavirus-vaccine-and-treatment-tracker/   || get specific country covid-19 data
	public String specificCountryData = "https://vaccovid-coronavirus-vaccine-and-treatment-tracker.p.rapidapi.com/api/npm-covid-data/country-report-iso-based";
	public String apiKey ="e0c34d9a36msh7bb0545fbfa765cp1f416cjsn72c335f15dc6";
	public String apiHost = "vaccovid-coronavirus-vaccine-and-treatment-tracker.p.rapidapi.com";
	
	public String getWorldData ="https://vaccovid-coronavirus-vaccine-and-treatment-tracker.p.rapidapi.com/api/npm-covid-data/world";
	public String worldDataapiKey ="e0c34d9a36msh7bb0545fbfa765cp1f416cjsn72c335f15dc6";
	
	public String allCountriesData = "https://vaccovid-coronavirus-vaccine-and-treatment-tracker.p.rapidapi.com/api/npm-covid-data/countries";
	public String ISOCodes = "https://vaccovid-coronavirus-vaccine-and-treatment-tracker.p.rapidapi.com/api/npm-covid-data/countries-name-ordered";
	
	public String stateWiseData = "https://vaccovid-coronavirus-vaccine-and-treatment-tracker.p.rapidapi.com/api/api-covid-data/reports";
	
	
	//
	public String cases_by_country_stats = "https://coronavirus-monitor.p.rapidapi.com/coronavirus/cases_by_country.php";
	public String cm_apihost = "coronavirus-monitor.p.rapidapi.com";
	public String cm_apiKey = "e0c34d9a36msh7bb0545fbfa765cp1f416cjsn72c335f15dc6";
	
	public String worldStatistics =  "https://coronavirus-monitor.p.rapidapi.com/coronavirus/worldstat.php";
		
}
