package org.anudip.lab;
import java.util.List;
import java.util.Scanner;
public class BookMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Creating a BookService instance to manage book arrangements
        BookService bookService = new BookService();
     // Getting the list of books from the Library class
        List<Book> books = Library.getAllBooks();
     // Infinite loop for the main menu
        while (true) {
            System.out.println("Menu\n");
            System.out.println("1. Display Book Number-wise");
            System.out.println("2. Display Book Title-wise");
            System.out.println("3. Display Book Author-wise");
            System.out.println("4. Exit");
            System.out.print("\nEnter choice (1-4): ");
         // Reading user's choice from input
            int choice = scanner.nextInt();
            List<Book> sortedBooks;
         // Switch case based on the user's choice
            switch (choice) {
                case 1:
                	// Arranging books by book number
                    sortedBooks = bookService.arrangeBooksNumberWise(books);
                    break;
                case 2:
                	// Arranging books by book title
                    sortedBooks = bookService.arrangeBooksTitleWise(books);
                    break;
                case 3:
                	// Arranging books by author's name
                    sortedBooks = bookService.arrangeBooksAuthorWise(books);
                    break;
                case 4:
                	// Exiting the program
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                	// Handling invalid choice
                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
                    continue;
            }
         // Displaying the header of the book list
            System.out.println("\nBook Number          Book Title                          Author");
            System.out.println("------------------------------------------------------------------");
         // Displaying each book in the sorted list
            for (Book book : sortedBooks) {
                System.out.println(book);
            }

            System.out.println();
            }
        }//end of main
	}//end of class
