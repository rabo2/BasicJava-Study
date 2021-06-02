package Assignment;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위 : cm) : ");
		double redius = scr.nextDouble();
		System.out.print("원기둥 높이를 입력하시오.(단위 : cm) : ");
		double heighst = scr.nextDouble();
		double bottom = redius*redius*Math.PI;
		double volume = bottom*heighst;
		System.out.println("원기둥 밑변의 넓이는" +bottom+"이고, 원기둥의 부피는 "+volume+"이다.");
		
	}

}
