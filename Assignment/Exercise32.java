package Assignment;

import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("수도입니까?(수도: 1, 수도아님: 0) ");
		boolean capital = scr.nextInt()==1;
		System.out.print("총 인구는?(단위: 만) ");
		boolean population = scr.nextInt()>=100;
		System.out.print("연소득이 1억 이상인 인구는?(단위: 만) ");
		boolean gdpPopulation = scr.nextInt()>=50;
		
		String metro = (capital==true) && (population == true) || (gdpPopulation== true) ?
						  "이 도시는 메트로폴리스입니다."
						: "이 도시는 메트로폴리스가 아닙니다.";
		
		System.out.println(metro);
		
	}
	

}
