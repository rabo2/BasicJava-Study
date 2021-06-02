package Assignment5;

public abstract class Book {
	private int number;
	private String title;
	private String author;
	private static int countOfBooks = 0;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = ++this.countOfBooks;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean equals(Book book) {
		if (getTitle().equals(book.getTitle()) 
			&& getAuthor().equals(book.getAuthor())) {
			return true;
		}
		return false;
	}
	/**
	 * 연체료 계산 
	 * @param lateDays 연체일자
	 * @return 연체일
	 */
	abstract int getLateFee(int lateDays);

	@Override
	public String toString() {
		return String.format("관리번호 %s번, 제목: %s, 작가: %s", number, title, author);
	}

}
