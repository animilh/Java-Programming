package lesson16;

public class OuterLocalClass {

	private int h;
	private static int h2;
	
	void testLocalClass() {
		int y;
		final int z = 10;
		
		class LocalClass { // inner class in the body of method testLocalClass() it has an access only to the final members of an enclosing code
			int x;
			
			void test(){
				//compilation error
//				System.out.println(y);
				System.out.println(z);
				System.out.println(h);
				System.out.println(h2);
			}
		}
		
		
	}
}

