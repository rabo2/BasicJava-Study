package chapter4;

public class Example {
	public static void main(String[] args) {
		 String str = "모든 프로그램은 자바 언어로 개발될 수 있다. "
		 + "자바언어는 자바스크립트와 다르다"
		 + "자신감을 갖고 프로그래밍을 공부하면"
		 + "자바 뿐만 아니라 다른 프로그래밍 언어도"
		 + "자신만의 방식으로 해결할 수 있다.";
		 int index = str.indexOf("자바");
		 if(index == -1) {
		 System.out.println("자바 문자열 포함X");
		 }else {
		 System.out.println("자바 문자열 포함o");
		 str = str.replaceFirst("(자[가-힣]+)", "/**/$1");//("자바", "Java");
		 System.out.println("->"+ str);
		 }

		/**
		 * 아이디 이름 패스워드
		 * 
		 */
		// String str = "아이디,이름,패스워드";
		// String[] array = str.split(",");
		// System.out.println(array[0]);
		// System.out.println(array[1]);
		// System.out.println(array[2]+"\n");
		// for (String logIn : array) {
		// System.out.println(logIn);
		// }
		
//		int loopCount = 300_000;
//		// String 결합
//		long start1 = System.currentTimeMillis();
//		String str1 = "a";
//		for (int i = 0; i < loopCount; i++) {
//			str1 += "a";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("String 결합 : " + (end - start1) + "ms");
//
//		
//		//StringBuffer
//		long start2 = System.currentTimeMillis();
//		StringBuffer str2 = new StringBuffer();
//		for (int i = 0; i < loopCount; i++) {
//			str2.append("a");
//		}
//		long end2 = System.currentTimeMillis();
//		System.out.println("StringBuffer 결합 : " + (end - start2) + "ms");
//
//		
//		//StringBuilder
//		long start3 = System.currentTimeMillis();
//		StringBuilder str3 = new StringBuilder();
//		for (int i = 0; i < loopCount; i++) {
//			str3.append("a");
//		}
//		long end3 = System.currentTimeMillis();
//		System.out.println("StringBuilder 결합 : " + (end - start3) + "ms");

	}
}
