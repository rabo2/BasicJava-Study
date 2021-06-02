package Assignment;

import java.util.Scanner;

public class Exercise47 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("허용오차 : ");
		double tolerance = scr.nextDouble();
		double userPi = 3;
		long i = 2;
		int count = 0;
		while (true) {
			userPi += 4.0/ (i * (i + 1) * (i + 2));
			count++;
			if (Math.abs(Math.PI - (userPi)) < tolerance) {
				break;
			}
			i += 2;
			userPi -= 4.0/ ((i) * (i + 1) * (i + 2));
			count++;
			if (Math.abs(Math.PI - (userPi)) < tolerance) {
				break;
			}
			i += 2;
		}
		
		
		
//		int sign = 1;
//		while(true) {
//			userPi += 4.0/(i+(i+1)*(i+2))*sign;
//			count++;
//			sign *= -1;
//			i+=2;
//			if(tolerance < Math.abs(Math.PI-userPi)) {
//				break;
//			}
//		}
		
		System.out.println("Math.PI = " + Math.PI);
		System.out.println("계산된 파이값 = " + userPi);
		System.out.println("반복횟수 : " + count);
		scr.close();
	}

}