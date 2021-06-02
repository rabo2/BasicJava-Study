package chapter3;

class MyAdd{
	//1. 클래스 변수 a를 선언하고 20의 값으로 초기화 하여라
	static int a = 20;
	//2. 인스턴스 변수 b를 선언하고 15의 값으로 초기화 하여라
	int b = 15;
	//3. int타입의 매개변수가 하나이며 변수 a의 합을 반환하는 클래tm 메서드 
	// add를 작성하여라
	static int add(int a) {
		return a;
	//4. int타입의 매개변수가 두 개이며 변수 a와 b의 합을 반환하는 인스턴스 메서드 
	// add를 작성하여라
	}
	int add(int a, int b) {
		return a+b;
	//5. int 타입, long타입의 각 한 개의 매개변수가, 변수 a와 b의 합을 반환하는 
	// 인스턴스 메서드 add를 작성하여라 
	}
	long add(int a, long b) {
		return a+b;
	}
	//5. char타입, float타입의 각 한개의 매개변수, 변수 a와 b의 합을 반환하는 
	//인스턴스 메서드 add를 작성하여라
	float add(char a, float b) {
		return  (a+b);
	}
}