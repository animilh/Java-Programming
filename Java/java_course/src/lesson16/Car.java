package lesson16;

public class Car {
//	
//	 int power=100;
//	
//	class Engine{
//		void printCarPower(){
//			System.out.println(power);
//		}
//	}

		
			class Engine{ // inner class 
				int power=100;
				// ne moje da imame statichni metodi w inner class 
			}
			
			void printCarPower(){
				Engine e=new Engine(); // trqbwa ni instanciq da dostypim atribut na vytreshniq klas
				System.out.println(e.power);
			}
}
