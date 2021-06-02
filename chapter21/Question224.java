package chapter21;

import java.util.Scanner;

public class Question224 {
	public static void main(String[] args) {

		
		//1. 변수 num을 선언하고 사용자로부터 숫자를 입력받은 값으로 초기화 하여라.4
		Scanner scr= new Scanner(System.in);
		String num = scr.next();

		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sum+=num.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
