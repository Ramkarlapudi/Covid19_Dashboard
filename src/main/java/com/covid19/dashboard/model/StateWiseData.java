package com.covid19.dashboard.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class StateWiseData {

	public String date;
    public int confirmed_diff;
    public String iso;
    public double fatality_rate;
    public int active;
    public int confirmed;
    @JsonProperty("TwoLetterSymbol") 
    public Object twoLetterSymbol;
    public int active_diff;
    public int deaths_diff;
    public int recovered;
    public String province;
    public int recovered_diff;
    @JsonProperty("Recovery_Proporation") 
    public double recovery_Proporation;
    @JsonProperty("Case_Fatality_Rate") 
    public double case_Fatality_Rate;
    public String name;
    public int deaths;
    
    
	public StateWiseData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getConfirmed_diff() {
		return confirmed_diff;
	}
	public void setConfirmed_diff(int confirmed_diff) {
		this.confirmed_diff = confirmed_diff;
	}
	public String getIso() {
		return iso;
	}
	public void setIso(String iso) {
		this.iso = iso;
	}
	public double getFatality_rate() {
		return fatality_rate;
	}
	public void setFatality_rate(double fatality_rate) {
		this.fatality_rate = fatality_rate;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}
	public Object getTwoLetterSymbol() {
		return twoLetterSymbol;
	}
	public void setTwoLetterSymbol(Object twoLetterSymbol) {
		this.twoLetterSymbol = twoLetterSymbol;
	}
	public int getActive_diff() {
		return active_diff;
	}
	public void setActive_diff(int active_diff) {
		this.active_diff = active_diff;
	}
	public int getDeaths_diff() {
		return deaths_diff;
	}
	public void setDeaths_diff(int deaths_diff) {
		this.deaths_diff = deaths_diff;
	}
	public int getRecovered() {
		return recovered;
	}
	public void setRecovered(int recovered) {
		this.recovered = recovered;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public int getRecovered_diff() {
		return recovered_diff;
	}
	public void setRecovered_diff(int recovered_diff) {
		this.recovered_diff = recovered_diff;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
    
    
}
