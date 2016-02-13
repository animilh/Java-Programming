package lesson07.exercise.package1;

public class Pet {

    public final String name="Pirin";
    public final Person owner;
    
//	public  String name; // ako nqma modificator za dostyp - znachi attributa ili klasa se wijda samo w paketa !!
   
    Pet(Person owner){
    	this.owner=owner;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name==null||name.equals("")){
			System.out.println("Invalid name!");
			return;
		}
		System.out.println("The name "+name);
	}
}
