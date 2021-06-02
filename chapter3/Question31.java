package chapter3;

class Card {
	String name;
	int number;
	static int width = 100;
	static int heigh = 250;
}

public class Question31 {
	public static void main(String[] args) {
		System.out.println(Card.width);
		System.out.println(Card.heigh);
		
		Card cd1 = new Card();
		cd1.name = "Daniel";
		cd1.number = 19961210;
		
		Card cd2 = new Card();
		cd2.name ="nayeon";
		cd2.number = 19950922;
		
		Card.width = 70;
		Card.heigh = 100;
	}
}
