package com.covid19.dashboard.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyArray {

	
	public MyArray() {
		super();
		// TODO Auto-generated constructor stub
	}
	@JsonProperty("NewRecovered") 
    public int newRecovered;
    @JsonProperty("Infection_Risk") 
    public double infection_Risk;
    @JsonProperty("TotCases_1M_Pop") 
    public int totCases_1M_Pop;
    public int one_Testevery_X_ppl;
    @JsonProperty("TotalCases") 
    public int totalCases;
    @JsonProperty("Tests_1M_Pop") 
    public int tests_1M_Pop;
    @JsonProperty("Deaths_1M_pop") 
    public int deaths_1M_pop;
    @JsonProperty("ActiveCases") 
    public int activeCases;
    public int one_Caseevery_X_ppl;
    @JsonProperty("Recovery_Proporation") 
    public double recovery_Proporation;
    @JsonProperty("Case_Fatality_Rate") 
    public double case_Fatality_Rate;
    @JsonProperty("Serious_Critical") 
    public int serious_Critical;
    public int rank;
    @JsonProperty("Population") 
    public String population;
    public String id;
    @JsonProperty("TotalDeaths") 
    public int totalDeaths;
    @JsonProperty("NewDeaths") 
    public int newDeaths;
    @JsonProperty("TotalRecovered") 
    public String totalRecovered;
    public int one_Deathevery_X_ppl;
    @JsonProperty("TwoLetterSymbol") 
    public String twoLetterSymbol;
    @JsonProperty("Continent") 
    public String continent;
    @JsonProperty("Country") 
    public String country;
    @JsonProperty("TotalTests") 
    public String totalTests;
    @JsonProperty("NewCases") 
    public int newCases;
    @JsonProperty("ThreeLetterSymbol") 
    public String threeLetterSymbol;
    @JsonProperty("Test_Percentage") 
    public double test_Percentage;
	public int getNewRecovered() {
		return newRecovered;
	}
	public void setNewRecovered(int newRecovered) {
		this.newRecovered = newRecovered;
	}
	public double getInfection_Risk() {
		return infection_Risk;
	}
	public void setInfection_Risk(double infection_Risk) {
		this.infection_Risk = infection_Risk;
	}
	public int getTotCases_1M_Pop() {
		return totCases_1M_Pop;
	}
	public void setTotCases_1M_Pop(int totCases_1M_Pop) {
		this.totCases_1M_Pop = totCases_1M_Pop;
	}
	public int getOne_Testevery_X_ppl() {
		return one_Testevery_X_ppl;
	}
	public void setOne_Testevery_X_ppl(int one_Testevery_X_ppl) {
		this.one_Testevery_X_ppl = one_Testevery_X_ppl;
	}
	public int getTotalCases() {
		return totalCases;
	}
	public void setTotalCases(int totalCases) {
		this.totalCases = totalCases;
	}
	public int getTests_1M_Pop() {
		return tests_1M_Pop;
	}
	public void setTests_1M_Pop(int tests_1m_Pop) {
		tests_1M_Pop = tests_1m_Pop;
	}
	public int getDeaths_1M_pop() {
		return deaths_1M_pop;
	}
	public void setDeaths_1M_pop(int deaths_1m_pop) {
		deaths_1M_pop = deaths_1m_pop;
	}
	public int getActiveCases() {
		return activeCases;
	}
	public void setActiveCases(int activeCases) {
		this.activeCases = activeCases;
	}
	public int getOne_Caseevery_X_ppl() {
		return one_Caseevery_X_ppl;
	}
	public void setOne_Caseevery_X_ppl(int one_Caseevery_X_ppl) {
		this.one_Caseevery_X_ppl = one_Caseevery_X_ppl;
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
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTotalDeaths() {
		return totalDeaths;
	}
	public void setTotalDeaths(int totalDeaths) {
		this.totalDeaths = totalDeaths;
	}
	public int getNewDeaths() {
		return newDeaths;
	}
	public void setNewDeaths(int newDeaths) {
		this.newDeaths = newDeaths;
	}
	public String getTotalRecovered() {
		return totalRecovered;
	}
	public void setTotalRecovered(String totalRecovered) {
		this.totalRecovered = totalRecovered;
	}
	public int getOne_Deathevery_X_ppl() {
		return one_Deathevery_X_ppl;
	}
	public void setOne_Deathevery_X_ppl(int one_Deathevery_X_ppl) {
		this.one_Deathevery_X_ppl = one_Deathevery_X_ppl;
	}
	public String getTwoLetterSymbol() {
		return twoLetterSymbol;
	}
	public void setTwoLetterSymbol(String twoLetterSymbol) {
		this.twoLetterSymbol = twoLetterSymbol;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTotalTests() {
		return totalTests;
	}
	public void setTotalTests(String totalTests) {
		this.totalTests = totalTests;
	}
	public int getNewCases() {
		return newCases;
	}
	public void setNewCases(int newCases) {
		this.newCases = newCases;
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
