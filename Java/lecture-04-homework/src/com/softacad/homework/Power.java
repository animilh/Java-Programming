package com.softacad.homework;
public class Power {

	public static void main(String[] args) {
		int x = 2;
		int y = 8;
		long start1 = System.nanoTime(); // 1/1/1970
		long end1 = System.nanoTime();
		long time1 = end1 - start1;
		long result1 = power1(x, y);
		System.out.println("Toni power1 took "+time1+" result1 "+result1);
		
		long start2 = System.nanoTime();
		long end2 = System.nanoTime();
		long result2 = power2(x, y);
		long time2 = end2 - start2;
		System.out.println("Moni power2 took "+time2+" result2 "+result2); 
		
		long start3 = System.nanoTime(); // 1/1/1970
		long end3 = System.nanoTime();
		long time3 = end3 - start3;
		long result3 = power3(x, y);
		System.out.println("Boni power3 took "+time3+" result3 "+result3);

	}
	
	public static long power1(int x, int y){
		if (y == 0){
			return 1;
		}
		return power1(x , y-1) * x;
	}
	
	private static long power2(int x, int y) {
		if(y==1){
			return x; // 1
		}
		if(y==0){
			return 1; // 1
		}
		if(y % 2 == 0){ // 1
		return power2(x * x, y/2);
		} else {
			return power2(x * x, y / 2) * x; // 3 instructions (x*x, y/2, *x)
		}
	}
	/* T(n) = T(n/2) + 6 -> T(n) = T(n/16) + 6 + 6 + 6 + 6
	 * T(1) = 1
	 * T(n/2) = T(n/4) + 6 -> T(n/2) = T(n/8) + 6 + 6
	 * T(n/4) = T(n/8) + 6
	 * T(n/8) = T(n/16) + 6
	 * 
	 * 
	 * T(n) = T(n*2^-3) +3*6
	 * T(n) = T(n*2^-4)^+ 4 * 6 -> T(n*2^-k) + k*6 - iskame da mahneme T(n) w dqsno
 * wkarwame dynoto na rekursiqta T(1) = 1
	 * n*2^-k = 1 -> n = 2^k  -> log n = log 2^^k = k log 2 = k
	 * -> pri k = log n T(n*2^-k) = 1
	 * -> T(n) = 1 + 6 * log n
	 *   
	 * 
	 */
	

	
	private static long power3(int x, int y) {
		if ( y == 0){
			return 1;
		}
		
		int result = 0;
		for (int i=0; i<x; i++){
			result += power3(x, y-1);
		}		
		return result;
	}
}
