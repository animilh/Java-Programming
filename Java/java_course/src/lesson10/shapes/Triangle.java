package lesson10.shapes;

public class Triangle extends Shape {
	
	private String name;
		
		
	Triangle(double width, double heigth, String name){
		super(width, heigth);
		this.setName(name);
		
	}
	
	public double calculateSurface(){
			return super.getWidth()*super.getHeigth()/2;
				
	}
	
	public void printShape(){
		System.out.println("The surface of triangle "+this.getName()+" is "+this.calculateSurface());
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		if(name==null || name.equals("")){
			System.out.println("Bad input for name!");
		}
		else {
			this.name=name;
		}
	}

}
