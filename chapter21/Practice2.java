package chapter21;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		int sum2 = 0;
		int k = 1;
		while(true) {
			sum2+=(k%2 ==0 ? -k : k);
			if(sum2 >=100) {
				break;
			}
			k++;
		}
			
		System.out.println(k);
	}

}
