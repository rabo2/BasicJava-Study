package Assignment;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		Random random = new Random();
		int a = random.nextInt(100) + 1;
		int b = 0;
		while (a != b) {
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요 : ");
			b = scr.nextInt();
			if (a > b) {
				System.out.println("정답은 더 큰 수 입니다.");
				continue;
			} else if (a < b) {
				System.out.println("정답은 더 작은 수 입니다.");
				continue;
			}
		}
		System.out.println("정답입니다.");
		System.out.println(a);
		scr.close();
	}

}
