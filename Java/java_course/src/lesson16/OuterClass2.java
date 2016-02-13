package lesson16;

public class OuterClass2 {
	
	private String value;
	private static int count = 10;
	
	void useMemberFromTheInnerClass() {
		InnerClass ic = new InnerClass();
		System.out.println(ic.name);
	}
	
	class InnerClass { // inner class is associated with an instance of its enclosing class 
		private String name;
		//compilation error
		//private static String value="СофтАцад";
		
		public static final int NUMBER = 22;
		
		void useMembersFromTheOuterClass() {
			System.out.println(value);
			System.out.println(count);
		}
	}
}
