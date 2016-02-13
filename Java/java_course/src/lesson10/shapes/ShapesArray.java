package lesson10.shapes;

public class ShapesArray {

	// attributes

	private static final int NUMBER_OF_SHAPES = 10;
	private Shape[] shapes;

	// constructor

	ShapesArray() {
		shapes = new Shape[NUMBER_OF_SHAPES];
	}

	// methods

	public void addShape(Shape newShape) {
		if (newShape == null) {
			System.out.println("No shape to add!");
			return;
		} else {
			for (int i = 0; i < shapes.length; i++) {
				if (shapes[i] == null) {
					shapes[i] = newShape;
					System.out.println("Shape " + shapes[i] + " is added.");
					break;
				}
			}
		}
	}

	public Shape[] getShapes() {
		return shapes;
	}

	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}
}
