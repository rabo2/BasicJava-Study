package Assignment2;

class ArraySearch {
	int[] num = { 38, 94, 16, 3, 76, 94, 82, 47, 59, 8 };
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;

	public void arrayMax() {
		for (int i = 0; i < num.length; i++) {
			if (num[i] > this.max) {
				this.max = num[i];
			}
		}
	System.out.println(this.max);
	}

	public void arrayMin() {
		for (int i = 0; i < num.length; i++) {
			if (num[i] < this.min) {
				this.min = num[i];
			}
		}
		System.out.println(this.min);
	}
}

public class Exercise5 {
	public static void main(String[] args) {
		ArraySearch arraySearch = new ArraySearch();
		arraySearch.arrayMax();
		arraySearch.arrayMin();
	}
}
