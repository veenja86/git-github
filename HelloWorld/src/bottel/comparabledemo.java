package bottel;

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>{
	int id;
	String name;
	int rollno;
	Student1(int id, String name, int rollno){
		this.id=id;
		this.name=name;
		this.rollno=rollno;
	}
	public int compareTo(Student1 o) {
		if(rollno==o.rollno)
			return 0;
		else if(rollno>o.rollno)
			return 1;
		else
			return -1;
	}
}
public class comparabledemo {
	public static void main(String[] args) {
		ArrayList<Student1> al=new ArrayList<Student1>();
		al.add(new Student1(12,"Vinja",82));
		al.add(new Student1(15,"Vinit",87));
		al.add(new Student1(14,"Vivek",82));
		Collections.sort(al);
		for(Student1 st:al)
			System.out.println(st.id+" "+st.name+" "+st.rollno);
	}
}
