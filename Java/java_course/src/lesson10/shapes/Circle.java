package lesson10.shapes;

public class Circle extends Shape {
	
	// attributes
	private static final double PI= 3.14;
	private String name;

	// Constructor
	Circle(double width,double heigth, String name) {
		if(width!=heigth){
			System.out.println("Bad input for circle's radius!");
			return;
		}
		super.setWidth(width);
		super.setHeigth(heigth);
		this.setName(name);

	}

	// methods
	public double calculateSurface() {
		return PI * super.getWidth() * super.getHeigth();
	}

	public void printShape() {
		System.out.println("The surface of circle " + this.getName()
				+ " is " + this.calculateSurface());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.equals("")) {
			System.out.println("Bad input for name!");
			return;
		} else {
			this.name = name;
		}
	}

}


