package abc;

public class Book {
	Integer bookNumber;
	String bookTitle;
	String author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Integer bookNumber, String bookName, String auther) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookName;
		this.author = auther;
	}
	@Override
	public String toString() {
		return String.format("%-10s %-35s %-20s", bookNumber, bookTitle, author);
	}
	
	

}
