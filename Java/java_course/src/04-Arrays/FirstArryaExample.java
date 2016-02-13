package Arrays;

public class FirstArryaExample {
	public static void main(String[] args) {
		//int[] array = new int[10];
		//int[] array=null; - imame refenciq bez stojnost = null
//	int[] array={1,2,3};
//	System.out.println(array);// izkarwa referenciqta w stack-a k-to sochi kym heap
//	System.out.println(array[0]);//st-ta na masiva ot heap-a
	
	int [] array2=new int[10]; //syzdawame masiv s 10 el s referenciq array2
	
//	array2[0]=1;// otivame na referenciq array2 i vzimame element [0] = 1
	array2[0]=1;
	array2[9]=10;
	for (int i=0;i<array2.length;i++){
		
	System.out.println(array2[i]);	
	}
	
	}
	
}
