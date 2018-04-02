package bottel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionclass {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("C programming");
		list.add("C++");
		list.add("Python");
		System.out.println("Before adding nothing:"+list);
		String stra[]={"Machine Learning","Artificial Intelligence"};
		Collections.addAll(list, stra);
		System.out.println("After adding string array"+list);
		Collections.addAll(list,"Big Data", "Hadoop", "C#");
		System.out.println("After adding individual  number of string"+list);
		System.out.println("Binary search in collections:"+Collections.binarySearch(list, "Java"));
		System.out.println("Reverse List view:");
		Collections.reverse(list);
		System.out.println(list);
		 List<Integer> list1 = new ArrayList<Integer>();  
	        list1.add(46);  
	        list1.add(67);  
	        list1.add(24);  
	        list1.add(16);  
	        list1.add(8);  
	        list1.add(12);  
	        System.out.println("Value of minimum element from the collection: "+Collections.min(list1));  
	}
}
