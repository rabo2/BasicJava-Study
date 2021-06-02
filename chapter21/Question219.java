package chapter21;

public class Question219 {

	public static void main(String[] args) {

		// 1. 0이상 5이하에서 정수를 결과와 같이 출력하여라.
		for (int i = 0; i < 6; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");

		// 2. 0이상 5이하에서 정수를 결과와 같이 출력하여라.
		for (int i = 5; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 3. 2이상 10이하에서 정수의 합계를 결과와 같이 출력하여라.
		int k = 0;
		for (int i = 2; i < 11; i++) {
			k += i;
		}
		System.out.println(k);

		// 4. 5이상 15 미만에서 정수의 곱을 구하여라(overflow를 고려하여라.)
		long a = 1l;
		for (int i = 5; i < 15; i++) {
			a = a * i;
		}
		System.out.println(a);

		// 5. 3이상 4462이하에서 짝수인 정수의 합을 구하여라.
		int evenSum = 0;
		for (int i = 3; i < 4463; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}
		}
		System.out.println(evenSum);

		// 6. 7초과 57미만에서 2또는 3의 배수인 정수의 합을 구하여라.
		int sum = 0;
		for (int i = 8; i < 57; i++) {
			if ((i % 2 == 0) || (i % 3 == 0)) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
