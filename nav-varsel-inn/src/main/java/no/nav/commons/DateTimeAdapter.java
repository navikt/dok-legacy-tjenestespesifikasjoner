package no.nav.commons;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import org.joda.time.DateTime;

public class DateTimeAdapter extends XmlAdapter<String, DateTime> {

    public DateTime unmarshal(String value) {
    	return new DateTime(value);
    }

    public String marshal(DateTime value) {
        return value.toString();
    }

}
