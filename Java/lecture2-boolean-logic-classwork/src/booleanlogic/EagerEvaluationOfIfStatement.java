package booleanlogic;

import java.util.ArrayList;
import java.util.List;

public class EagerEvaluationOfIfStatement {
	public static void main(String[] args){
		List<String> someList = null;
        List<String> otherList = new ArrayList<>();
		//eager evaluation of if statement izchislqwa se posledowatelno otdelnite usloviq
        // v if-a ne se slagat metodi sys starnichni efekti (pechatat, prawqt wryzka s bazata i t.n.)
		if (someList != null && someList.isEmpty()){
			System.out.println("bla bla");
		}
		
		if (someList == null || someList.isEmpty()){
			System.out.println("do bla bla ...");
		}
		
		System.out.println("End of program");
	}

}
