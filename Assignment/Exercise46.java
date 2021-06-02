package Assignment;

import java.util.Scanner;

public class Exercise46 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.print("몇 번재 항까지 출력하시겠습니까?");
		int user = scr.nextInt();

		while (true) {
			if (user < 3) {
				System.out.println("3 이상의 수를 입력해주세요");
				System.out.print("몇 번재 항까지 출력하시겠습니까?");
				user = scr.nextInt();
			}else {
				break;
			}
		}
		//데이터 타입에 주의
		long a = 0;
		long b = 1;
		long sum = 0;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 0; i < user - 2; i++) {
			sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
		}

	}

}
