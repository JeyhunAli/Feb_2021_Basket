package javaSessionsMarch2021;

public class EqualsMethodAndEqualOperator {

	/**
	 * 
	 * @param args
	 *             Difference between equals() and == in java == is operator whereas
	 *             equals is method in java. == is recommended to compare primitives
	 *             whereas equals method is recommended to compare the actual
	 *             content of objects. Equals method can be overridden but you can’t
	 *             override behavior of “==” operator == can be used with primitives
	 *             and objects but you can’t use equals method with primitives.
	 * 
	 */

	public static void main(String[] args) {

		String name1 = new String("John");
		String name2 = new String("John");

		/*
		 * Even though content of objects is same, it will return false, as name1 and
		 * name2 points to different objects
		 */

		System.out.println(name1 == name2);
		/*
		 * Equals method compares content, so this will return true
		 */

		System.out.println(name1.equals(name2));
		System.out.println("===================");

		name2 = name1;

		/*
		 * Now name1 and name2 both point to same reference so this will return true
		 */

		System.out.println(name1 == name2);

		/*
		 * Equals method compares content, so this will return true
		 */

		System.out.println(name1.equals(name2));
	}

}
