package lesson20;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("Hello");
		list.add(15);

		list.add(5);

		list.add(3.14159);

		list.add(new Date());

//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//			
//		}
		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object element = it.next();
			System.out.println(element);
		}
		
        list.add(5, "Garga");		

		for (Object o : list) {
			System.out.println(o);
		}
		
		list.remove(0);
		for (Object o : list) {
			System.out.println(o);
		}
		
		

	}

}
