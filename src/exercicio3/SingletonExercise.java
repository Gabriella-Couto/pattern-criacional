package exercicio3;

public class SingletonExercise {
	public static void main(String args[]) {
		Deck deck = Deck.getInstance();
		deck.print();
	}
}
