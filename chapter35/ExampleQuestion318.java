package chapter35;

public class ExampleQuestion318 {
	public static void main(String[] args) {
		FireEngine2 fe = new FireEngine2();
		Car2 c2 = new Car2();
		
		if(fe instanceof FireEngine2) {
			System.out.println("이것은 FireEngine의 instance");
			FireEngine2 fe2 = fe;
		}
		if(fe instanceof Car2) {
			System.out.println("이것은 Car2의 instance");
			Car2 fe2 = fe;
		}
		if(fe instanceof Object) {
			System.out.println("이것은 Object의 instance");
			Object fe2 = fe;
		}
//		if(c2 instanceof FireEngine2) {
//			System.out.println("fe는 c2의 instance");
//			FireEngine2 fe2 = c2;
//		}
		if(c2 instanceof Object) {
			System.out.println("c2는 Object의 instance");
			Object fe2 = fe;
		}
		
	}
}
