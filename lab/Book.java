package org.anudip.lab;
public class Book {
	private Integer bookNumber;
    private String bookTitle;
    private String author;
 // Default constructor
    public Book() {
    }
    // Parameterized constructor
    public Book(Integer bookNumber, String bookTitle, String author) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
        this.author = author;
    }
 // Getter for the book's number
    public Integer getBookNumber() {
        return bookNumber;
    }
 // Setter for the book's number
    public void setBookNumber(Integer bookNumber) {
        this.bookNumber = bookNumber;
    }
 // Getter for the book's title
    public String getBookTitle() {
        return bookTitle;
    }
 // Setter for the book's title
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
 // Getter for the book's author
    public String getAuthor() {
        return author;
    }
    // Setter for the book's author
    public void setAuthor(String author) {
        this.author = author;
    }
 // Overriding the toString() method to customize the string representation
    @Override
    public String toString() {
        return String.format("%-10s %-35s %-20s", bookNumber, bookTitle, author);
    }
}//end of class