package chapter25;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int[] array = { 5, 3, 2, 1, 4 };

		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			int temp;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
			System.out.println(Arrays.toString(array));
				
		}
	}
}
