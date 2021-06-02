package chapter3;

import java.util.Random;

class MethodTest{
	static int a = 10;
	static int b = 20;
	int c = 50;
	
	static int add01() {
		return a+b;
	}
	int add02(int c) {
		return a+b+c;
	}
	int add3(int c) {
		return c+this.c;
	}
	int add4() {
		Random random = new Random();
		return this.c + random.nextInt(101);
	}
}



public class Question33 {
	public static void main(String[] args) {
		MethodTest.add01();
		
		MethodTest m1 = new MethodTest();
		m1.add02(50);
		
		m1.add3(50);
		
		m1.add4();
		
		
		
	}
	
}
