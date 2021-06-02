package chapter21;

import java.util.Scanner;

public class PracticeQustion {

	public static void main(String[] args) {

		// 1. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		for (int d1 = 1; d1 < 7; d1++) {
			for (int d2 = 1; d2 < 7; d2++) {
				if (d1 + d2 == 6) {
					System.out.println(d1 + "," + d2);
				}
			}
		}

		System.out.println();

		// 2. 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 저수이고 각각의 범위는 0<=x<=10
		// 0<=y<=10이다.
		for (int x = 0; x < 11; x++) {
			for (int y = 0; y < 11; y++) {
				if (2 * x + 4 * y == 10) {
					System.out.println("x = " + x + ", " + "y = " + y);
				}
			}
		}

		// 3. 사용자로부터 두개의 정수(시작, 끝)을 입력받아 시작(포함)에서 끝(포함)까지의 곱을 출력하는
		// 프로그램을 작성하시오.
		Scanner scr = new Scanner(System.in);
		int startInt = scr.nextInt();
		int endInt = scr.nextInt();
		int num1 = (startInt - endInt >= 0 ? endInt : startInt);
		int num2 = (startInt - endInt < 0 ? endInt : startInt);
		long mul = 1l;
		for (int i = num1; i < num2 + 1; i++) {
			mul = mul * i;
		}
		System.out.println(mul);

		// 4. 1
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j <= i; j++) {
				sum += j;
			}
		}
		System.out.println(sum);

		int sum2 = 0;
		int k = 1;
		while(true) {
			sum2+=(k%2 ==0 ? -k : k);
			if(sum2 >=100) {
				break;
			}
			k++;
		}
		System.out.println(k);
			
		
		

		Scanner scr2 = new Scanner(System.in);
		String str = scr2.next();
		int sum3 = 0;
		for (int i = 0; i < str.length(); i++) {
			sum3 += str.charAt(i) - '0';
		}
		System.out.println(sum3);
//		
//		Scanner scr = new Scanner(System.in);
//		int inputNum = scr.nextInt();
//		
//		int sum = 0;
//
//		while (true) {
//			sum += inputNum%10;
//			inputNum = inputNum/10;
//			if(inputNum == 0) {
//				break;
//			}
//		}

		
		
		
		int fibo, nna, ci;
		fibo = 1;
		nna = 1;
		ci = 0;
		for (int i = 1; i < 9; i++) {
			ci = fibo + nna;
			fibo = nna;
			nna = ci;
		}
		System.out.println(ci + " ");

		
		
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		for (int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);
			if (!('0' <= ch && ch <= '9')) {
				isNumber = false;
				break;
			}
		}

		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");

		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}
	}

}
