package Assignment4;

public class StudentTest {
	public static void main(String[] args) {
		Human man = new Human("Steve", 30);
		System.out.println(man);
		
		Student student = new Student("Parker", 23, "Physics");
		System.out.println(student);
		
		
		student.setName("Peter");
		student.setAge(19);
		student.setMajor("computer");
		
	}
}
