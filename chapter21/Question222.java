package chapter21;

public class Question222 {

	public static void main(String[] args) {

		// 1. while문을 이용하여 1이상 100이하까지의 합계를 구하여라.
		int sum = 1;
		while (sum <= 100) {
			sum += sum;
			sum++;
		}
		System.out.println(sum);

		// 2. 1부터 1씩 증가하는 정수들을 더하였을 때 합계가 200을 넘게 되는 최초의 값과
		// 합계를 구하여라.
		int sum1 = 0;
		int i = 1;
		while(true) {
			sum1 += i;
			if(sum1 > 200) {
				break;
			}
			i++;
		}
		System.out.println(sum1);
		System.out.println(i);
		
		
		
	}

}
