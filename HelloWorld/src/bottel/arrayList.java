package bottel;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

class student2{
	int rollno;
	int age;
	String name;
	student2(int rollno, int age, String name)
	{
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}
}
public class arrayList {
	
    public static void main(String[] args) {
    	student2 s1=new student2(1,23,"Vinja"); 
    	student2 s2=new student2(2,24,"Romit"); 
    	student2 s3=new student2(3,25,"Vinod"); 
	ArrayList<String> al= new ArrayList<String>();
	al.add("Ram");
	al.add("Patel");
	al.add("Abc");
	al.add("Vinja");
	System.out.println(al);
	for(String str:al)
		System.out.println(str);
	ArrayList<String> al2= new ArrayList<String>();
	al2.add("Ram1");
	al2.add("Patel12");
	al2.add("Abc123");
	al2.add("Vinj1234a");
	al.addAll(al2);
	for(String str1:al)
		System.out.println(str1);
	List<student2> al1= new ArrayList<student2>();
	al1.add(s1);
	al1.add(s2);
	al1.add(s3);
//	Iterator itr=al1.iterator();  
//	  while(itr.hasNext()){ 
//		  student st=(student)itr.next();
	for(student2 st : al1)
	   System.out.println(st.rollno+" "+st.name+" "+st.age);
	
}
    }
