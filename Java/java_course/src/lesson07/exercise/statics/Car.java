package lesson07.exercise.statics;

public class Car {
static int carsCreated; // static methodi i attributi se asociirat s klasa A NE S OBEKTITE !!
Car(){
	Car.carsCreated++;
}
}
