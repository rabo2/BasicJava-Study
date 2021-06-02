package Assignment;

import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		int input1 = scr.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int input2 = scr.nextInt();
		boolean compare = input1 > input2;
		System.out.println("첫번재 수가 두번째 수보다 큰가? " + compare);
	}

}
