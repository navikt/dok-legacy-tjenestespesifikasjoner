package no.nav.brevogarkiv.adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 * Adapter for converting xs:dateTime String to LocalDateTime Note that
 * xs:dateTime allows for timezone. LocalDateTime is timezone agnostic.
 * 
 * @author Joakim Bjørnstad, Visma Consulting
 */
public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

	private static final DateTimeFormatter LOCAL_DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
			.appendPattern("yyyy-MM-dd'T'HH:mm:ss")
			.appendFraction(java.time.temporal.ChronoField.MICRO_OF_SECOND, 0, 9, true)
			.appendPattern("[z][Z]")
			.toFormatter();

	@Override
	public LocalDateTime unmarshal(String v) throws Exception {
		return LocalDateTime.from(LOCAL_DATE_TIME_FORMATTER.parse(v));
	}

	@Override
	public String marshal(LocalDateTime v) throws Exception {
		return LOCAL_DATE_TIME_FORMATTER.format(v);
	}
}