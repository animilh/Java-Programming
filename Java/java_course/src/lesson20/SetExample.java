package lesson20;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Set s= new TreeSet(); // tuk ima unikalni i sortirani elementi
		
		s.add(8);
		s.add(2);
		s.add(3);	
		s.add(-1);
		s.add(2);
		
		Iterator i=s.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
//		System.out.println(s.contains(13));
	}

}
