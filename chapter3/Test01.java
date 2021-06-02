package chapter3;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {

		String[] names = new String[6];
		names[0] = "안병준";
		names[1] = "임성민";
		names[2] = "이인환";
		names[3] = "송진협";
		names[4] = "안재헌";
		names[5] = "임원근";
		
		String[] subjects = {"국어","영어","수학","사회","과학","Oracle","Java"};
		
		int[][] scores = new int[names.length][subjects.length];
		
		Random random = new Random();
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = random.nextInt(101);
			}
		}
		
	}
}
