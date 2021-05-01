package javaSessionsMarch2021;

public class PrintNum {

	public static void main(String[] args) {

		// 1 to 100:
		// recursive function: a funciton is calling itself

		/**
		 * Static method can be overloaded but not override
		 * 
		 * to call Static medhod no need to create object just direct call 
		 * method
		 * overloading concept is also known as compile time
		 * polymerphism 
		 * Stack Overflow is not exception its an error
		 *  example 2 medhed Statie type
		 * fromom different class call each other back to  back and its causing this error
		 * 
		 * Recursive Function means method calling itself here i will write using for loob a
		 * progom increearth Jetion by Reeusive the number without
		 * 
		 * public static void punt Numberes (int rum) {
		 * 
		 * if (num <= 100) { a if I dont pende y (num <= 100) it will punt infinite
		 * numbers and it will also throw Stocu over flow error port Numbers (rum);
		 * 
		 * Sy So (mm)
		 * 
		 * wap to find factorial number by using Recursive Function.
		 * 
		 * From one method we can call another method but inside main method have to do
		 * ereade beef then
		 * 
		 * ean call the method even clos vart which non Static method uidl ecl any this
		 * is method Chaining concept non Static ace, can call inside skeet creation
		 * 
		 * we can, overload Constructor, no return type no void in
		 * 
		 * coms tractor
		 * 
		 * the advantges of having more than one constructor in our class more choices
		 * to out client to (for example one const th usedam ard pass arether with,
		 * extrea emal and. Gnee u howe all e first elenu create objet a get the best
		 * things
		 * 
		 * 
		 * eth trl 4 there are Space no constructor with zero parameter creation object
		 * add porami toes In cie class le say d will que error a have too many and fs
		 * deleine of asteng class vare out of you can create multiple const using
		 * afforen t cembinadion of classic art
		 * 
		 * 
		 * 
		 * 
		 */

		printNumber(1);

		// fact(5) = 5x4x3x2x1 = 120
		// fact(1) = 1
		// fact(0)= 1

	}

	public static void printNumber(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			printNumber(num);
		}

	}

}