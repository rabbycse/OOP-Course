package LibrarySystem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library extends Object implements Serializable {
	
	private List<Book> collection;

	public Library(){
		collection = new ArrayList<Book>();
	}
	
	public void addBook(Book book){
		collection.add(book);
		
	}

}
