package chapter25;

import java.util.Arrays;

public class Question227 {
	public static void main(String[] args) {
		int[] num = {5,2,3,1,4};
		int tmp;
		
		for(int i = 0; i<num.length-2; i++) {
			if(num[i] < num[i+1]) {
				tmp = num[i];
				num[i] = num[i + 1];
				num[i + 1] = tmp;
				System.out.println(Arrays.toString(num));
			}
		}
		
	}
}
