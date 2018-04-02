package bottel;

import java.util.Hashtable;
import java.util.Map;

public class hashtable {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(10, "Sultan");
		ht.put(20, "Dangal");
		ht.put(30, "Raees");
		ht.put(40, "Bahuballi");
		for(Map.Entry<Integer, String> m: ht.entrySet())
		{
			int key =m.getKey();
			String str=m.getValue();
			System.out.println("Value for key:"+key);
			System.out.println(str);
		}
		ht.remove(10);
		System.out.println("After removing key 10:");
		System.out.println(ht);
	}

}
