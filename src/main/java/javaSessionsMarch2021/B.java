package javaSessionsMarch2021;

public class B {

	public static void main(String[] args) {

		System.out.println("B--main");
		
		A.main(args);
		
		//this will cause stackOverFlowerror 
	}

}