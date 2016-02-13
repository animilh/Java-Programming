package lesson5_String;

public class Car {
  String model;
  int maxSpeed;
  int currentSpeed;
  String color;
  int currentGear;
//  Person owner=new Person();
  Person owner;
  
  void accelerate(){
	  System.out.println("Accelerating ...");
  }
  void changeGearUp(){
	  if ((currentGear>=1)&&(currentGear<5)){
	  currentGear++;
	  }
  }
  void chandeGearDown(){
	  if ((currentGear>1)&&(currentGear<=5)){
	  currentGear--;
	  }
  }
  void changeGear(int nextGear){
	  if(nextGear<1||nextGear>5){
		  System.out.println("Beep");
	  }
	 //1. currentGear=nextGear;
	  for(int i=currentGear;i<=nextGear;i++){
		  changeGearUp();// vikane na method v method
	  }
  } 
  void changeColor(String newColor){
	  color=newColor;
  }
  
  
  
}
