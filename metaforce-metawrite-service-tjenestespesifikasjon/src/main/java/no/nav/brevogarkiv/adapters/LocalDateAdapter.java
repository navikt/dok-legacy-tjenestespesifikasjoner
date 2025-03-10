package no.nav.brevogarkiv.adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Adapter for converting xs:date String to LocalDate
 */
public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

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
