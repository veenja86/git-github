package bottel;

import java.util.*;

class Book1{
	int id;
	String name,Author;
	int quantity;
	Book1(int id, String name,String Author, int quantity){
		this .id=id;
		this.name=name;
		this.Author=Author;
		this.quantity=quantity;
	}
}
public class hashset {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Vinjaa");
		hs.add("APatel");
		hs.add("Kalyanpur");
		for(String str:hs)
			System.out.println(str);
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		HashSet<Book1> set=new HashSet<Book1>();
		Book1 b1=new Book1(1,"Wilfird","Zyan",56);
		Book1 b2=new Book1(11,"Wilfird Johanson","Zyan Malik",346);
		Book1 b3=new Book1(12,"Kelloy John","Justin",536);
		set.add(b1);
		set.add(b2);
		set.add(b3);
		for(Book1 b:set)
			System.out.println(b.id+" "+b.name+" "+b.Author+" "+b.quantity);
	}
}
