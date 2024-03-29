package javaSessionsMarch2021;

public class TimeComplexity {

	public static void main(String[] args) {

		//TC -- > Big O
		/**
		 * time complexity it will let you know the performance of your code 
		 * how much time its taking to execute statements 
		 * 
		 * O(n)
		 * O(n^2) O n square
		 * O(n^3) O n qube
		 * O(n^n) O n n
		 * 
		 * 
		 */
		
		
		//O(1)//constant 
		//this code will execute only once thats why big O of one   --- >>   O(1)
		int i1 = 1;
		System.out.println(i1);
		
		
		
		for(int i=1;i<=1000000; i++) {
			System.out.println(i);
		}
		//n =1, 10, 100, 1000
		//O(n) //linear eq
		//1 + n + n + n => 1+3n ==> 3n+1 => 3n=> n => O(n)
		
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println("hiii");
			}
		}
		
		//n x n = n^2 ==> O(n^2)
		//(1 + n + n)(1+n+n+n) 
		//(1+2n)(1+3n)
		//keep removing the constants becoming n^2
		//1+3n+2n+6n^2 ==> 1+5n+6n^2 ==> 6n^2+5n+1 ==> 6n^2+5n=> n^2+n=> n(n+1)=> n(n)=> n^2
		//qudratic equation
		
		//n*n*n ==> n^3
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				for(int k=1; k<=5; k++) {
					System.out.println("hiii");
				}
			}
		}
	}

}