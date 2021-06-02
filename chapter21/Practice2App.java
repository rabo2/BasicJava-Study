package chapter21;

import java.util.Scanner;

public class Practice2App {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int inputNum = scr.nextInt();
		
		int sum = 0;

		while (true) {
			sum += inputNum%10;
			inputNum = inputNum/10;
			if(inputNum == 0) {
				break;
			}
		}
		
		System.out.println(sum);
	}

}
