package com.covid19.dashboard.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Countriesstat {

	@JsonProperty("country_name")
	private String countryname;
	 @JsonProperty("cases")
	private String cases;
	@JsonProperty("deaths")
	private String deaths;
	 @JsonProperty("region")
	private String region;
	 @JsonProperty("total_recovered")
	private String totalrecovered;
	 @JsonProperty("new_deaths")
	private String newdeaths;
	 @JsonProperty("new_cases")
	private String newcases;
	 @JsonProperty("serious_critical")
	private String seriouscritical;
	 @JsonProperty("active_cases")
	private String activecases;
	 @JsonProperty("total_cases_per_1m_population")
	private String totalcasesper1Mpopulation;
	 @JsonProperty("deaths_per_1m_population")
	private String deathsper1Mpopulation;
	 @JsonProperty("total_tests")
	private String totaltests;
	 @JsonProperty("tests_per_1m_population")
	private String testsper1Mpopulation;
	
	

	public Countriesstat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String value) {
		this.countryname = value;
	}

	public String getCases() {
		return cases;
	}

	public void setCases(String value) {
		this.cases = value;
	}

	public String getDeaths() {
		return deaths;
	}

	public void setDeaths(String value) {
		this.deaths = value;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String value) {
		this.region = value;
	}

	public String getTotalrecovered() {
		return totalrecovered;
	}

	public void setTotalrecovered(String value) {
		this.totalrecovered = value;
	}

	public String getNewdeaths() {
		return newdeaths;
	}

	public void setNewdeaths(String value) {
		this.newdeaths = value;
	}

	public String getNewcases() {
		return newcases;
	}

	public void setNewcases(String value) {
		this.newcases = value;
	}

	public String getSeriouscritical() {
		return seriouscritical;
	}

	public void setSeriouscritical(String value) {
		this.seriouscritical = value;
	}

	public String getActivecases() {
		return activecases;
	}

	public void setActivecases(String value) {
		this.activecases = value;
	}

	public String getTotalcasesper1Mpopulation() {
		return totalcasesper1Mpopulation;
	}

	public void setTotalcasesper1Mpopulation(String value) {
		this.totalcasesper1Mpopulation = value;
	}

	public String getDeathsper1Mpopulation() {
		return deathsper1Mpopulation;
	}

	public void setDeathsper1Mpopulation(String value) {
		this.deathsper1Mpopulation = value;
	}

	public String getTotaltests() {
		return totaltests;
	}

	public void setTotaltests(String value) {
		this.totaltests = value;
	}

	public String getTestsper1Mpopulation() {
		return testsper1Mpopulation;
	}

	public void setTestsper1Mpopulation(String value) {
		this.testsper1Mpopulation = value;
	}

}
