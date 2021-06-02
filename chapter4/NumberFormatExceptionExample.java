package chapter4;

import java.util.Scanner;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		try {
			String data1 = "100";
			String data2 = "a200";
			int value1 = Integer.parseInt(data1);
			// 문자열 숫자는 정수형 데이터로 변경
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("에러 발생");
		} finally {
			System.out.println("무조건 실행");
		}
	}
}
