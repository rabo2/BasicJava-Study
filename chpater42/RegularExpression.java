package chpater42;

import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		String regEx = "[a-z]{2,3}"; // 문자열이 영어소문자 2개 또는 3개로 구성
		System.out.println(Pattern.matches(regEx, "sss"));
		
		String regEx1 = "[a-z]{3}\\d+";
		System.out.println(Pattern.matches(regEx1, "abc312312"));
//		/[a-z]{3}[0-9]+

		String regEx2 = "\\d{3}-\\d{4}-\\d{4}";
		System.out.println(Pattern.matches(regEx2, "010-1221-1234"));
//		[0-9]{3}-[0-9]{4}-[0-9]{4}
		
		String regEx3 = "01[0,1,7,8,9]{1}-\\d{3}-\\d{4}";
		System.out.println(Pattern.matches(regEx3, "017-231-8126"));
		
		String regEx4 = "9[1-4]{6}-[1-4]\\d{5}";
		System.out.println(Pattern.matches(regEx4, "9141414-240512"));
		
		String regEx5 = "^[A-Za-z][A-Za-z-_\\\\.]*@[A-Za-z]{1,7}.[A-Za-z]{2,3}(.kr)?";
		System.out.println(Pattern.matches(regEx5, "aks\\dfdfd@dlfdjl.dkd.kr"));
		//\\w(\\w|-|_|.)
		
		
		
	}	
}