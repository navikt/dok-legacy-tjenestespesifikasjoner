package no.nav.brevogarkiv.adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

/**
 * Adapter for converting xs:dateTime String to LocalDateTime Note that
 * xs:dateTime allows for timezone. LocalDateTime is timezone agnostic.
 * 
 * @author Joakim Bjørnstad, Visma Consulting
 */
public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

	@Override
	public LocalDateTime unmarshal(String v) throws Exception {
		return DateTime.parse(v).toLocalDateTime();
	}

	@Override
	public String marshal(LocalDateTime v) throws Exception {
		return v.toDateTime().toString();
	}
}