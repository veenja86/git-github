package bottel;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequearray {
	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("Ajay");
		dq.add("Arjun");
		dq.add("Vijay");
		for(String str:dq)
			System.out.println(str);
		System.out.println("After offerFirst:");
		dq.offerFirst("Vinja");
		for(String str:dq)
			System.out.println(str);
		System.out.println("After pollfirst");
		dq.pollLast();
		for(String str:dq)
			System.out.println(str);
	}

}
