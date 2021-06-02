package chpater42;

import java.util.Random;

public class RadnomNom {
	public static void main(String[] args) {
		Random random = new Random();
		for(int i = 0; i< 25; i++) {
			int a=random.nextInt(24)+1;
			System.out.println(a);
		}
	}
}
