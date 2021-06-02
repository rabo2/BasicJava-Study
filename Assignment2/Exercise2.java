package Assignment2;

import java.util.Scanner;

class Age {
	public void judgeAge() {
		Scanner scr = new Scanner(System.in);
		int age = scr.nextInt();
		if (age >= 20 && age <= 29) {
			System.out.println("20대입니다.");
		} else {
			System.out.println("20대가 아닙니다.");
		}
	}
}

public class Exercise2 {
	public static void main(String[] args) {
		Age age = new Age();
		age.judgeAge();
	}
}
