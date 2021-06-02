package Assignment2;

import java.util.Arrays;
import java.util.Random;

class Lotto {
	Random random = new Random();

	public void randomLotto() {
		int[] lottoNum = new int[6];
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lottoNum[i] == lottoNum[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lottoNum));
	}

}

public class Exercise6 {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.randomLotto();
	}
}
