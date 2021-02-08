package java_concept;

public class LoopsConcept {

	public static void main(String[] args) {
		
		
		/**
		 * loops in java to print given statement again and again
		 * but we have to break it in someWhere
		 * means doing something repetadly
		 * 
		 * % operator is used to get reminder how by dividing numbers
		 * for example  4%2=0, 5%2=1 9%2=1
		 * 
		 * note: in for loop and while loop if we are not increasing or decreasing the given value it will print infinite
		 * 
		 * note: Differences between For Loop And While loop
		 * 
		 * 1 initialization is part of the for loop
		 * for loop we use where we have order base collection what i mean by that for example 
		 * from zero to 10  its order base we put condition there counter and increasing or decreasing the given number by order base 
		 * then we can fecth all the values or we can click on specific element for that we use for loop 
		 * list interface, array list can be example for that 
		 * 
		 * 
		 * 2 initialization is not part of the while loop 
		 * while loop is not suitable,conveniant for this type of the collection 
		 * where exactly as Automation engineer we use while loop in our framework 
		 * while loop it s very conveniant with wait statement in selenium 
		 * let see    first im initializing element 
		 * element e = button 
		 * then i put cndition here while loop (check if elment is there or not)
		 * let say it found the element the click on it then increase the counter by ++
		 * whenever there non order base collection we use while loop another example for that 
		 * like set object driver.getwindow handle
		 * in set object the indexing is not order base its like first in first out 
		 * 
		 * 
		 * 3 do while loop is 
		 * in this first condition it will always execute then it will go to part of the while then it will check the condition if condition 
		 * is satisfied it will execute if not it will it will go to the another line 
		 * 
		 * 
		 */

		
		//1 to 10:
		//loops:
		//1. while:
		
		int i = 1; //Initialization separetly
		while(i<=10){ //Conditional
			System.out.println(i);//1 2 3 4 5 .... 10
			i++; //incremental/decremental
		}
		
		System.out.println("----------");
		
		//2. for loop:
		//1 to 10:
		for(int k=1; k<=10; k++){
			System.out.println(k);//1 2 3 4 5....10
		}
		
//		for( ; ; ){
//			System.out.println("Welcome to New York");
//		}
		/**
		 * this also infinite loop why because inside semi colon we dont define any condition any initialization 
		 * thats why java consider it as a default loop and it will print infinite 
		 */
		
		
		
		System.out.println("----------");

		//even numbers:  0 2 4 6 8 10 
		for(int even=0; even<=10; even=even+2){
			System.out.println(even);//0 2 4 6 8 10 
		}
		
		System.out.println("----------");

		//odd numbers: 1 3 5 7 9
		for(int odd=1; odd<10; odd=odd+2){
			System.out.println(odd);//1 3 5 7 9 
		}
		
		//
		for(int p=1; p<=10;){
			System.out.println(p);
			//p++;
			p=p+1;
		}
		System.out.println("----------");

		
		//
		for(int h=1; h<=100; h++){
			System.out.println(h);
			if(h % 5 == 0){
				System.out.println("hiiii");
			}
		}
		
		System.out.println("----------");
		
		//a to z:
		for(char c ='a' ; c<='z'; c++){
			System.out.println(c);
		}
		
		
		System.out.println("----------");

		for(byte b=1; b<=5; b++){
			System.out.println(b);
		}
		
		System.out.println("----------");

		for(double d=1.1; d<10; d++){
			System.out.println(d);
		}
		
		System.out.println("----------");
		
		for(String st = "hello"; st.equals("hello");){
			System.out.println(st);
			
		}
		
		System.out.println("----------");


		//3. do-while:
		/**
		 * 
		 * when to use while loop when do while loop 
		 * so if we need to print before starting our loop we can use do while loop 
		 *   
		 * in do while loop statement comes first with incremental decremantal part then condition
		 */
		int n = 1;
		do{
			System.out.println(n);//12345678910
			n++;
		}
		while(n<=10);
		
		
	}

}