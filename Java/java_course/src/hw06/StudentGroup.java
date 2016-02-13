package hw06;

public class StudentGroup {

	// attributes

	String groupSubject;
	Student[] students;
	byte freePlaces;

	// constructors

	StudentGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	StudentGroup(String subject) {
		this(); // calls the default constructor
		setGroupSubject(subject);
	}

	// methods

	void addStudent(Student s) {
		if(s==null){
			System.out.println("No student to add");
			return;
		}
		if ((this.groupSubject.equals(s.subject)) && (this.freePlaces > 0)) { // stringove srawnqwame samo s equals !!! 
			boolean placed = false;
			int i = 0;
			while ((i < this.students.length) && (!placed)) {

				if (students[i] == null) {
					students[i] = s;
					freePlaces--;
					placed = true;
				}
				i++;

			}

		} else {
			System.out.println("The subject of student " + s.name
					+ " differs from group's subject " + this.groupSubject
					+ " or no free places in the group");
		}

	}

	void emptyGroup() {
		Student[] students;
		freePlaces = 5;
	}

	String theBestStudent() {
		if(this.students[0]==null){System.out.println("The group is empty");} //prowerka dali nqmame studenti w groupata
		int indexMaxGrade = 0;
		int i = 1;
		while ((i < this.students.length) && (students[i] != null)) {
			if (students[indexMaxGrade].grade < students[i].grade) {
				indexMaxGrade = i;
			}
			i++;

		}
		return students[indexMaxGrade].name;
	}

	void printStudentsInGroup() {
		
		if(this.students[0]==null){System.out.println("The group is empty");}	//if(this.student[0]==null){..} prowerka dali nqmame studenti w groupata
		for (int i = 0; i < this.students.length; i++) {
			if (students[i] != null) {
				System.out.print("Name : " + this.students[i].name);
				System.out.print(", Grade : " + this.students[i].grade);
				System.out.print(", Year in college : "
						+ this.students[i].yearInCollege);
				System.out.print(", Subject : " + this.students[i].subject);
				System.out.println(", Money : " + this.students[i].money);
				
//				 System.out.print("Name : " + this.students[i].name+ ", Grade : "+ this.students[i].grade + this.students[i].grade + ", Year in college :"+ this.students[i].yearInCollege + ", Subject :" + this.students[i].subject+ "Money :"+this.students[i].money);
//				 + this.students[i].grade + ", Year in college :"
//				 + this.students[i].yearInCollege + ", Subject :"
//				 + this.students[i].subject, "Money :"+this.students[i].money);

				
				
			} else {
				break;

			}
		}
	}
	
	public String getGroupSubject() {
		return groupSubject;
	}	

	public void setGroupSubject(String groupSubject) {
		if(groupSubject==null||groupSubject.equals("")){
			
			System.out.println("Bad input for subject's group");
			return;
		}
		this.groupSubject = groupSubject;
	}

	
		
	}


