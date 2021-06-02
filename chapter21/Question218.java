package chapter21;

import java.util.Random;

public class Question218 {

	public static void main(String[] args) {
		
		//1. 변수 score을 선언하고 0이상 100이하의 임의의 정수로 초기화 하여라.
		Random r1 = new Random();
		int score = r1.nextInt(101);
		System.out.println(score);
		
		
		//2. score의 값이 90점 이상이면 "A"를 출력, 80이상 90점 미만이면 "B"를 출력,
		//   70점 이상 80점 미만이면 "C"를 출력, 60점이상 70점 미만이면 "D"를 출력
		//	 60점 미만이면 "F"를 출력하여라
		//	 단, switch문을 이용하고 case는 6개만 이용하여라.
		switch (score/10) {
		case 10 :
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");

		}
	}

}
