package chapter3;

class Clac {
	//1. 두 개의 int 타입을 입력받아 두 인자의 합의 결과를 반환하는 인스턴스 메서드 
	//add를 구현 하여라.
	int add(int a, int b) {
		return a + b;
	}

	//2. 두 개의 int 타입을 입력받아 앞의 인자에서 뒤의 인자를 뺀 결과를 반환하는 인스턴스 메서드 
	//substract를 구현 하여라.
	int substract(int a, int b) {
		return a-b;
	}

	//3. 두 개의 int 타입을 입력받아 두 인자의 곱의 결과를 반환하는 인스턴스 메서드 
	//multiply를 구현 하여라.
	long mutiply(int a, int b) {
		return (long) a * b;
	}

	//3. 두 개의 int 타입을 입력받아 앞의 인자를 뒤의 인자로 나누기한 결과를 반환하는 인스턴스 메서드 
	//divide를 구현 하여라. 단, 결과는 소수점 두 번째 자리에서 반올림하여 첫 번째 자리가지 표현하여라
	double divide(int a, int b) {
		return (int) (a / (double) b * 10 + 0.5) / 10.0;
	}

}