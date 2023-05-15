package no.nav.brevogarkiv.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.joda.time.LocalDate;

/**
 * Adapter for converting xs:date String to LocalDate
 * 
 * @author Joakim Bjørnstad, Visma Consulting
 */
public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

	@Override
	public LocalDate unmarshal(String v) throws Exception {
		return new LocalDate(v);
	}

	@Override
	public String marshal(LocalDate v) throws Exception {
		return v.toString();
	}
}
