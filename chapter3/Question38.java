package chapter3;

 class Question38 {
	public static void main(String[] args) {
		//7. 3번의 add 메서드를 호출하여라.
		MyAdd.add(20);
		//8. 4번의 add 메서드를 호출하여라.
		MyAdd myAdd = new MyAdd();
		myAdd.add(20, 15);
		//9. 5번의 add 메서드를 호출하여라.
		myAdd.add(20, 15l);
		//10. 6번의 add 메서드를 호출하여라.
		myAdd.add('a', 15f);
		
	}
}
