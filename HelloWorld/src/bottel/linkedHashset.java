package bottel;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Book2{
	int id;
	String name,Author;
	int quantity;
	Book2(int id, String name,String Author, int quantity){
		this .id=id;
		this.name=name;
		this.Author=Author;
		this.quantity=quantity;
	}
}
public class linkedHashset {
	public static void main(String[] args) {
		LinkedHashSet<String> lset=new LinkedHashSet<String>();
		lset.add("Vinja");
		lset.add("Kalyanpur");
		lset.add("patel");
		Iterator<String> itr=lset.iterator();
		while(itr.hasNext())
			System.out.println("Liked hashset list is:"+itr.next());
		LinkedHashSet<Book2> b=new LinkedHashSet<Book2>();
		Book2 b1=new Book2(1,"Williamson","Johnson",234);
		Book2 b2=new Book2(1,"Rogen","Southerland",34);
		Book2 b3=new Book2(1,"peter","Malik",454);
		b.add(b1);
		b.add(b2);
		b.add(b3);
		for(Book2 bk:b)
			System.out.println(bk.id+" "+bk.name+" "+bk.Author+" "+bk.quantity);
	}
}
