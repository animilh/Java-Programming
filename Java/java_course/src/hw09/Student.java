package hw09;

public class Student extends Person {

	// attributes

	private static final double MIN_SCORE = 2.0;
	private static final double MAX_SCORE = 6.0;
	private double score;

	// constructor

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale); // pyrvo vikame konstructora na roditelskiq
									// klas
		this.setScore(score);
	}

	// methods
	@Override
	public void showPersonInfo() {
		super.showPersonInfo();
		System.out.println("Student score : " + this.getScore());
		// System.out.println();
	}

	private boolean checkScore(double score) {
		return score >= MIN_SCORE && score <= MAX_SCORE;
	}

	public double getScore() {
		return this.score;
	}

	public void setScore(double score) {
		if (checkScore(score)) {
			this.score = score;
		} else {
			System.out.println("Bad input for score!");
		}

	}

}
