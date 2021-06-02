package chapter35;
public class FireCarExam {	
	public static void main(String[] args) {
		
		
		Car c = new Car();			
		Car f = new FireCar();		
		Car p = new PoliceCar();	
		getFireCar(c); 	//false
		getFireCar(f); 	//true
		getFireCar(p); 	//fasle
	}
	static void getFireCar(Car c) {
		if(c instanceof FireCar) {
			System.out.println(c instanceof FireCar); // 1. 인스턴스 타입을 확인
			FireCar fc = (FireCar) c;
			fc.water();
		}
	}
}
