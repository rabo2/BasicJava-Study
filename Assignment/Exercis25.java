package Assignment;

import java.util.Scanner;

public class Exercis25 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("500원짜리 동전의 갯수 : ");	
		int fiveHundred = scr.nextInt();
		System.out.print("100원짜리 동전의 갯수 : ");
		int oneHundred = scr.nextInt();
		System.out.print("50원짜리 동전의 갯수 : ");
		int fifty = scr.nextInt();
		System.out.print("10원짜리 동전의 갯수 : ");
		int ten = scr.nextInt();
		int total = (fiveHundred*500) + (oneHundred*100) + (fifty*50) + (ten*10);
		System.out.println("저금통 안의 동전의 총 액수: "+ total);
		
	}

}
