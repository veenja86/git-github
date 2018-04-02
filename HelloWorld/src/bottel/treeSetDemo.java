package bottel;

import java.util.TreeSet;

class book4 implements Comparable<book4>
{
	int id;
	String name, author, publisher;
	int quantity;
	book4(int id, String name, String author, String publisher, int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this .quantity=quantity;
	}
	public int compareTo(book4 o) {
		if(id>o.id)
			return 1;
		else if(id<o.id)
			return -1;
		else
		return 0;
	}
}
public class treeSetDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeSet<String> ts= new TreeSet<String>();
		TreeSet<String> ts1= new TreeSet<String>();
		ts.add("Vinja");
		ts.add("Patel");
		ts.add("Kalyanpur");
		for(String str:ts)
			System.out.println(str);
		ts1=(TreeSet<String>) ts.clone();
		System.out.println(ts1);
		TreeSet<book4> bt=new TreeSet<book4>();
		book4 b1=new book4(1,"Smith","Raman","JW",345);
		book4 b2=new book4(2,"Smith","Raman","NTC",345);
		book4 b3=new book4(3,"Smith","Raman","RJT",345);
		bt.add(b1);
		bt.add(b2);
		bt.add(b3);
		for(book4 b:bt)
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		
	}
}
