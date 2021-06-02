package chapter3;

public class Car {
	String color;    // 색상
	String gearType; // 변속종류
	int door;        // 문의 개수
	private Car() {
		System.out.println("디폴트 생성자");
	}
	
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	public Car(String color) {
		this();
		this.color = color;
	}
	public Car(String color, String gearType) {
		this("빨강");
		this.gearType = gearType;
	}
	
	public static void main(String[] args) {
		Car car = new Car("하늘");
		System.out.println(car.door);
	}
}
