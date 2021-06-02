package Assignment2;

import java.util.Scanner;

class Month {
	public static void judgeMonth() {
		Scanner scr = new Scanner(System.in);
		int month = scr.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일까지 존재합니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지 존재합니다.");
			break;
		case 2:
			System.out.println("28일 혹은 29일까지 존재합니다.");
			break;
		default:
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
	}
}

public class Exercise3 {
	public static void main(String[] args) {
		Month.judgeMonth();
	}
}
