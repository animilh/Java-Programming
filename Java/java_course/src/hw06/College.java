package hw06;

public class College {

	public static void main(String[] args) {

		Student s1 = new Student("Deni", "Agricultural Economics",27);
		Student s2 = new Student("Ivo", "Agricultural Economics",28);
		Student s3 = new Student("Ani", "Agricultural Economics",31);
		Student s4 = new Student("Ivajlo", "Forestry", 29);
		Student s5 = new Student("Pesho", "Forestry",25);
		Student s6 = new Student("Meto", "Forestry",31);

		s1.grade = 5.60;
		s2.grade = 5.40;
		s3.grade = 5.00;
		s4.grade = 5.50;
		s6.grade = 5.80;

		s1.upYear();
		s2.upYear();
		s3.upYear();

		s2.receiveScholarship(5.00, 80.00);
		s3.receiveScholarship(5.00, 80.00);
		s4.receiveScholarship(5.00, 80.00);

		StudentGroup group1 = new StudentGroup("Agricultural Economics");
		StudentGroup group2 = new StudentGroup("Forestry");

		group1.addStudent(s1);
		group1.addStudent(s2);
		group1.addStudent(s3);
		group1.addStudent(s4);

		group2.addStudent(s4);
		group2.addStudent(s5);
		group2.addStudent(s6);

		System.out.println("The best student from group1 :"
				+ group1.theBestStudent());
		System.out.println("The best student from group2 :"
				+ group2.theBestStudent());

		group1.printStudentsInGroup();
		group2.printStudentsInGroup();
	}

}