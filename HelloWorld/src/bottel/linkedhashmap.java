package bottel;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lmap =new LinkedHashMap<Integer, String>();
		lmap.put(123, "Sangram");
		lmap.put(234, "Sujot");
		lmap.put(456, "Nivideta");
		System.out.println(lmap);
		lmap.remove(123);
		System.out.println(lmap.get(234));
		for(Map.Entry m:lmap.entrySet())
			System.out.println(m.getKey()+" "+m.getValue());
	}

}
