package abc;

import java.util.ArrayList;
import java.util.List;

public class Library {
private static ArrayList<Book> bookList = new ArrayList<>();
static {
	bookList.add(new Book(101,"Batul The Great","Debnath"));
	bookList.add(new Book(102,"Betal","Lee Falk"));
}
public static List<Book> getAllBooks(){
	return bookList;
}
}
