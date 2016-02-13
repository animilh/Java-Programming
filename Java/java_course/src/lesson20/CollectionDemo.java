package lesson20;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class CollectionDemo {
 public static void main(String[] args) {
	List l=new ArrayList(); // mojesh da promenqsh obekta dali e Linked ili Array kakto reshish che ti e udobno (dali e efektiwno)
	l.add(new Object());
	l.add("String");
	l.add(9);
	l.add(null);
	
//	List l2=new LinkedList();
//	l2.
	
	Iterator it = l.iterator();
	
	while(it.hasNext()){
		Object element = it.next();
		System.out.println(element);
	}

	
	for (Object o : l){
		System.out.println(o);
	}

	
	
	
}
}
