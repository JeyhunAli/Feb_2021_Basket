package javaSessionsMarch2021;

public class OctalNumb {

	public static void main(String[] args) {

		byte b = 065;
		System.out.println(b);

		// 065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53

		/**
		 * 
		 * 137 in base 10 is equal to each digit multiplied with its corresponding 10n:
		 * 13710 = 1×102+3×101+7×100 = 100+30+7
		 * 
		 * 
		 * 7014 in base 8 is equal to each digit multiplied with its corresponding power
		 * of 8: 70148 = 7×83+0×82+1×81+4×80= 3584+0+8+4 = 3596
		 * 
		 * 
		 * Here i will show you step-by-step how convert the decimal number 538 to
		 * octal.
		 * 
		 * First note that decimal numbers use 10 digits (0, 1, 2, 3, 4, 5, 6, 7, 8, and
		 * 9) and octal numbers use only 8 digits (0, 1, 2, 3, 4, 5, 6, and 7).
		 * 
		 * As we explain the steps to converting 538 to octal, it is important to know
		 * the name of the parts of a division problem. In a problem like A divided by B
		 * equals C, A is the dividend, B is the divisor and C is the Quotient.
		 * 
		 * The Quotient has two parts. The Whole part and the Fractional part. The
		 * Fractional part is also known as the Remainder.
		 * 
		 * Step 1) Divide 538 by 8 to get the Quotient. Keep the Whole part for the next
		 * step and set the Remainder aside.
		 * 
		 * Step 2) Divide the Whole part of the Quotient from step 1 by 8. Again keep
		 * the Whole part and set the Remainder aside.
		 * 
		 * Step 3) Repeat Step 2 above until the Whole part is 0.
		 * 
		 * Step 4) Write down the Remainders in reverse order to get the answer to 538
		 * as an octal.
		 * 
		 * Here we will show our work so you can follow along:
		 * 
		 * 538 / 8 = 67 with 2 remainder 67 / 8 = 8 with 3 remainder 8 / 8 = 1 with 0
		 * remainder 1 / 8 = 0 with 1 remainder
		 * 
		 * Then, when we put the remainders together in reverse order, we get the
		 * answer. The decimal number 538 converted to octal is therefore:
		 * 
		 * 1032
		 * 
		 * 
		 */
	}

}
