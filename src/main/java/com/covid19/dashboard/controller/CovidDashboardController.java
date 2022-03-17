package com.covid19.dashboard.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid19.dashboard.model.AllCountriesData;
import com.covid19.dashboard.model.CaseswithVaccinationData;
import com.covid19.dashboard.model.CountrySpecificModel;
import com.covid19.dashboard.model.CountryWithStateModel;
import com.covid19.dashboard.model.WorldCovidStats;
import com.covid19.dashboard.model.WorldStatistics;
import com.covid19.dashboard.service.CountrySpecificDataImpl;
import com.covid19.dashboard.service.CovidStatisticsImpl;

@RestController
@RequestMapping("/covid19")
public class CovidDashboardController {

	private static final Logger LOGGER = LogManager.getLogger(CovidDashboardController.class);

	@Autowired
	private CountrySpecificDataImpl countrySpecificDataImpl;

	@Autowired
	private CovidStatisticsImpl covidStatisticsImpl;

	@GetMapping(value = "/byCountryName/{code}/{countryName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CountrySpecificModel[] getDataByCountryName(@PathVariable("code") String code,
			@PathVariable("countryName") String countryName) {
		LOGGER.info("********* Entering into getDataByCountryName Controller *********");
		CountrySpecificModel[] res = countrySpecificDataImpl.getCovidData(code, countryName);
		LOGGER.info("********* Exiting into getDataByCountryName Controller *********");
		return res;
	}

	@GetMapping(value = "/getWorldData", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<WorldCovidStats> getWorldData() {
		LOGGER.info("********* Entering into getWorldData Controller *********");
		List<WorldCovidStats> res = covidStatisticsImpl.getWorldData();
		LOGGER.info("********* Exiting into getWorldData Controller *********");
		return res;
	}

	@GetMapping(value = "/getAllCountriesData", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AllCountriesData> getAllCountriesData() {
		LOGGER.info("********* Entering into getAllCountriesData Controller *********");
		List<AllCountriesData> res1 = covidStatisticsImpl.getAllCountriesData();
		LOGGER.info("********* Exiting into getAllCountriesData Controller *********");
		return res1;
	}

	@GetMapping(value = "/getCountryWiseData/{countryName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CountryWithStateModel getCountryWiseData(@PathVariable("countryName") String countryName) {
		LOGGER.info("********* Entering into getCountryWiseData Controller *********");
		CountryWithStateModel res = covidStatisticsImpl.getCountryWiseData(countryName);
		LOGGER.info("********* Exiting into getCountryWiseData Controller *********");
		return res;
	}

	@GetMapping(value = "/getGlobalstats", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<WorldStatistics> getGlobalstats() {
		LOGGER.info("********* Entering into getGlobalstats Controller *********");
		List<WorldStatistics> res = covidStatisticsImpl.getWorldStatistics();
		LOGGER.info("********* Exiting into getGlobalstats Controller *********");
		return res;
	}

	@GetMapping(value = "/getVaccinationStats", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CaseswithVaccinationData> getVaccinationStats() {
		LOGGER.info("********* Entering into getVaccinationStats Controller *********");
		List<CaseswithVaccinationData> res = covidStatisticsImpl.getCovidVaccinationstats();
		LOGGER.info("********* Exiting into getVaccinationStats Controller *********");
		return res;
	}

}
