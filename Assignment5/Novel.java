package Assignment5;

public class Novel extends Book {
	
	public Novel(String title, String author) {
		super(title, author);
	}
	
	@Override
	int getLateFee(int lateDays) {
		return lateDays*300;
	}

}
