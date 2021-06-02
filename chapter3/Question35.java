package chapter3;

import java.util.Scanner;

public class Question35 {
	public static void main(String[] args) {
		//5. 사용자로부터 정수를 입력 받아 변수 firstNum에 저장하여라.
		Scanner scr = new Scanner(System.in);
		Clac calculator = new Clac();
		int firstNum = scr.nextInt();
		
		//6. 사용자로부터 부호를 입력 받아 변수 operator 에 저장하여라.
		String operator = scr.next();
		
		//7. 사용자로부터 정수를 입력받아 변수secondNum에 저장하여라.
		int secondNum = scr.nextInt();
		
		//8. buho에 저장된 값이 '+'이면 add메소드 '-'이면 substract, '*'이면 multiply, '/'이면 
		//divide 메서드를 호출하고 결과를 출력하여라. 4가지 경우가 아니라면 '연산종료'를 출력하여라.
		String result = "";
		switch (operator) {
		case "+":
			result = calculator.add(firstNum, secondNum)+"";//결합 연산자 숫자+문자열 = 문자열;
			break;
		case "-":
			result = calculator.substract(firstNum, secondNum)+"";
			break;
		case "*":
			result = calculator.mutiply(firstNum, secondNum)+"";
			break;
		case "/":
			result = calculator.divide(firstNum, secondNum)+"";
			break;
		default:
			result= "연산종료";
		}
		System.out.println(result);
		
		scr.close();
	}
}
