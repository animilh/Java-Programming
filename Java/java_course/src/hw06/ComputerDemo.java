package hw06;

public class ComputerDemo {
	public static void main(String[] args) {

		Computer c1 = new Computer(2010, 800.50, false, 900, 400, "Linux");
		Computer c2 = new Computer(2009, 540.90, 700, 200);

		if (c1.comparePrice(c2) == -1) {
			System.out.println("The price of c1 is bigger than c2.");
		} else {
			System.out
					.println("The price of c1 is smaller or equal to the price of c2.");
		}
	}

}
