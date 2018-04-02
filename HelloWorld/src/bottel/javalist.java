package bottel;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class BookList {  
	int id;  
	String name,author,publisher;  
	int quantity;  
	public BookList(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}  
}
public class javalist {
	public static void main(String[] args) {
		BookList b1=new BookList(1,"data","Killy","Arihant",23);
		BookList b2=new BookList(2,"dataWork","Kelloy","Arihant",24);
		BookList b3=new BookList(3,"database","Jinley","Arihant",38);
		List<BookList> ls=new ArrayList<BookList>();
		ls.add(b1);
		ls.add(b2);
		ls.add(b3);
		for(BookList b:ls)
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		ArrayList<String> list =new ArrayList<String>();
		list.add("Vinja");
		list.add("Patel");
		list.add(1, "Ram");
		list.add("Araba");
		System.out.println("Array list item at postion 1:"+list.get(1));
		for(String s:list)
			System.out.println(s);
		ListIterator<String> str=list.listIterator();
		System.out.println("Array iterator list item at postiton 2:"+list.get(2));
		System.out.println("Forward direction:");
		while(str.hasNext())
			System.out.println(str.next());
		System.out.print("Backward direction:");
		while(str.hasPrevious())
		System.out.println( str.previous());
	}
}
