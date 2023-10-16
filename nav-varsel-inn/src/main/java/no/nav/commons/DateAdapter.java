package no.nav.commons;

import org.joda.time.LocalDate;
import org.joda.time.format.ISODateTimeFormat;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, LocalDate> {

	public LocalDate unmarshal(String v) {
		if (v.contains("+")) {
			return new LocalDate(v.substring(0, v.indexOf('+')));
		}
		return new LocalDate(v);
	}

	public String marshal(LocalDate v) {
		return v != null ? v.toString(ISODateTimeFormat.date()) : null;
	}

}
