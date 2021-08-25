package javaSessionsMarch2021;

public class LoopsConcept {

	public static void main(String[] args) {

		//loops: 
		//1. while:
		//1 to 10:
		
		int i = 1;
		while(i<=10) {
			System.out.println(i);//1 2 3 ...10
			//i++;
			//i=i+1;
			//i+=1;
			++i;
		}
		
		System.out.println("--------");
		
		int k = 1;
		while(k<=100) {
			System.out.println(k);
				if(k % 5 == 0) {
					System.out.println("hello...bye");
					break;
				}
			k++;
			
		}
		
		System.out.println("-------------");
		
		//2. for: 1 to 10:
		for(int p=1; p<=10; ) {
			System.out.println(p);//1 2
			p++;
		}
		
		System.out.println("-------------");

//		for(;;) {
//			System.out.println("welcome to Taj Hotel -- 365 x 7 x 24");
//		}
		
		//System.out.println("hello world");
		
		//print from a to z:
		//its not applicable for string 
		//because string not part of the numeric family but char yes
		for(char c='a'; c<='z'; c++) {
			System.out.print(c);//a b
		}
		
		System.out.println("-------------");

		for(double d=1.0; d<=5.0; d++) {
			System.out.println(d);
		}
		
		//even numbers: 0 2 4 6 8 10 
		for(int even=0; even<=10; even=even+2) {
			System.out.println(even);//0 2 4 6 
		}
		System.out.println("-------------");
		
		for(int even=0; even<=10;) {
			if(even % 2==0) {
				System.out.println(even);
			}
			even++;
		}
		
		//same examples with while loop
		//odd : 1 3 5 7 9
		//10 to 1
		
		System.out.println("-------------");

		
		String fruit = "cranberry";
		char first = fruit.charAt(0);
		char last = fruit.charAt(fruit.length()-1);
		
		System.out.println("first char " +first+ "" + " last char " + last );
		
		
		
	}

}