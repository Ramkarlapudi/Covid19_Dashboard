package com.covid19.dashboard.util;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import com.covid19.dashboard.model.AllCountriesData;
import com.covid19.dashboard.model.CaseswithVaccinationData;
import com.covid19.dashboard.model.CountryISOCodes;
import com.covid19.dashboard.model.StateWiseData;
import com.covid19.dashboard.model.WorldCovidStats;
import com.covid19.dashboard.model.WorldStatistics;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

@Component
public class APIUtil implements APIUrls {

	private static final Logger LOGGER = LogManager.getLogger(APIUtil.class);

	public List<WorldCovidStats> getWorldData() {
		LOGGER.info("*********Entering getWorldData API Call *********");

		ObjectMapper om = null;
		String resObject = null;
		List<WorldCovidStats> myObjectsS = null;
		try {
			String apiurl = getWorldData;
			System.out.println("URL *************" + apiurl);

			HttpResponse<JsonNode> response = Unirest.get(apiurl).header("x-rapidapi-host", apiHost)
					.header("x-rapidapi-key", apiKey).asJson();

			LOGGER.info("API Call Response :: " + response.getStatus() + " " + response.getBody().getArray());
			if (response.getStatus() == 404 && response.getStatus() == 500) {
				throw new Exception("Service is Down");
			} else if (response.getStatus() != 200) {
				throw new Exception("Service is Unavailable");
			}

			// Converting JSONNode to String
			resObject = response.getBody().toString();
			System.out.println("resObject " + resObject);
			om = new ObjectMapper();
			om.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
			om.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

			WorldCovidStats[] langs = om.readValue(resObject, WorldCovidStats[].class);
			// Converting String to List
			myObjectsS = Arrays.asList(langs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.info("*********Exiting getWorldData API Call *********");
		return myObjectsS;
	}

	public List<AllCountriesData> allCountriesData() {

		LOGGER.info("*********Entering allCountriesData API Call *********");

		ObjectMapper om = null;
		String resObject = null;
		List<AllCountriesData> myObjectsS = null;
		try {
			String apiurl = allCountriesData;
			System.out.println("URL *************" + apiurl);

			HttpResponse<JsonNode> response = Unirest.get(apiurl).header("x-rapidapi-host", apiHost)
					.header("x-rapidapi-key", apiKey).asJson();

			LOGGER.info("API Call Response :: " + response.getStatus() + " " + response.getBody().getArray());
			if (response.getStatus() == 404 && response.getStatus() == 500) {
				throw new Exception("Service is Down");
			} else if (response.getStatus() != 200) {
				throw new Exception("Service is Unavailable");
			}

			// Converting JSONNode to String
			resObject = response.getBody().toString();
			System.out.println("resObject " + resObject);
			om = new ObjectMapper();
			om.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
			om.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

			AllCountriesData[] langs = om.readValue(resObject, AllCountriesData[].class);
			// Converting String to List
			myObjectsS = Arrays.asList(langs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.info("*********Exiting allCountriesData API Call *********");
		return myObjectsS;

	}

	public List<CountryISOCodes> CountryISOCodes() {
		LOGGER.info("*********Entering CountryISOCodes API Call *********");

		ObjectMapper om = null;
		String resObject = null;
		List<CountryISOCodes> myObjectsS = null;
		try {
			String apiurl = ISOCodes;
			System.out.println("URL *************" + apiurl);

			HttpResponse<JsonNode> response = Unirest.get(apiurl).header("x-rapidapi-host", apiHost)
					.header("x-rapidapi-key", apiKey).asJson();

			LOGGER.info("API Call Response :: " + response.getStatus() + " " + response.getBody().getArray());
			if (response.getStatus() == 404 && response.getStatus() == 500) {
				throw new Exception("Service is Down");
			} else if (response.getStatus() != 200) {
				throw new Exception("Service is Unavailable");
			}

			// Converting JSONNode to String
			resObject = response.getBody().toString();
			System.out.println("resObject " + resObject);
			om = new ObjectMapper();
			om.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
			om.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

			CountryISOCodes[] langs = om.readValue(resObject, CountryISOCodes[].class);
			// Converting String to List
			myObjectsS = Arrays.asList(langs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.info("*********Exiting CountryISOCodes API Call *********");
		return myObjectsS;

	}

	public List<StateWiseData> stateWiseData(String countryName) {
		LOGGER.info("*********Entering CountryISOCodes API Call *********");

		ObjectMapper om = null;
		String resObject = null;
		List<StateWiseData> myObjectsS = null;
		try {
			String apiurl = stateWiseData + "/" + countryName;
			System.out.println("URL *************" + apiurl);

			HttpResponse<JsonNode> response = Unirest.get(apiurl).header("x-rapidapi-host", apiHost)
					.header("x-rapidapi-key", apiKey).asJson();

			LOGGER.info("API Call Response :: " + response.getStatus() + " " + response.getBody().getArray());
			if (response.getStatus() == 404 && response.getStatus() == 500) {
				throw new Exception("Service is Down");
			} else if (response.getStatus() != 200) {
				throw new Exception("Service is Unavailable");
			}

			// Converting JSONNode to String
			resObject = response.getBody().toString();
			System.out.println("resObject " + resObject);
			om = new ObjectMapper();
			om.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
			om.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

			StateWiseData[] langs = om.readValue(resObject, StateWiseData[].class);
			// Converting String to List
			myObjectsS = Arrays.asList(langs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.info("*********Exiting CountryISOCodes API Call *********");
		return myObjectsS;

	}

	// world ststs Data
	public List<WorldStatistics> getWorldStats() {
		LOGGER.info("*********Entering getWorldStats API Call *********");

		ObjectMapper om = null;
		String resObject = null;
		List<WorldStatistics> myObjectsS = null;
		try {
			String apiurl = worldStatistics;
			System.out.println("URL *************" + apiurl);

			HttpResponse<JsonNode> response = Unirest.get(apiurl).header("x-rapidapi-host", cm_apihost)
					.header("x-rapidapi-key", cm_apiKey).asJson();

			LOGGER.info("API Call Response :: " + response.getStatus() + " " + response.getBody().getArray());
			if (response.getStatus() == 404 && response.getStatus() == 500) {
				throw new Exception("Service is Down");
			} else if (response.getStatus() != 200) {
				throw new Exception("Service is Unavailable");
			}

			// Converting JSONNode to String
			resObject = response.getBody().toString();
			System.out.println("resObject getWorldStats " + resObject);
			om = new ObjectMapper();
			om.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
			om.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

			WorldStatistics langs = om.readValue(resObject, WorldStatistics.class);
			// Converting String to List
			myObjectsS = Arrays.asList(langs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.info("*********Exiting getWorldStats API Call *********");
		return myObjectsS;

	}

	// cases by country with vaccination data

	public List<CaseswithVaccinationData> getCaseswithVaccinationData() {
		LOGGER.info("*********Entering getCaseswithVaccinationData API Call *********");

		ObjectMapper om = null;
		String resObject = null;
		List<CaseswithVaccinationData> myObjectsS = null;
		JSONObject jo = null;
		JSONArray myobj = null;
		try {
			String apiurl = cases_by_country_stats;
			System.out.println("URL *************" + apiurl);

			HttpResponse<JsonNode> response = Unirest.get(apiurl).header("x-rapidapi-host", cm_apihost)
					.header("x-rapidapi-key", cm_apiKey).asJson();

			//LOGGER.info("API Call Response :: " + response.getStatus() + " " + response.getBody().getArray());
			if (response.getStatus() == 404 && response.getStatus() == 500) {
				throw new Exception("Service is Down");
			} else if (response.getStatus() != 200) {
				throw new Exception("Service is Unavailable");
			}

			// Converting JSONNode to String
			resObject = response.getBody().toString();
			
			LOGGER.info("resObject getCaseswithVaccinationData " + resObject);
			//System.out.println("resObject getCaseswithVaccinationData " + resObject);
			
			jo = new JSONObject();
			jo.put("result", resObject);
			System.out.println("result RRR " + jo.get("result"));
			
			
			om = new ObjectMapper();
			om.findAndRegisterModules();
			om.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
			om.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
			//om.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
			//om.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));

			CaseswithVaccinationData langs = om.readValue(resObject, CaseswithVaccinationData.class);
			// Converting String to List
			myObjectsS = Arrays.asList(langs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		LOGGER.info("*********Exiting getCaseswithVaccinationData API Call *********");
		return myObjectsS;

	}

}
