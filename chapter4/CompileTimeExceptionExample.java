package chapter4;

public class CompileTimeExceptionExample {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("java.lang.String");
	}
}
