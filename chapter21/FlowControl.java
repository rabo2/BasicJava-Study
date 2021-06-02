package chapter21;

import java.util.Random;
import java.util.Scanner;

public class FlowControl {

	public static void main(String[] args) {
		
//		//1부터 10사이의 임의의 정수 추출
//		System.out.println((int)(Math.random()*10)+1);
//		
//		
		Random random = new Random();
		int num = random.nextInt(10)+1; //1부터 9까지 임의의 수 추출  
	System.out.println(num);
//		
//		
//		//1. 변수 x를 선언하고 0이상 100미만 사이의 임의의 정수 값으로 초기화 하여라.
//		Random r1 = new Random();
//		int x = r1.nextInt(100);
//		
//		//2. x에 저장된 값을 출력하여라.
//		System.out.println(x);
//		
//		//3. 변수 x2를 선언하고 43초과 375미만 사이의 임의의 정수 값으로 초기화 하여라.
//		int x2 = r1.nextInt(375 - 44) + 44;
//		//4. x2에 저장된 값을 출력하여라.
//		System.out.println(x2);
		
//		Scanner scanner = new Scanner(System.in);
//		int inputNum = scanner.nextInt();
//		System.out.println("입력하신 숫자는 :"+ inputNum);
//		
//		String inputStr = scanner.next();
	}

}
