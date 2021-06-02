package Assignment2;

import java.util.Arrays;
import java.util.Random;

class Dice {
	public static Random random = new Random();
	public static int[][] count = { { 1, 0 }, { 2, 0 }, { 3, 0 }, { 4, 0 }, { 5, 0 }, { 6, 0 } };

	public static void diceCount() {
		for (int i = 0; i < 10000; i++) {
			int randomDice = random.nextInt(6) + 1;
			for (int j = 0; j < count.length; j++) {
				if (randomDice == count[j][0]) {
					count[j][1]++;
					break;
				}
			}

		}
		System.out.println("------------\n면\t빈도\n------------");
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count[i].length; j++) {
				System.out.print(count[i][j] + "\t");
			}
			System.out.println();
		}

	}

}

public class Exercise8 {
	public static void main(String[] args) {
		Dice.diceCount();
	}

}
