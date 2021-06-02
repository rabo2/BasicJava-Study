package Assignment;

import java.util.Scanner;

public class Exercise41 {
	public static int chooseMax(int a, int b, int c) {
		int max;
		max = a;
		if (b > max) {
			max = b;
		} else if (c > max) {
			max = c;
		}
		return max;
	}

	
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요 : ");
		int a = scr.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요 : ");
		int b = scr.nextInt();
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요 : ");
		int c = scr.nextInt();
		int max;

		max = chooseMax(a, b, c);
		
		if(max < (a+b+c-max)) {
			System.out.println("삼각형을 만들 수 있습니다.");
		}else {
			System.out.println("삼각형을 만들 수 없습니다.");
		}
	}

	


}
