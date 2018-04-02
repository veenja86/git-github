package bottel;

import java.util.PriorityQueue;
import java.util.Queue;

class Book3 implements Comparable<Book3>{  
	int id;  
	String name,author,publisher;  
	int quantity;  
	public Book3(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}
	public int compareTo(Book3 o) {
		if(id>o.id)
			return 1;
		else if (id<o.id)
			return -1;
		else
		return 0;
	}
}
public class queue {
	public static void main(String[] args) {
		Queue<Book3> pq = new PriorityQueue<Book3>();
		Book3 b1=new Book3(1,"asdf","Rama","ATC",245);
		Book3 b2=new Book3(2,"Yes","Ramalingham","BTC",645);
		Book3 b3=new Book3(3,"assdfdf","Ram","ATC",1455);
		pq.add(b1);
		pq.add(b2);
		pq.add(b3);
		for(Book3 b:pq)
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		PriorityQueue<String> que = new PriorityQueue<String>();
		que.add("Vinja");
		que.add("Vijay");
		que.add("Ajay");
		que.add("Raj");
		System.out.println("Before deletion:");
		for(String str:que)
			System.out.println(str);
		que.remove();
		que.poll();
		System.out.println("Head value: "+que.peek());
		System.out.println("Insert element:Sonu-"+que.offer("Sonu"));
		System.out.println("After deletion :");
		for(String str1:que)
			System.out.println(str1);
	}
}
