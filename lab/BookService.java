package org.anudip.lab;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class BookService {
	// Method to arrange books by book number
	public List<Book> arrangeBooksNumberWise(List<Book> bookList) {
		// Creating a sorted list using the provided book list and sorting by book number
        List<Book> sortedList = new ArrayList<>(bookList);
        sortedList.sort(Comparator.comparing(Book::getBookNumber));
        return sortedList;
    }
	// Method to arrange books by book title
    public List<Book> arrangeBooksTitleWise(List<Book> bookList) {
    	// Creating a sorted list using the provided book list and sorting by book title
        List<Book> sortedList = new ArrayList<>(bookList);
        sortedList.sort(Comparator.comparing(Book::getBookTitle));
        return sortedList;
    }
    // Method to arrange books by author's name
    public List<Book> arrangeBooksAuthorWise(List<Book> bookList) {
    	// Creating a sorted list using the provided book list and sorting by author's name
        List<Book> sortedList = new ArrayList<>(bookList);
        sortedList.sort(Comparator.comparing(Book::getAuthor));
        return sortedList;
    }
}//end of class