package no.nav.tjeneste.domene.brevogarkiv.dokumentproduksjoninfo;

/**
 * @author Joakim Bjørnstad, Jbit AS
 */
public class DokumentproduksjonInfoFunctionalException extends RuntimeException {
	public DokumentproduksjonInfoFunctionalException() {
		super();
	}

	public DokumentproduksjonInfoFunctionalException(String message) {
		super(message);
	}

	public DokumentproduksjonInfoFunctionalException(String message, Throwable cause) {
		super(message, cause);
	}

	public DokumentproduksjonInfoFunctionalException(Throwable cause) {
		super(cause);
	}
}
