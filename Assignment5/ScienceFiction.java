package Assignment5;

public class ScienceFiction extends Book {

	public ScienceFiction(String title, String author) {
		super(title, author);
	}
	@Override
	int getLateFee(int lateDays) {
		return lateDays*600;
	}

}
