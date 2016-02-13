package lesson10.shapes;

public abstract class Shape {

	private double width;
	private double heigth;

	Shape(double width, double heigth) {
		this.setWidth(width);
		this.setHeigth(heigth);

	}
	
	Shape(){
		
	}

	public boolean isValid(double width, double heigth) {
		if (width < 0 || heigth < 0) {
			return false;
		} else {
			return true;
		}
	}

	public abstract double calculateSurface();

	public abstract void printShape();

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (!isValid(width, 1)) {
			System.out.println("Bad input for width!");
			return;
		}
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		if (!isValid(1, heigth)) {
			System.out.println("Bad input for heigth!");
			return;
		}
		this.heigth = heigth;
	}

}
