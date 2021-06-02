package chapter25;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Question226 {
	public static void main(String[] args) {
		// 1. 정수 7개를 저장할 수 있는 변수 score를 선언 및 생성하여라.

		int[] score = new int[7];
		Arrays.sort(score);
		
		
		// 2. 변수 score의 각 요소를 0이상 100이하인 임의의 정수를 저장하여라.
		Random r1 = new Random();
		for (int i = 0; i < score.length; i++) {
			score[i] = r1.nextInt(101);
		}

		// 3. 변수 score에 저장된 요소들의 합계를 구하여라.
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}

		// 4. 변수 score에 저장된 요소들의 평균을 구하여라
		double average;
		average = (double)sum/score.length;
		//Math.Round();

		// 5. 변수 score에 저장된 요소에서 최댓값을 구하여라.
		int max = 0;
		Arrays.sort(score);
		max = score[6];

		// int max = 0; //범위내의 최솟값으로 초기화, Integer.MAX_VALUE || MIN.VALUE
		// for (int i = 0; i < score.length; i++) {
		// 		if(max<score[i]) {
		// 			max=score[i];
		// }
		// }

		// 6. 변수 score에 저장된 요소에서 최솟값을 구하여라.
		int min = 0;
		min = score[0];

		// int min = 101; //범위내의 최댓값으로 초기화
		// for (int i = 0; i < score.length; i++) {
		// 		if(min>score[i]) {
		// 			min=score[i];
		// 		}
		// }

		// 7. 1~6번 의 결과를 이용하여 결과와 같이 출력하여라.
		System.out.print("score값 : {");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]);
			if (i != score.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println("}");
			}
		}
		
//		for(int i = 0; i<score.length; i++) {
//			if(i!=0) {
//				System.out.println(", ");
//			}
//			System.out.println(score[i]);
//		}
		
		Arrays.toString(score);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (int)(average*100+0.5)/100.0);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);

	}
}
