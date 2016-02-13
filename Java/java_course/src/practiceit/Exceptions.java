package practiceit;

public class Exceptions {

	public static void main(String[] args) {

		System.out.println(divide(4,9));

		if (args.length > 1) {

			int arg0 = Integer.parseInt(args[0]);

			int arg1 = Integer.parseInt(args[1]);

			System.out.println(divide(arg0, arg1));
		}
	}
	
	public static int divide(int a,int b){
		try{
			return a/b;			
		}
		catch (ArithmeticException e){
			System.out.println("You can\'t devide by zero!");
			return 0;
		}
		catch (NullPointerException ex){
			System.out.println("You can\'t divide by null!");
			return 0;
		}
		



	}
	
//	public static int divide(int a, int b) {
//
//		if (b == 0) {
//			throw new ArithmeticException("You can\'t devide by zero!");
//		}
//		return a / b;
//
//	}

}
