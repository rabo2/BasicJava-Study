package Assignment3;

public class NewCarTest {
	public static void main(String[] args) {
		NewCar myCar = new NewCar("blue");
		System.out.println(myCar.getColor());
		System.out.println(Car.getMaxSpeed());
		if(myCar.speedUp(100.0)) {
			System.out.println("속도 변경 가능");
		}else {
			System.out.println("변경 불가");
		}
		System.out.println(myCar.getSpeed());
		
		
		if(myCar.speedUp(.0)) {
			System.out.println("속도 변경 가능");
		}else {
			System.out.println("변경 불가");
		}
		System.out.println(myCar.getSpeed());

	}
	
	
}
