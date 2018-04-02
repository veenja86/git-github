package bottel;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class vectorandlist {
	@SuppressWarnings({"rawtypes" })
	public static void main(String[] args) {

	List<String> al=new ArrayList<String>();
	al.add("Vinja");
	al.add("Vijay");
	al.add("Vikas");
	Iterator itr=al.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	Vector<String> v=new Vector<String>();
	v.add("Ramesh");
	v.addElement("Suresh");
	v.addElement("Rakesh");
	Enumeration e=v.elements();
	while(e.hasMoreElements())
		System.out.println(e.nextElement());
}
}
