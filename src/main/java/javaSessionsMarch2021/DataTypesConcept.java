package javaSessionsMarch2021;

public class DataTypesConcept {

	public static void main(String[] args) {

		// data types: type of data
		// strict type:

		// 1. primitive data types: dont need object to store the data
		// 2. non primitive data types: Array, Object, String, Class, Interface 
		//non primitive means where we store the data on form of object 

		/**
		 * java is not 100% object oriented language 
		 * because even without any object we can create data in java 
		 */
		
		
		// primitive data types:
		// 1. boolean type: boolean: true/false
		// 2. Numeric Type:
		// a. Character Value: char
		// b. Integral Type:
		// Integer: byte, short, int, long
		// Floating-type: float, double

		// 1. byte:
		// size: 1 byte = 8 bits
		// range: -128 to 127
		byte b = 10; // 1 byte
		b = 40;
		byte b1 = 20;
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b + b1);

		// 2. short:
		// size: 2 bytes = 2x8 = 16 bits
		// range: -32768 to 32767
		short s = 1000;
		short s1 = 10;// 2 bytes

		// 3. int:
		// size: 4 bytes = 4x8 = 32 bits
		// range: -2147483648 to 2147483647
		int i = 10000;
		int j = 200303;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		// 4. long:
		// size: 8 bytes = 8x8 = 64 bits
		// range: -9223372036854775808 to 9223372036854775807
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);

		long l = 100020202;
		long l1 = 10;// 8 bytes = 64 bits

		// 5. float:
		// size: 4 bytes = 32 bits
		// range: after . it will take upto 7 digits
		float a = 12.33f;
		float v = (float) 12.33;
		System.out.println(a);
		System.out.println(v);

		// 6. double:
		// size: 8 bytes = 64 bits
		// range: after . it will take upto 16 digits
		double d1 = 12.3333;
		double d2 = 14.3333;
		double d3 = 1000;
		System.out.println(d3);

		// 7. char: can have only one single digit
		// size: 2 bytes = 16 bits
		char c1 = 'a';
		char c2 = '1';
		char c3 = '$';

		// 8. boolean:
		// size: ~1 byte
		boolean b3 = true;
		boolean b4 = false;

		System.out.println(1000);
		System.out.println(c1);
		System.out.println(5 / 2);// 2.5 --> 2
		System.out.println(5 / 2.0);
		System.out.println(5.0 / 2);
		System.out.println(5.0 / 2.0);

		System.out.println(0 / 9);  //0
		System.out.println(0 / 2000);  //0

		// System.out.println(9/0);  //ArithmeticException
		System.out.println(9 / 0.0); // Infinity 

		// String:
		String str = "Hello World";   //these two string values are same even starting capital letter they are pinting one heap memory
		String s11 = "Hello World";    // just beacuse values are same its not creating another string constant to point 
		System.out.println(str);
		System.out.println("1000");
		System.out.println("hi this is my java code");

		String s12 = "hello world";   // but this starting small letter its pointing different string constant
		String s13 = "1000";


	}

}