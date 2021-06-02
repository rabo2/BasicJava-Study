package chapter3;

public class MySingletonExam {
	public static void main(String[] args) {
		MySingleton instance1 = MySingleton.getInstance();
		MySingleton instance2 = MySingleton.getInstance();
		System.out.println(instance1 == instance2);
		
		
		Car car1 = new Car("a");
		Car car2 = new Car("a");
		System.out.println(car1 == car2);
	}
}
