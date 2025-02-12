package no.nav.commons;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAdapter extends XmlAdapter<String, LocalDate> {

	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ISO_DATE;

	@Override
	public LocalDate unmarshal(String v) throws Exception {
		return LocalDate.from(DATE_TIME_FORMATTER.parse(v));
	}

	@Override
	public String marshal(LocalDate v) throws Exception {
		return DATE_TIME_FORMATTER.format(v);
	}
}
