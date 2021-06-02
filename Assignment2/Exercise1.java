package Assignment2;

import java.util.Scanner;

class InputNum {
	public static void printInputNum() {
		Scanner scr = new Scanner(System.in);
		int inputNum = scr.nextInt();
		System.out.println(inputNum);

	}
}

public class Exercise1 {
	public static void main(String[] args) {
		InputNum.printInputNum();
	}
}
