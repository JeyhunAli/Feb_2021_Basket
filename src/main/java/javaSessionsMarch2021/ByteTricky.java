package javaSessionsMarch2021;

public class ByteTricky {

	public static void main(String[] args) {
		

		byte b = 122;
		byte a = 42;
	    byte c = (byte) (a+b);   //(122+42)=164   -128+127=256   164-256=-92
	    int c1 = a+b;
		System.out.println(c); 
	    System.out.println(c1);
		
		// here in this type of the code we get compile time error because java compiler doesnt allow this concept 
		//because what if later on the given value is increased then it wont work 
		//because byte range is   -128 to 127

	}

}
