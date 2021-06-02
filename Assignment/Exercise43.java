package Assignment;

import java.util.Scanner;

public class Exercise43 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scr = new Scanner(System.in);
		System.out.print("프로그래밍 기초 :");
		int programBasic = scr.nextInt();
		System.out.print("데이터베이스 :");
		int dataBase = scr.nextInt();
		System.out.print("화면 구현 :");
		int display = scr.nextInt();
		System.out.print("애플리케이션 구현 : ");
		int app = scr.nextInt();
		System.out.print("머신러닝 : ");
		int machine = scr.nextInt();
		
		int total = programBasic+dataBase+display+app+machine;
		System.out.println("총점 : "+ total);
		float avg = (int)((total/5f)*100+0.5)/100f;
		System.out.println("평균 : "+avg);
		char grade;
		
		if(90 <= avg) {
			grade = 'A';
		}else if(80 <= avg){
			grade = 'B';
		}else if(70 <= avg){
			grade = 'C';
		}else if(60 <= avg){
			grade = 'D';
		}else{
			grade = 'F';
		}
		System.out.println("학점 : "+grade);
		
		
	}

}
