package hw09;

public class DemoPersons {
	public static void main(String[] args) {

		Person[] persons = new Person[10];

		Person p1 = new Person("Wanq", 29, false);
		Person p2 = new Person("Pesho", 28, true);
		Student st1 = new Student("Dora", 30, false, 4.50);
		Student st2 = new Student("Lora", 25, false, 5.50);
		Employee emp1 = new Employee("Iwan", 17, true, 70);
		Employee emp2 = new Employee("Kalin", 32, true, 160);

		persons[0] = p1;
		persons[1] = p2;
		persons[2] = st1;
		persons[3] = st2;
		persons[4] = emp1;
		persons[5] = emp2;

		// System.out.println("Overtime of "+emp2.getName()+" is "+emp2.calculateOvertime(2));

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null)
				break;
//			if (persons[i] instanceof Person
//					&& !(persons[i] instanceof Student)
//					&& !(persons[i] instanceof Employee)) {
//				persons[i].showPersonInfo();
//				System.out.println();
//			}
//			if (persons[i] instanceof Student) {
//				((Student) persons[i]).showStudentInfo();
//				System.out.println();
//			}
//			if (persons[i] instanceof Employee) {
//				((Employee) persons[i]).showEmployeeInfo();
//				System.out.println();
//			}
			
			persons[i].showPersonInfo();
		}

		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				break;
			}
			
			if (persons[i] instanceof Employee) {
				System.out.println("Overtime of " + persons[i].getName()
						+ " is " + ((Employee) persons[i]).calculateOvertime(2)
						+ "lv.");
			}
		}
	}
}
