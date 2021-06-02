package Assignment3;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car("red");
		System.out.println(myCar.getColor());
		System.out.println(Car.getMaxSpeed());
		
		if(myCar.speedUp(100.0)) {
			System.out.println("속도 변경 가능");
		}else {
			System.out.println("변경 불가");
		}
		System.out.println(myCar.getSpeed());
		
		if(myCar.speedUp(90.0)) {
			System.out.println("속도 변경 가능");
		}else {
			System.out.println("변경 불가");
		}
		System.out.println(myCar.getSpeed());
		
		Car yourCar = new Car("blue");
		
		System.out.println(yourCar.getColor());
		System.out.println(Car.getMaxSpeed());
		if(yourCar.speedUp(150.0)) {
			System.out.println("속도변경가능");
		}else {
			System.out.println("변경불가");
		}
		System.out.println(yourCar.getSpeed());
		
		if(yourCar.speedUp(70.0)) {
			System.out.println("속도변경가능");
		}else {
			System.out.println("변경불가");
		}
		System.out.println(yourCar.getSpeed());
		
		
	}
}
