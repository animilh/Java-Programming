package lesson08;

public class WorkDemo {
	public static void main(String[] args) {
		
		AllWork allWork = new AllWork();
		for(int i=0;i<allWork.getFreePlacesForTasks();i++)
		System.out.println(allWork.getTasks()[i]+" ");
		System.out.println(allWork.getTasks());

		Task t1 = new Task("Task 1", 15);
		Task t2 = new Task("Task 2", 4);
		Task t3 = new Task("Task 3", 6);
		Task t4 = new Task("Task 4", 1);
		Task t5 = new Task("Task 5", 32);
		Task t6 = new Task("Task 6", 40);
		Task t7 = new Task("Task 7", 18);
		Task t8 = new Task("Task 8", 2);
		Task t9 = new Task("Task 9", 3);
		Task t10 = new Task("Task 10", 2);
		
		allWork.addTask(t1);
		allWork.addTask(t2);
		allWork.addTask(t3);
		allWork.addTask(t4);
		allWork.addTask(t5);
		allWork.addTask(t6);
		allWork.addTask(t7);
		allWork.addTask(t8);
		allWork.addTask(t9);
		allWork.addTask(t10);

		Employee.setAllWork(allWork);

		Employee emp1 = new Employee("Ivan");
		Employee emp2 = new Employee("Niki");
		Employee emp3 = new Employee("Tina");

		int day = 1;
		while (true) {
			System.out.println("Starting working day " + day);
			if (allWork.isAllWorkDone()) {
				System.out.println("No more work");
				break;
			}
			emp1.startWorkingDay();
			emp2.startWorkingDay();
			emp3.startWorkingDay();
			emp1.work();
			emp2.work();
			emp3.work();

			day++;
		}

	}

}
