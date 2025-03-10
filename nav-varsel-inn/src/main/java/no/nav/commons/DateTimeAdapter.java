package no.nav.commons;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DateTimeAdapter extends XmlAdapter<String, ZonedDateTime> {

	private static final DateTimeFormatter LOCAL_DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
			.appendPattern("yyyy-MM-dd'T'HH:mm:ss")
			.appendFraction(java.time.temporal.ChronoField.MICRO_OF_SECOND, 0, 9, true)
			.appendPattern("[z][Z]")
			.toFormatter();

	@Override
	public ZonedDateTime unmarshal(String v) throws Exception {
		return ZonedDateTime.from(LOCAL_DATE_TIME_FORMATTER.parse(v));
	}

	@Override
	public String marshal(ZonedDateTime v) throws Exception {
		return LOCAL_DATE_TIME_FORMATTER.format(v);
	}
}
