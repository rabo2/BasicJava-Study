package chapter3;

class Init {
	static int action;
	int action2 =5;
	
	static {
		action = 4;
	}
	{
		action2 = 4;
	}
	Init() {
		action2 = 7;
	}
	Init(int action2){
		this();
		this.action2 = action2;
	}
}


public class ExampleQeustion311 {
	public static void main(String[] args) {
		System.out.println(Init.action);
		Init init = new Init(9);
		System.out.println(init.action2);
		
		
	}
}
