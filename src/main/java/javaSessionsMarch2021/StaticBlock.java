package javaSessionsMarch2021;

import java.util.ArrayList;

public class StaticBlock {
	
	//if we have static block in our program 
	//it doesnt matter in what position it comes 
	//before main method or after main method it will always execute first 
	// main method will execute last
	
	static {
		System.out.println("java is awesome");
	}
	
	
	static {
		System.out.println("static block 2");
	}
	

	static {
		System.out.println("static block 3");
		System.out.println("\n" );
	}
	

	public static void main(String[] args) {
		System.out.println("main method....always execute at last position if there static block");

	}
	
	static{
		//printing in reverse order
		ArrayList<String> cats = new ArrayList<String>();
		cats.add("Abyssinian Cat");
		cats.add("American Bobtail Cat Breed");
		cats.add("American Curl Cat Breed");
		cats.add("Birman Cat Breed");
		cats.add("Chartreux Cat Breed");
		cats.add("Japanese Bobtail Cat Breed");
		cats.add("Maine Coon Cat Breed");
		cats.add("Norwegian Forest Cat Breed");
		cats.add("Ragamuffin Cat Breed");
		
		for(int i=cats.size()-1; i>=0; i--) {
			
			System.out.println(cats.get(i));
			
		}
		System.out.println("\n" );
		cats.stream().forEach(ele -> System.out.println(ele));
		System.out.println("\n" );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}