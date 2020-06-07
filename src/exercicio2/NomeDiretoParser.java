package exercicio2;

public class NomeDiretoParser extends NameParserCreator {

	@Override
	protected NameParser getParser() {
		return new NomeDireto();
	}

}
