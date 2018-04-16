package LibrarySystem;
import java.io.Serializable;

public class Book implements Serializable{
	
	private int isbn;
	private String title, author;
	private double price;
	
	public Book(){
		isbn = 0;
		title = null;
		author = null;
		price = 0;
	}
	
	public Book(int isbn, String title, String author, double price){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public String toString(){
		return "\nTitle: " + title + "\nAuthor: " + author +
				"\nISBN: " + isbn + "\nPrice: " + price + "\n";
	}

}
