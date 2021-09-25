package javaSessionsMarch2021;

public class RecursiveFunction {

	public static void main(String[] args) {
		
		
		printNumbers(1);
		
		
	}
	
	
	public static void printNumbers(int num) {
		if(num<=100) {
		System.out.println(num);
		num++;
		printNumbers(num);
		}	
		
	}

}


/**
 * 
 * recursive function means method calling itself 
 * here in above example im printing 1-to-100 without using loop concept 
 * just recursive function
 * 
 * 
 */


// factorial number of 5  -> 5*4*3*2*1=120
//fatorial of 1 = 1
//factorial of 0 = 1