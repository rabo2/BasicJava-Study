package chapter3;

public class MyMethod {
	public static void main(String[] args) {
		MyMethod method = new MyMethod();
		method.method2(100);
		MyMethod.method3(2);
	}

	void method1(int num) {
		System.out.println("입력된 값은" + num + "입니다.");
	}
	void method2(int num) {
		method3(20);
		method1(20);
		System.out.println("입력된 값은" + num + "입니다.");
	}
	static void method3(int num) {
		System.out.println(num*3);
	}
}
