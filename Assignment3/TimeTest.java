package Assignment3;

public class TimeTest {
	public static void main(String[] args) {
		Time time1 = new Time();
		System.out.println("기본 생성자:"+ time1);
		Time time2 = new Time(22, 15, 48);
		System.out.println("두 번째 생성자 : "+time2);
		Time time3 = new Time(15, 66, 77);
		System.out.println("wrong constructor : "+time3	);
	}
}
