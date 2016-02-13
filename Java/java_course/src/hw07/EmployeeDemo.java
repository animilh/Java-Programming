package hw07;

public class EmployeeDemo {

	public static void main(String[] args) {

		Task t1 = new Task("Project1", 20);
		Task t2 = new Task("Project2", 7);
		Employee e1 = new Employee("Ignat");
		Employee e2 = new Employee("Temenuga");

		e1.setCurrentTask(t1);
		e2.setCurrentTask(t2);
		e1.setHoursLeft(5);
		e2.setHoursLeft(8);

		e1.work();
		e2.work();

//		e1.showReport();
//		e2.showReport();
//		e1.setName("");
//		e1.setName(null);
		

	}

}
