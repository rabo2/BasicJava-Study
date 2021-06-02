package chapter21;

import java.util.Random;

public class Question217 {

	public static void main(String[] args) {
		
		//1.변수 random을 선언하고 1이상 5이하의 임의의 정수로 초기화 하여라.
		Random r1 = new Random();
		int random = r1.nextInt(5)+1;
		
		//2. random값이 1이면"32평 아파트 당첨"을, 2이면 "자동차 당첨",
		//	 3이면 "노트북 당첨", 4이면 "자전거 당첨", 5이면 "다음 기회에"
		//	 를 출력하여라.
		switch(random) {
		case 1 :
			System.out.println("32평 아파트 당첨");
			break;
		case 2 :
			System.out.println("자동차 당첨");
			break;
		case 3 :
			System.out.println("노트북 당첨");
			break;
		case 4 :
			System.out.println("자전거 당첨");
			break;
		case 5 :
			System.out.println("다음 기회에");
			break;
		}
		
		
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		System.out.println("11");
		System.out.println("12");
		System.out.println("13");
		System.out.println("14");
		System.out.println("15");
		System.out.println("16");
		System.out.println("17");
		System.out.println("18");
		System.out.println("19");
	}

}
