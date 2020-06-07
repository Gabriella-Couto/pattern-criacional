package exercicio2;

import java.util.ArrayList;

public class Cliente {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Solange Almeida");
		nomes.add("Lucas Marques");
		nomes.add("Teresa Santos");
		nomes.add("Fernando Teixeira");

		NameParserCreator parser;
		
		for(String nome: nomes) {
			if(nome.contains(",")) {
				parser = new NomeInversoParser();
			} else {
				parser = new NomeDiretoParser();
			}
			parser.gravar(nome);
		}
		
	}

}
