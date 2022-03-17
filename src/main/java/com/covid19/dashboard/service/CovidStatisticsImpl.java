package com.covid19.dashboard.service;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid19.dashboard.model.AllCountriesData;
import com.covid19.dashboard.model.CaseswithVaccinationData;
import com.covid19.dashboard.model.CountryWithStateModel;
import com.covid19.dashboard.model.StateWiseData;
import com.covid19.dashboard.model.WorldCovidStats;
import com.covid19.dashboard.model.WorldStatistics;
import com.covid19.dashboard.util.APIUtil;

@Service
public class CovidStatisticsImpl implements CovidStatistics {

	private static final Logger LOGGER = LogManager.getLogger(CovidStatisticsImpl.class);
	@Autowired
	public APIUtil apiutil;

	@Override
	public List<WorldCovidStats> getWorldData() {
		List<WorldCovidStats> worldData = apiutil.getWorldData();
		// TODO Auto-generated method stub
		return worldData;
	}

	@Override
	public List<AllCountriesData> getAllCountriesData() {
		List<AllCountriesData> res = apiutil.allCountriesData();
		// TODO Auto-generated method stub
		return res;

	}

	@Override
	public CountryWithStateModel getCountryWiseData(String countryName) {
		LOGGER.info("********* Entering into getCountryWiseData Service *********");
		CountryWithStateModel countryWithStateModel = null;
		List<AllCountriesData> res = apiutil.allCountriesData();
		// res.stream().forEach(r -> r.country.equalsIgnoreCase(countryName) ||
		// r.threeLetterSymbol.equalsIgnoreCase(countryName));

		List<AllCountriesData> countryData = res.stream()
				.filter(r -> r.country.equalsIgnoreCase(countryName)
						|| r.threeLetterSymbol.equalsIgnoreCase(countryName)
						|| r.twoLetterSymbol.equalsIgnoreCase(countryName))
				.collect(Collectors.toList());

		if (countryData != null && countryData.size() > 0) {
			countryWithStateModel = new CountryWithStateModel();
			countryWithStateModel.setCountryData(countryData.get(0));
			List<StateWiseData> swd = apiutil.stateWiseData(countryData.get(0).getThreeLetterSymbol());
			if (swd != null && swd.size() > 0) {
				countryWithStateModel.setStateWiseData(swd);
			}
		} else {
			LOGGER.info("********* Data Not found with countryName  " + countryName + " *********");
		}
		// TODO Auto-generated method stub
		LOGGER.info("********* Exiting into getCountryWiseData Service *********");
		return countryWithStateModel;
	}

	@Override
	public List<WorldStatistics> getWorldStatistics() {
		LOGGER.info("********* Entering into getWorldStatistics Service *********");
		List<WorldStatistics> ws = apiutil.getWorldStats();
		apiutil.getCaseswithVaccinationData();
		LOGGER.info("********* Exiting into getWorldStatistics Service *********");
		return ws;
	}

	@Override
	public List<CaseswithVaccinationData> getCovidVaccinationstats() {
		
		LOGGER.info("********* Entering into CaseswithVaccinationData Service *********");
		List<CaseswithVaccinationData> cvd = apiutil.getCaseswithVaccinationData();
		LOGGER.info("********* Exiting into CaseswithVaccinationData Service *********");
		return cvd;
		
	}
	
	

}
