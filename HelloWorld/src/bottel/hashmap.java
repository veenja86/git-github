package bottel;

import java.util.HashMap;
import java.util.Map;

class book5{
	int id;
	String name,author, publisher;
	int quantity;
	book5(int id, String name, String author, String publisher, int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}

public class hashmap {
	public static void main(String[] args) {
		HashMap<Integer, book5> map=new HashMap<Integer, book5>();
		book5 b1=new book5(12,"Sunil", "Rangaswamy", "SLC", 345);
		book5 b2=new book5(13,"Sunil Narayan", "Rangaswamy reddy", "SLC", 459);
		book5 b3=new book5(14,"Sunil Prakash", "Rangaswamy Gowda", "SLC", 508);
		map.put(1,b1);
		map.put(2, b2);
		map.put(3, b3);
		for(Map.Entry<Integer, book5> m:map.entrySet()){
			int key=m.getKey();
			book5 b=m.getValue();
		System.out.println("Book details for key:"+key);
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		System.out.println(map.containsKey(2));
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map.values());
	}
}
