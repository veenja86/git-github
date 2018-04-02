package bottel;

import java.util.EnumMap;
import java.util.Map;

class book7{
	int id;
	String name,author, publisher;
	int quantity;
	book7(int id, String name, String author, String publisher, int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}

}

public class enummap {
	public enum days{
		Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday,one,two, three
	};
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		EnumMap<days, String> em=new EnumMap<days, String>(days.class);
		em.put(days.Sunday, "7");
		em.put(days.Saturday, "6");
		em.put(days.Friday, "5");
		for(Map.Entry m: em.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
		EnumMap<days, book7> em1=new EnumMap<days, book7>(days.class);
		book7 b1=new book7(12,"Sunil", "Rangaswamy", "SLC", 345);
		book7 b2=new book7(13,"Sunil Narayan", "Rangaswamy reddy", "SLC", 459);
		book7 b3=new book7(14,"Sunil Prakash", "Rangaswamy Gowda", "SLC", 508);
		em1.put(days.one,b1);
		em1.put(days.two,b2);
		em1.put(days.three, b3);
		for(Map.Entry<days, book7> m:em1.entrySet()){
			book7 b=m.getValue();
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
			}
	}
}
