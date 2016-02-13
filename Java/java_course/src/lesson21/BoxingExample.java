package lesson21;

import java.util.ArrayList;
import java.util.List;

public class BoxingExample {
	public static void main(String[] args) {
		Integer v=8;
		v++;
		Integer i1=new Integer(9); // boxing convertirane na primitiven tip w negoviq syotvetstvasht klass (Object)
		int b=v+10; // unboxing convert ot Object (syotvetstvshtiq klas na primitivniq tip) kym primitiven tip 
		// syshteshtvuvat ot java 1.5 boxing i unboxing
		
		List l=new ArrayList();
		for(int i=0;i<10;i++){
			l.add(i);
		}
		
		Integer intObj=new Integer(10);
		Integer intObj1=new Integer(10);
		System.out.println(intObj==intObj1); // sravnqwame referenciite
		System.out.println(intObj.equals(intObj)); // sravnqvame stojnostite
		System.out.println(intObj==10); // boxing na intObj do primitiva 10 -> true
	}

}
