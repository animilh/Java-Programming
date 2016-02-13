package Arrays;

public class ArrayComparison {
public static void main(String[] args) {
	int[] a1={2,3,4};
	int[] a2={2,3,4};
	
	a1=a2;// System.out.println(a1==a2); true
	
	 System.out.println(a1==a2);
	 
	 boolean qu=true;
	 if(a1.length!=a2.length){
		 System.out.println("Not equal");
		 
	 } else {
		for(int i=0;i<a1.length;i++){
			if(a1[i]!=a2[i]){
				qu=false;
				break;
			}System.out.println();
			System.out.println("Equal? "+qu);
		}
	 }
}
}
