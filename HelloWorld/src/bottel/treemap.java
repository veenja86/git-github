package bottel;

import java.util.Map;
import java.util.TreeMap;

class book6{
	int id;
	String author,name;
	int quantity;
	book6(int id ,String name, String author, int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.quantity=quantity;
	}
}
public class treemap {
	public static void main(String[] args) {
		TreeMap<Integer, book6> tmap=new TreeMap<Integer, book6>();
		book6 b1=new book6(12,"Priyank","Mayank",234);
		book6 b2=new book6(13,"Priyank Sharma","Mayank Agarwal",324);
		book6 b3=new book6(14,"Priyank Juneja","Mayank Patel",434);
		tmap.put(1, b1);
		tmap.put(2, b2);
		tmap.put(3, b3);
		for(Map.Entry<Integer, book6> m:tmap.entrySet()){
			int key=m.getKey();
			book6 b=m.getValue();
			System.out.println("Book details for key:"+key);
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
		}
		tmap.remove(2);
		System.out.println("After removing key 2, Remaining key's value are: ");
		for(Map.Entry<Integer, book6> m:tmap.entrySet()){
			int key=m.getKey();
			book6 b=m.getValue();
			System.out.println("Book details for key:"+key);
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
		}
	}
}