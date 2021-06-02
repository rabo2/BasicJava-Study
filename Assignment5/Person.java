package Assignment5;


public class Person implements Comparable {
	private String name;
	private double height;

	public Person() {
	}

	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static String getTallest(Person[] people) {
		int maxIndex = MyArrays.getMaximum(people);
		return	people[maxIndex].getName(); 
	}// people[max].getName(

	@Override
	public String toString() {
		return String.format("이름: %s, 키: %s", name, Math.round(height * 10) / 10.0);
	}
	
	@Override
	public int compareTo(Object o) {
		// Person person = (Person) obj;
		// if (getHeight() == person.getHeight()) {
		// return 0;
		// } else if (getHeight() < person.getHeight()) {
		// return -1;
		// } else {
		// return 1;
		//
		// }
		Double heightD = height;
		if (heightD.compareTo(((Person) o).getHeight()) > 0) {
			return 1;
		} else if (heightD.compareTo(((Person) o).getHeight()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}
