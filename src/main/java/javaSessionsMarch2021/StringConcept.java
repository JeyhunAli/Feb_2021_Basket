package javaSessionsMarch2021;

/**
 * why string is immutable 
 * 1. because of the security concept java most secure language 
 * 2. class loading mechanizm 
 * 3.optimiastion and performance 
 * if you debug your code them mouse hover on each and every string varibale refernce name 
 * you will notice that all three string have same id it means for three in java heap have one memory object 
 * its because of the security purpose so later nobody can change the value of string 
 * 
 * now mouse over after debuging to the eclipse ref val you will see the id is changed 
 * 
 * The String class in java is immutable
 * and content of String i mean the value of String objects cannot be changed 
 * 
 * in primitive data type for example int i = 77;  i = 66; System.out.println(i); here i will be overriten 
 * and new value will be 66 
 * 
 * but this cannot happen with string classes because string is immutable we cannot replace old value with new value 
 * basically replacement is not happening 
 * so what happening for example 
 * String str = "NewYork"; str = "Virginia"; System.out.println(str);
 * here first of all reference to the "newyork" will be removed and it will create new reference to the "virginia"
 * this happening because String is immutable we cannot edit or replace old value
 * but what happens with the value of the "NewYork" 
 * in java old value here "newYork" consider as garbage and it will be removed from memory by java garbage collector
 * 
 * another example here:
 * String s1 = "NewYork";
 * String s2 = "NewYork";
 * System.out.println(s1); 
 * System.out.println(s2);
 * in order to find out exact immutable concept put debugger on s1 and step over it up to end 
 * then mouse hover to the s1 then s2 what you will see its an amazing 
 * the refernce id and value id on both of them exactly same 
 * it means if there two same values and and two different reference String 
 * both of them will pint only to the one values 
 * in String pool its not gonna create with same value two different String reference object
 * 
 * 
 * and just because of this reason even when we creating object of the String Class we dont use new keyword 
 * because its immutable and reference variable value cannot be changed and modified 
 * and it came to the java after JDK1.5
 * 
 * 
 * 
 * wrapper classes available with  these data types 
 * Integer Long double float
 * we can convert string to int double boolean by using wrapper classes in java 
 * to convert string to any kind data type in java we have value of overloaded method 
 * by using that we can convert it
 * 
 *  Long.parseLong(l);
	Float.parseFloat(f);
	Integer.parseInt(i);
	Boolean.parseBoolean(true);
	String.valueOf(str);
	Double.parseDouble(v);
 * 
 */


public class StringConcept {

	public static void main(String[] args) {
		
	
		
		
		String a1 = "NewYork";
		String a2 = "NewYork";
                System.out.println(a1);
	         	System.out.println(a2);


		String s = "100";
		System.out.println(s+100);
		int s1 = Integer.parseInt(s);
		System.out.println(s1+100);
		
//		String s2 = "100A";
//		System.out.println(s2);
//		int s3 = Integer.parseInt(s2);
//		System.out.println(100+s3);    //java.lang.NumberFormatException:
		
		String b1 = "100A";
		System.out.println(b1);
		String ff = b1.replace("A", "");
		int b = Integer.parseInt(ff);
		System.out.println(b+100);
		
		String v = "12.33";
		System.out.println("the value of String is " + v);
		double d = Double.parseDouble(v);
		System.out.println("then value of double is " + d);

		
		String ss = "true";
		System.out.println("the value of string is: " + ss);
		boolean flag = Boolean.parseBoolean(ss);
		System.out.println("the value of boolean is: " + flag);
		
		int total = 99;
		System.out.println(total + 1);
		String l = String.valueOf(total - 9);
		System.out.println(l);
		
		
		
		String ee = "Azerbaycan";
		System.out.println(ee);
	String reverse = "";
		for(int i=ee.length()-1; i>=0; i--) {
			//System.out.println(ee.charAt(i));
			reverse = reverse+ee.charAt(i);
			
		}
		System.out.println(reverse);
		
	}

}
