package LibrarySystem;
import java.util.Scanner;

public class MainSystem {
	static String fileName = null;
	static Library lib = new Library();
	static Scanner in = new Scanner(System.in);
	static Boolean running = true;

	public static void main(String[] args) {
		while (running) {
			System.out.println("\nEnter 1 for add book to library"
		                     + "\nEnter 2 for list all books in library");
					

			int answer = in.nextInt();
			switch (answer) {
			case 1:
				addBook();
				break;
			case 2:
				System.out.println(lib.toString());
				break;
			
			}
		}
		System.exit(0);
	}

	private static void addBook() {
		// TODO Auto-generated method stub
		int isbn;
		String title, author;
		double price;

		System.out.println("\nEnter Title: ");
		title = in.next();

		System.out.println("\nEnter Author: ");
		author = in.next();

		System.out.println("\nEnter ISBN: ");
		isbn = in.nextInt();

		System.out.println("\nEnter Price: ");
		price = in.nextDouble();

		Book b = new Book(isbn, title, author, price);
		lib.addBook(b);
	}

	
}


