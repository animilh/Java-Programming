package lesson10.shapes;

public class Rectangle extends Shape {

	// attributes
	String name;

	// Constructor
	Rectangle(double width, double heigth, String name) {
		super(width, heigth);
		this.setName(name);

	}

	// methods
	public double calculateSurface() {
		return super.getWidth() * super.getHeigth();
	}

	public void printShape() {
		System.out.println("The surface of rectangle " + this.getName()
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
