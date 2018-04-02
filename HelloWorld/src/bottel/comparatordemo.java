package bottel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class student3 {
	int id;
	String name;
	int rollno;
	student3(int id, String name, int rollno){
		this.id=id;
		this.name=name;
		this.rollno=rollno;
	}
}
@SuppressWarnings("rawtypes")
class namecomparator implements Comparator{
	public int compare(Object o1, Object o2){
		student3 s1=(student3)o1;
		student3 s2=(student3)o2;
		return s1.name.compareTo(s2.name);
	}
}
@SuppressWarnings("rawtypes")
class rollnocomparator implements Comparator{
	public int compare(Object o1, Object o2){
		student3 s1=(student3)o1;
		student3 s2=(student3)o2;
		if(s1.rollno==s2.rollno)
			return 0;
		else if(s1.rollno>s2.rollno)
			return 1;
		else
			return -1;
	}
}
public class comparatordemo {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList<student3> al=new ArrayList<student3>();  
		al.add(new student3(101,"Vijay",23));  
		al.add(new student3(106,"Ajay",27));  
		al.add(new student3(105,"Jai",21)); 
		System.out.println("Sort acc to name:");
		Collections.sort(al, new namecomparator());
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			student3 s=(student3)itr.next();
			System.out.println(s.id+" "+s.name+" "+s.rollno);
		}
		System.out.println("Sort acc to rollno:");
		Collections.sort(al, new rollnocomparator());
		Iterator itr1=al.iterator();
		while(itr1.hasNext()){
			student3 s=(student3)itr1.next();
			System.out.println(s.id+" "+s.name+" "+s.rollno);
		}
	}
}
