package chapter4;

public class WrapperClassExam {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		
		int intData2 = 150;		
//		String strData2 = intData2 + "";
//		String strData2 = Integer.toString(intData2);
		String strData2 = String.valueOf(intData2);
		
		
		System.out.println(intData1);
		System.out.println(strData2);
		
		
		int i = new Integer(50); // 언박싱(unboxing)
		Integer i2 = 50;		 // 오토박싱(autoboxing)
	}
}
