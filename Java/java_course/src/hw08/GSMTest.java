package hw08;

public class GSMTest {
	public static void main(String[] args) {

		GSM mob1 = new GSM("Nokia");
		GSM mob2 = new GSM("LG");

		mob1.insertSimCard("0888123456");
		mob2.insertSimCard("0899345678");

		Call.setPriceForAMinute(0.32);

		mob1.Call(mob2, 4.5);
		mob2.Call(mob1, 7.6);

		System.out.println(mob1.getModel() + " has sum for all outgoing calls "
				+ mob1.getSumForCall() + " lv.");
		System.out.println(mob2.getModel() + " has sum for all outgoing calls "
				+ mob2.getSumForCall() + " lv.");

	}

}
