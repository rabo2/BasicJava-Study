package Assignment;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		Scanner scr	= new Scanner(System.in);
		System.out.print("가로의 길이는?(단위 : m) : ");
		float width = scr.nextFloat();
		System.out.print("세로의 길이는?(단위 : m) : ");
		float height = scr.nextFloat();
		float area = width * height;
		float perimeter = 2f*(width+height);
		System.out.println("직사각형의 넓이 : "+area);
		System.out.println("직사각형의 둘레 : " + perimeter);

	}

}
