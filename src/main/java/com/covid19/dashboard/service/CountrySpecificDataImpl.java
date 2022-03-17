package com.covid19.dashboard.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.covid19.dashboard.controller.CovidDashboardController;
import com.covid19.dashboard.model.CountrySpecificModel;
import com.covid19.dashboard.model.Root;
import com.covid19.dashboard.util.APIUrls;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Service
public class CountrySpecificDataImpl implements CountrySpecificData, APIUrls {
	private static final Logger LOGGER = LogManager.getLogger(CountrySpecificDataImpl.class);
	private HttpResponse<JsonNode> response = null;

	@Override
	public CountrySpecificModel[] getCovidData(String iso, String countryName) {
		LOGGER.info("********* Entering into getCovidData Service *********");
		LOGGER.info("********* ISO" + iso +"countryName "+countryName+"*********");

		CountrySpecificModel[] countryspecificData = null;
		Gson gson = null;
		JSONObject jo = null;
		JSONArray myobj = null;
		try {
			String apiurl = specificCountryData + "/" + countryName + "/" + iso;
			System.out.println("URL *************" + apiurl);

			HttpResponse<JsonNode> response = Unirest.get(apiurl)
					.header("x-rapidapi-host", "vaccovid-coronavirus-vaccine-and-treatment-tracker.p.rapidapi.com")
					.header("x-rapidapi-key", "e0c34d9a36msh7bb0545fbfa765cp1f416cjsn72c335f15dc6").asJson();

			if(response.getStatus() == 404 && response.getStatus() == 500) {
				throw new Exception("Service is Down");
			}else if (response.getStatus() != 200) {
				throw new Exception("Service is Unavailable");
			}
			myobj = response.getBody().getArray();
			jo = new JSONObject();
			jo.put("result", myobj);
			System.out.println("result " + jo.get("result"));
			gson = new Gson();
			countryspecificData = gson.fromJson(jo.get("result").toString(), CountrySpecificModel[].class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.info("********* Exiting into getCovidData Service *********");
		return countryspecificData;
	}

}
