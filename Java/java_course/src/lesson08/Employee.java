package lesson08;

public class Employee {

	// attributes

	private static final int HOURS_WORKING_FOR_DAY = 8;

	private String name;
	private Task currentTask;
	private int hoursLeft; // Employee's working hours left till the end of the
							// day
	private static AllWork allWork;

	// constructor

	Employee(String name) {
		setName(name);
		// if (name != null) {
		// this.name = name;
		// }
		this.hoursLeft = HOURS_WORKING_FOR_DAY;

	}

	// methods

	public void startWorkingDay() {
		this.hoursLeft = HOURS_WORKING_FOR_DAY;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		} else {
			System.out.println("Bad input for employee's name");
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null && !currentTask.equals("")) {
			this.currentTask = currentTask;
		} else {
			System.out.println("Bad input for current task");
		}

	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		} else {
			System.out.println("Bad input for hours left");
		}
	}

	public static AllWork getAllWork() {
		return allWork;
	}

	public static void setAllWork(AllWork allWork) {
		Employee.allWork = allWork;
	}

	public void work() {
		while (this.hoursLeft >= 0) {
			if (this.currentTask.getWorkingHours() == 0
					|| this.currentTask == null) {
				this.currentTask = Employee.getAllWork().getNextTask();
				System.out.println("Assigning " + this.currentTask.getName()
						+ " to " + this.getName());

				if (this.currentTask == null) {
					System.out.println("No work to be done.");
					return;
				}
			} else {
				if (this.currentTask != null) {
					if (this.hoursLeft >= this.currentTask.getWorkingHours()) {
						int empHours = this.hoursLeft
								- this.currentTask.getWorkingHours();
						this.currentTask.setWorkingHours(0);
						this.setHoursLeft(empHours);
						this.currentTask = this.allWork.getNextTask();
						System.out.println(this.name + " is working on task "
								+ this.getCurrentTask().getName() + " for "
								+ this.currentTask.getWorkingHours());
					} else {

						int taskLeftHours = this.currentTask.getWorkingHours()
								- this.hoursLeft;
						this.currentTask.setWorkingHours(taskLeftHours);
						System.out.println(this.name + " is working on task "
								+ this.getCurrentTask().getName() + " for "
								+ this.hoursLeft);
						this.setHoursLeft(0);

					}
				}
				// else{
				// this.currentTask=this.allWork.getNextTask();
				//
				// }
			}
		}

	}

	public void showReport() {
		System.out.println("Name of Employee : " + this.name);

		System.out.println("Employee's hours left : " + this.hoursLeft);
		if (this.currentTask != null) {
			System.out.println("Task name : " + this.currentTask.getName());
			System.out.println("Task's hours left : "
					+ this.currentTask.getWorkingHours());
			System.out.println();
		}
	}
}
