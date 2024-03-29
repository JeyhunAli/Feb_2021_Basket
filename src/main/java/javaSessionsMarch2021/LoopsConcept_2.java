package javaSessionsMarch2021;

public class LoopsConcept_2 {

	public static void main(String[] args) {

		
		/**
		 * incremental not working with string 
		 * but it works with char
		 * the reason behind that char is coming from nummeric data family 
		 * 
		 */
		
		
		//loops: 
		//1. while:
		//1 to 10:
		
		int i = 1;
		while(i<=10) {
			System.out.println(i);//1 2 3 ...10
			//i++;
			//i=i+1;
			//i+=1;
			//these three are same
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
		for(char c='a'; c<='z'; c++) {
			// System.out.print(c);   this will print from a to z alphabet
			System.out.print(c+0 + " ");    // this will print char ascii values from a to z values 
			
			
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
		
		//even numbers: 0 2 4 6 8 10 
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
		
		for(int rev=10; rev>=0; rev--) {
			System.out.println(rev + " -> rev");
		}
		
		
		
        System.out.println("-------------");
		
        for(int odd=10; odd>=0; odd--) {
			if(odd % 2==1) {
				System.out.println("odd " +odd);
			}
			
		}
		
		
		
		System.out.println("-------------");

		//3. do-while:
		int h = 1;
		do {
			System.out.println(h);//1
			h++;
		} 
		while (h<=10);
		
		System.out.println("-------------");
		
		//4. for each
		//5. streams -> sequential/parallel
		
		//000 001 002 0003 04
		//10 11 12 13 14
		//20 21 22 23 24
		//30 31 32 33 34
		//40 41 42 43 444
		
		for(int m=0; m<=9; m++) {
			for(int n=0; n<=9; n++) {
				System.out.print(m+""+n+" ");//00 01 
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		
		for(int m=0; m<=4; m++) {
			for(int n=0; n<=4; n++) {
				for(int o=0; o<=4; o++) {
					System.out.print(m+""+n+""+o+" ");//00 01 
				}
				System.out.println();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}