package com.covid19.dashboard.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {

	public ArrayList<MyArray> myArray;

	
	
	public Root() {
		super();
	}

	public Root(ArrayList<MyArray> myArray) {
		super();
		this.myArray = myArray;
	}

	public ArrayList<MyArray> getMyArray() {
		return myArray;
	}

	public void setMyArray(ArrayList<MyArray> myArray) {
		this.myArray = myArray;
	}
	
	
	

}
