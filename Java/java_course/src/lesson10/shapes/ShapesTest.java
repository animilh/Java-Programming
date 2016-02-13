package lesson10.shapes;

public class ShapesTest {
	
	public static void main(String[] args) {
		Triangle abc=new Triangle(4.5,6,"ABC");
		Triangle def=new Triangle(3.5,5.6,"DEF");
		Rectangle abcd=new Rectangle(5,3,"ABCD");
		Rectangle efgh=new Rectangle(5,3,"EFGH");
		Circle k1=new Circle(2,2,"k1");
		Circle k2=new Circle(2,2,"k2");
		
		ShapesArray shapesArray=new ShapesArray();
		
		shapesArray.addShape(k2);
		shapesArray.addShape(k1);
		shapesArray.addShape(abcd);
		shapesArray.addShape(efgh);
		shapesArray.addShape(abc);
		shapesArray.addShape(def);
		
		for(int i=0;i<shapesArray.getShapes().length;i++){
			if(shapesArray.getShapes()[i]!=null){
				shapesArray.getShapes()[i].calculateSurface();
				shapesArray.getShapes()[i].printShape();
			}
		}
		
		Shape k3=new Circle(3,3,"k3");
		k3.calculateSurface();
		k3.printShape();
		
		Shape rkt=new Triangle(6,3,"RKT");
		rkt.calculateSurface();
		rkt.printShape();
		
		
		
	}

}
