package chapter21;

import java.util.Random;

public class Question216 {
	public static void main(String[] args) {

		// 1. 변수 SCORE을 선언하고 0이상 100 이하의 정수중에 임의의 값으로 초기화 하여라.
		Random r1 = new Random();
		int score = r1.nextInt(101);

		// 2. score의 갑이 90점 이상이면 "A"를 출력, 80점 이상 90점 미만이면 "B"를 출력,
		// 70점 이상 80점 미만이면 "C"를 출력, 60점 이상 70점미만이면 "D"를 출력
		// 60점 미만이면 "F"를 출력하여라. (if-else if 문을 이용하여라.
		if (90 <= score) {
			System.out.println("A");
		} else if (80 <= score) {
			System.out.println("B");
		} else if (70 <= score) {
			System.out.println("C");
		} else if (60 <= score) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}
}
