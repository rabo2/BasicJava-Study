package chapter25;

public class Question225 {

	public static void main(String[] args) {
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			score[i] = i * 10;
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(score[i]);
		}
	}

}
