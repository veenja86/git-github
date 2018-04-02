package bottel;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days{
	sunday, monday, tuesday, wednesday, thursday, friday, saturday
}
public class enumset {
	public static void main(String[] args) {
		Set<days> set=EnumSet.of(days.sunday,days.saturday);
		Iterator<days> itr =set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		Set<days> set1=EnumSet.allOf(days.class);
		System.out.println("Week days:"+set1);
		Set<days> set2=EnumSet.noneOf(days.class);
		System.out.println("Week days:"+set2);
		Set<days> set3=EnumSet.copyOf(set1);
		System.out.println("After copying set1 to set 3:"+set3);
	}
}
