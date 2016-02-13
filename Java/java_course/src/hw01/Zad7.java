package HW1;

import java.util.Scanner;

public class Zad7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("zdraw=");
		boolean zdraw = sc.nextBoolean();

		System.out.print("sum=");
		double sum = sc.nextDouble();
		
		sc.close();

		if (zdraw == false) {// if (!zdraw)
			System.out.println("Zdraw? " + zdraw + " - nqma da izlizam na vyn");

			if (sum > 0) {
				System.out.println("Imam " + sum
						+ " lv. - shte si kupq lekarstva");
			} else {
				System.out.println("Imam " + sum
						+ " lv. - shte si stoq w kyshti i shte piq chaj");
			}
		} else {
			System.out.println("Zdraw? " + zdraw);
			if ((sum > 0) && (sum < 10)) {
				System.out.println("Imam " + sum + " lv. - shte otida na кафе");
			}
			if (sum >= 10) {
				System.out.println("Imam " + sum + " lv. - shte otida na bar");
			}
			if (sum <= 0) {
				System.out.println("Imam " + sum
						+ " lv. - shte otida na razhodka");
			}
		}
	}

}
