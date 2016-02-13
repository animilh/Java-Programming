package hack_bulgaria;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {
	public static void main(String[] args) {
		Map alphabet = new HashMap();
		int count=0;
		for (int i=65; i<=90; i++){
			alphabet.put((char) i, count++);
		}
		count=0;
		for (int i=97; i<=122; i++){
			
			
		}
		
//		studentsAndGrades.put("Ivancho", 3.0);
//		studentsAndGrades.put("Petarcho", 6.0);
//		studentsAndGrades.put("Mariika", 2.0);
//		if (!studentsAndGrades.containsKey("Mariika"))
//			studentsAndGrades.put("Mariika", 3.0);
//		// studentsAndGrades.put(null, 2.0);
//
		Set keys = alphabet.keySet();
		Iterator i = keys.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			System.out.print(o+", ");
			System.out.println(alphabet.get(o));
		}
//
//		for (Object o : keys) {
//			System.out.println(o);
//			System.out.println(studentsAndGrades.get(o));
//		}
	}

}
