package no.nav.meldinger.virksomhet.dokdistfordeling.adapters;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class CDataAdapter extends XmlAdapter<String, String> {

	@Override
	public String unmarshal(String xmlString) {
		return xmlString;
	}

	@Override
	public String marshal(String xmlString) {
		return xmlString == null ? null : "<![CDATA[" + xmlString + "]]>";
	}
}