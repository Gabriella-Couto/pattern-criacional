package exercicio2;

public class NomeInversoParser extends NameParserCreator {

	@Override
	protected NameParser getParser() {
		return new NomeInverso();
	}

}
