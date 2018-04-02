package bottel;

import java.util.LinkedList;
import java.util.List;

class Book{
	int id;
	String name, author, title,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class linkedList {
	public static void main(String[] args) {
		Book b1=new Book(1,"CN","John","Balaji",10);
		Book b2=new Book(2,"OS","Smith","Balaji",30);
		Book b3=new Book(3,"DAA","William","Balaji",25);
		List<Book> list= new LinkedList<Book>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		for(Book b:list)
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}

}
