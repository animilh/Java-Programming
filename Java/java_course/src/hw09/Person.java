package hw09;

public class Person {

	// attributes

	private String name;
	private int age;
	private boolean isMale;

	// constructor

	public Person(String name, int age, boolean isMale) {
		setName(name);
		setAge(age);
		this.isMale = isMale;
	}

	// methods

	public void showPersonInfo() {
		System.out.println("Person name : " + this.getName());
		System.out.println("Age : " + this.getAge());
		System.out.println("Male? : " + this.isMale());
//		System.out.println();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		} else {
			System.out.println("Bad input for person's name!");
		}
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("Bad inout for person's age!");
			return;
		} else {
			this.age = age;
		}
	}

	public boolean isMale() {
		return this.isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

}
