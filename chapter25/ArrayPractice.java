package chapter25;

public class ArrayPractice {
	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2970;

		for(int i = 0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"원 : "+money/coinUnit[i]+"개");
			money = money%coinUnit[i];
		}
	}
}
