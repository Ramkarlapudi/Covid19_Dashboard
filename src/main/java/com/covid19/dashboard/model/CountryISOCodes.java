package com.covid19.dashboard.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class CountryISOCodes {

	@JsonProperty("Country") 
    public String country;
    @JsonProperty("ThreeLetterSymbol") 
    public String threeLetterSymbol;
	
}
