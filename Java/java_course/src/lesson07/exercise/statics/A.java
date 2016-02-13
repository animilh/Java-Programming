package lesson07.exercise.statics;

public class A {
	public static int x=0; // kato se promeni st-a na static pole nqkyde w klasa se promenq nawsqkyde !!!
	public int y=4;
	
	public A(int x,int y){
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		A a1=new A(2,3);
		A a2=new A(7,9);
		
		System.out.println(a1.x);
		System.out.println(a2.y);
		a2.y++;
		a1.x+=a2.y;
		System.out.println(a1.x);
		a2.y=a1.y-1;
		System.out.println(a2.y);
	}

}
