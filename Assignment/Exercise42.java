package Assignment;

import java.util.Scanner;

public class Exercise42 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("월을 입력하세요(1~12):");
		int month = scr.nextInt();

		season.chooseSeason(month);
	}

}
