package lesson21;

import java.util.ArrayList;
import java.util.List;

public class Cages<T extends Animal> {
	  List<T> animals;
	
	Cages(){
		this.animals=new ArrayList<T>();
	}
	
	void add(T animal){
		if(animal!=null){
		animals.add(animal);
		}
	}
	
	public <R extends Animal> boolean isContained(R animal){
		return animals.contains(animal);
	}
	
    void cleanCage(Cages<? extends Animal> cage){
    	cage.animals.clear();
    	
    }
	
	

}
