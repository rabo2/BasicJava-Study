package Assignment2;

import java.util.Scanner;

class Multiplication {
	public static void multiple() {
		Scanner scanner = new Scanner(System.in);
		int userNum = scanner.nextInt();
		for (int i = 1; i < 10; i++) {
			if (userNum >= 1 && userNum <= 9) {
				System.out.println(userNum + " * " + i + " = " + userNum * i);
			} else {
				System.out.println("1부터 9까지만 입력하십시오");
				break;
			}
		}
	}
}

public class Exercise4 {
	public static void main(String[] args) {
		Multiplication.multiple();
	}
}
