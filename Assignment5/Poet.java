package Assignment5;

public class Poet extends Book {

	public Poet(String title, String author) {
		super(title, author);
	}
	@Override
	int getLateFee(int lateDays) {
		return lateDays*200;
	}

}
