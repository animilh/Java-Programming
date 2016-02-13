package hw06;

public class Student {

	// attributes

	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	double money;

	// constructors

	Student() {

		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0.0;
	}

	Student(String name, String subject, int age) {

		this(); // calls the default constructor
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	// methods

	void upYear() {
		if (!isDegree) {
			yearInCollege++;
			if (yearInCollege == 4) {// prowerkata e po dobre da byde wytre za ne se izpylqwa wseki pyt !
				isDegree = true;
			}
		} else {
			System.out.println("The student had been degreed");
		}
	
	}

	double receiveScholarship(double min, double amount) {
		if ((this.grade >= min) && (this.age < 30)) {
			this.money += amount;
		}
		return this.money;
	}

}
