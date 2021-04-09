package javaSessionsMarch2021;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamsConcept {
	
	public static void main(String[] args) {
		
	
	
	ArrayList<String> empList = new ArrayList<String>();
	empList.add("Ali");
	empList.add("Adam");
	empList.add("Nastyush");
	empList.add("Emiliya");
	empList.add("Chloe");
	empList.add("Rosina");
	empList.add("Esta");
	
    empList.stream().forEach(employeeList -> System.out.println(employeeList));
    System.out.println(ConsoleColors.BLUE_BOLD + "-----------");
    
    empList.stream().filter(employeeList -> employeeList.equals("Adam"))
    .forEach(employeeList -> System.out.println(ConsoleColors.BLACK + employeeList));
    
    
    System.out.println(ConsoleColors.BLUE_BOLD + "-----------");
    
    empList.stream().filter(employeeList -> employeeList.equals("Adam")).filter(employeeList -> employeeList.startsWith("A"))
    .forEach(employeeList -> System.out.println(ConsoleColors.BLACK + employeeList));
    //this statment will give us the String which is starting with A
    
    System.out.println(ConsoleColors.BLUE_BOLD + "-----------");

    
    IntStream.range(0, 4).forEach(employeeList -> System.out.println(ConsoleColors.BLACK +employeeList));
    // IntStream is interface is used to get the range of the given values from the list
    
    System.out.println(ConsoleColors.BLUE_BOLD + "-----------");
    
    IntStream.iterate(0, a -> a+3).limit(13).forEach(a -> System.out.println(a));
    //this is actually a function which is output equal to the 13 times increased 3 
    
    System.out.println(ConsoleColors.BLUE_BOLD + "-----------");
    
    empList.parallelStream().forEach(employeeList -> System.out.println(employeeList));
    //parallelStream is another stream class which is more faster than regular stream 
    // use case for this lets say the count of the elements in selenium is thousand and over 
    // in that case we can use to achieve more performance more faster to get all the elements 
    // and parallelStream is not maintain the order 
    
   
    //before adding stream function to the jdk 1.8 it wasn't available in java 
    // we could see them before in kotlin or scala 
    // one of the use case of using intStream iterator interface in selenium 
    //lets say we have requirement to get all the links, img,  available in webPage
    
    // this actually Stream pipeline which is we can apply filters and get outcome as we wanted
    //default value of int is zero
    //default value of String is null
    //default value of double 0.0
    //default value of boolean is false
    //default value of char is just blank empty
	
	}
}
