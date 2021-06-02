package Assignment5;

public class MyArrays {
	public static int getMaximum(Comparable[] array) {
		int max = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i].compareTo(array[max]) == 1) {
				max = i;
			}
		}
		return max;
	}

}

