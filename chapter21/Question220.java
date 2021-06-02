package chapter21;

public class Question220 {

	public static void main(String[] args) {
		for (int evenDan = 1; evenDan < 10; evenDan++) {
			if (evenDan % 2 == 0) {
				System.out.println("====" + evenDan + "단의 구구단====");
				for (int gob = 1; gob < 10; gob++) {
					System.out.println(evenDan + " * " + gob + " = " + evenDan * gob);
				}
				System.out.println();
			}
		}

		for (int dan = 1; dan < 10; dan++) {
			if (dan % 2 == 0) {
				System.out.println("====" + dan + "단의 홀수 곱===");
				for (int oddGob = 1; oddGob < 10; oddGob++) {
					if (oddGob % 2 == 1) {
						System.out.println(dan + " * " + oddGob + " = " + dan * oddGob);
					}
				}
				System.out.println();
				
			}
		}

	}
}
