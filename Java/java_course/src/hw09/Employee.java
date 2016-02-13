package hw09;

public class Employee extends Person {

	// attributes
	private static final int AGE_OVERTIME = 18;
	private static final int DAY_WORKING_HOURS = 8;
	private static final double OVERTIME_COEF = 1.5;
	private double daySalary;

	// constructor

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		this.setDaySalary(daySalary);
	}

	// methods

	public double calculateOvertime(double hours) {

		if (hours < 0) {
			System.out.println("Bad input for hours");
		}
		if (super.getAge() < AGE_OVERTIME) {
			return 0;
		} else {
			return this.getDaySalary() * hours * OVERTIME_COEF
					/ DAY_WORKING_HOURS;
		}

	}
@Override
	public void showPersonInfo() {
		super.showPersonInfo();
		System.out.println("Day salary : " + this.getDaySalary());
		// System.out.println();
	}

	public double getDaySalary() {
		return this.daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary <= 0) {
			System.out.println("Bad input for day salary!");
			return;
		} else {
			this.daySalary = daySalary;
		}
	}

}
