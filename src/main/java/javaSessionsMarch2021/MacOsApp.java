package javaSessionsMarch2021;

public class MacOsApp {

	// Method Overloading: Poly(many) + Morphism (forms) --> compile time polimorphism (static)
	// within the same class when we have diff methods:
	// with the same
	// with diff paramaters
	// with diff sequence of parameters
	/**
	 * advantages of having method oveloading concept in development is 
	 * when we think over programming concept is easy to understand easy to apply 
	 * easy to relate 
	 */
	
	public void login() {// 0 param

	}

	public void login(int i) {// 1 param
		System.out.println(i);
	}

	public void login(int i, int p) {// 2 params

	}

	public void login(int i, String p) {// 2 params
		System.out.println(i + p);
	}

	public void login(String i, int p) {// 2 params

	}

	//different ways to apply method oveloading in real time concept
	// login:
	public void doLogin(String un, String pwd) {

	}

	public void doLogin(String un, String pwd, String role) {

	}

	public void doLogin(String un, long ph) {

	}

	public void doLogin(String un, String pwd, long ph, int otp) {

	}

	public void doLogin() {

	}

	//different ways to apply method oveloading in real time concept
	// search
	public void search() {

	}

	public void search(String name) {

	}

	public void search(String name, int price) {

	}

	public void search(String name, int price, String seller) {

	}

	public void search(String color, String name, int price) {

	}

	//different ways to apply method oveloading in real time concept
	// car booking:
	public void carBooking(String type) {

	}

	public void carBooking(String type, String from, String to) {

	}

	public void carBooking(String type, String from, String to, String pool) {

	}

	//different ways to apply method oveloading in real time concept
	// payment:
	public void payment(String cc, String pwd) {

	}

	public void payment(String cc, String pwd, int otp) {

	}

	public void payment(String upi) {

	}

	public static void main(String[] args) {

		MacOsApp m = new MacOsApp();
		m.login(10, "Jeyhun");
		

	}

}
