package javaSessionsMarch2021;

public class OddNumbers {

	public static void main(String[] args) {

		oddNumbers();
		evenNumbers();

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				// System.out.println("Even Numbers are:"+a[i]);

			} else {
				System.out.println("Odd Numbers are:" + a[i]);
			}
		}

		int b[] = { 15, 16, 17, 18, 56, 96, 77, 85 };
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {
				// System.out.println("even numb are: "+ b[i]);

			} else {
				System.out.println("Odd Numb are " + b[i]);

			}

		}

	}

	public static void oddNumbers() {

		for (int odd = 10; odd >= 0; odd--) {
			if (odd % 2 == 1) {
				System.out.println("odd -->> " + odd);
			}

		}

	}

	public static void evenNumbers() {

		for (int even = 0; even <= 10;) {
			if (even % 2 == 0) {
				System.out.println("even numbers -> " + even);
			}
			even++;
			
		}
	}
}






