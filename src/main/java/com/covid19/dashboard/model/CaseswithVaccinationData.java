package com.covid19.dashboard.model;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties({ "statistic_taken_at" })
public class CaseswithVaccinationData {

	@JsonProperty("countries_stat")
	private Countriesstat[] countriesstat;
	@JsonProperty("statistic_taken_at")
	private OffsetDateTime statistictakenAt;

	public CaseswithVaccinationData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Countriesstat[] getCountriesstat() {
		return countriesstat;
	}

	public void setCountriesstat(Countriesstat[] value) {
		this.countriesstat = value;
	}

	public OffsetDateTime getStatistictakenAt() {
		return statistictakenAt;
	}

	public void setStatistictakenAt(OffsetDateTime value) {

		/*
		 * final String pattern = "2012-02-22 02:06:58"; //DateTimeFormatter dtfB =
		 * DateTimeFormatter.ISO_OFFSET_DATE_TIME; DateTimeFormatter dtfB =
		 * DateTimeFormatter.ofPattern(pattern).withZone(ZoneId.of("Europe/Berlin"));
		 * 
		 * ZonedDateTime.parse(pattern,
		 * DateTimeFormatter.ISO_OFFSET_DATE_TIME.withZone(ZoneId.systemDefault()));
		 * ZonedDateTime datetime = ZonedDateTime.parse(pattern, dtfB); //
		 * OffsetDateTime result1 = OffsetDateTime.parse(value, dtfB); OffsetDateTime
		 * result1 = OffsetDateTime.parse ( value , DateTimeFormatter.ofPattern (
		 * "yyyy-MM-dd HH:mm:ss" ) ) ; result1 = datetime.toOffsetDateTime();
		 */
		this.statistictakenAt = value;

	}

}
