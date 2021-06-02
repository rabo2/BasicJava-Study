package chapter3;

public class Question36 {
	static void change(int x) {
		x =1000;
		System.out.println("change() 기본형 : " + x);
	}
	static void change(Data d1) {
		d1.x = 1000;
		System.out.println("change() 참조형 : " +d1.x);
	}
	
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.x = 10;
		System.out.println(d1.x);
		
		change(d1.x);
		
		System.out.println(d1.x);
		
		Data d2 = new Data();
		d2.x = 10;
		System.out.println(d2.x);
		
		change(d2);
		System.out.println(d2.x);
		
	}
}
