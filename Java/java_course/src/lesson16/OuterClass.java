package lesson16;

public class OuterClass {

	private int x;
	private static int y = 10;
	private InnerStaticClass isc;
	
	// can be private
	static class InnerStaticClass { //static nested class, it has an access only to the static members of outer class
		public static void accessMemberFromTheOuterClass() {
			System.out.println(y);
			//compilation error
//			System.out.println(x);
		}
		public void accessMemberFromTheOuterClass2() {
			System.out.println(y);
			//compilation error
			//System.out.println(x);
		}
		public static void main(String[] args) {
			System.out.println("Inner");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Outer");
	}
}

