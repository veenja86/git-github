package bottel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class javamap {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(12, "Vinja");
		m.put(54, "Ranjan");
		m.put(65, "Rakesh");
		for(Entry<Integer, String> mp: m.entrySet())
			System.out.println(mp.getKey()+" "+mp.getValue());
		// change to entry set 
		Set set=m.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Map.Entry entry=(Map.Entry)itr.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}   