package com.covid19.dashboard.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class AllCountriesData {
	
	@JsonProperty("NewRecovered") 
    public int newRecovered;
    @JsonProperty("NewDeaths") 
    public int newDeaths;
    @JsonProperty("TotalRecovered") 
    public int totalRecovered;
    @JsonProperty("Infection_Risk") 
    public double infection_Risk;
    @JsonProperty("TotalCases") 
    public int totalCases;
    @JsonProperty("TwoLetterSymbol") 
    public String twoLetterSymbol;
    @JsonProperty("ActiveCases") 
    public int activeCases;
    @JsonProperty("Recovery_Proporation") 
    public double recovery_Proporation;
    @JsonProperty("Case_Fatality_Rate") 
    public double case_Fatality_Rate;
    @JsonProperty("Serious_Critical") 
    public int serious_Critical;
    @JsonProperty("Country") 
    public String country;
    @JsonProperty("TotalTests") 
    public int totalTests;
    @JsonProperty("Population") 
    public int population;
    @JsonProperty("NewCases") 
    public int newCases;
    @JsonProperty("TotalDeaths") 
    public int totalDeaths;
    @JsonProperty("ThreeLetterSymbol") 
    public String threeLetterSymbol;
    @JsonProperty("Test_Percentage") 
    public double test_Percentage;
	public AllCountriesData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNewRecovered() {
		return newRecovered;
	}
	public void setNewRecovered(int newRecovered) {
		this.newRecovered = newRecovered;
	}
	public int getNewDeaths() {
		return newDeaths;
	}
	public void setNewDeaths(int newDeaths) {
		this.newDeaths = newDeaths;
	}
	public int getTotalRecovered() {
		return totalRecovered;
	}
	public void setTotalRecovered(int totalRecovered) {
		this.totalRecovered = totalRecovered;
	}
	public double getInfection_Risk() {
		return infection_Risk;
	}
	public void setInfection_Risk(double infection_Risk) {
		this.infection_Risk = infection_Risk;
	}
	public int getTotalCases() {
		return totalCases;
	}
	public void setTotalCases(int totalCases) {
		this.totalCases = totalCases;
	}
	public String getTwoLetterSymbol() {
		return twoLetterSymbol;
	}
	public void setTwoLetterSymbol(String twoLetterSymbol) {
		this.twoLetterSymbol = twoLetterSymbol;
	}
	public int getActiveCases() {
		return activeCases;
	}
	public void setActiveCases(int activeCases) {
		this.activeCases = activeCases;
	}
	public double getRecovery_Proporation() {
		return recovery_Proporation;
	}
	public void setRecovery_Proporation(double recovery_Proporation) {
		this.recovery_Proporation = recovery_Proporation;
	}
	public double getCase_Fatality_Rate() {
		return case_Fatality_Rate;
	}
	public void setCase_Fatality_Rate(double case_Fatality_Rate) {
		this.case_Fatality_Rate = case_Fatality_Rate;
	}
	public int getSerious_Critical() {
		return serious_Critical;
	}
	public void setSerious_Critical(int serious_Critical) {
		this.serious_Critical = serious_Critical;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getTotalTests() {
		return totalTests;
	}
	public void setTotalTests(int totalTests) {
		this.totalTests = totalTests;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getNewCases() {
		return newCases;
	}
	public void setNewCases(int newCases) {
		this.newCases = newCases;
	}
	public int getTotalDeaths() {
		return totalDeaths;
	}
	public void setTotalDeaths(int totalDeaths) {
		this.totalDeaths = totalDeaths;
	}
	public String getThreeLetterSymbol() {
		return threeLetterSymbol;
	}
	public void setThreeLetterSymbol(String threeLetterSymbol) {
		this.threeLetterSymbol = threeLetterSymbol;
	}
	public double getTest_Percentage() {
		return test_Percentage;
	}
	public void setTest_Percentage(double test_Percentage) {
		this.test_Percentage = test_Percentage;
	}
    
    
    

}
