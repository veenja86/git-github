package bottel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class sortcollection {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Vikas");
		al.add("Sumit");
		al.add("Sujoy");
		al.add("Vinit");
		al.add("Ronit");
		Collections.sort(al);
		Iterator itr=al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		ArrayList al1=new ArrayList();
		al1.add(Integer.valueOf(234));
		al1.add(Integer.valueOf(345));
		al1.add(Integer.valueOf(734));
		al1.add(98);
		System.out.println("Before sort:"+al1);
		Collections.sort(al1);
		System.out.println("After sort:"+al1);
	}

}
