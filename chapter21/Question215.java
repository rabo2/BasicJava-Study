package chapter21;

import java.util.Scanner;

public class Question215 {
	public static void main(String[] args) {
	
		//1. console창으로 사용자로부터 정수를 입력받아 변수 input에 저장 하여라
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		
		//2. input에 저장된 값이 2의 배수이면 "2의 배수입니다."를 그 외에는
		//	 "2의 배수가 아닙니다."를 출력하여라
		if(input%2==0) {
			System.out.println("2의 배수입니다.");
		}else {
			System.out.println("2의 배수가 아닙니다.");
		}
	
		
	}
}
