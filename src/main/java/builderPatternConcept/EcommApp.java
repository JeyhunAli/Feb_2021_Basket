package builderPatternConcept;

public class EcommApp {

	public EcommApp login() {
		System.out.println("login to app");
		return this;  // return this. ->  means return current class object thats why instead of void there class name 
		              // check out advantages of this pattern next class 
		              // its basically another way of using this keyword to build pattern
	} 
	

	public EcommApp login(String un, String pwd) {
		System.out.println("login to app with : " + un + ":" + pwd);
		return this;
	}

	public EcommApp search(String productName) {
		System.out.println("search with : " + productName);
		return this;
	}

	public EcommApp search(String productName, int price) {
		System.out.println("search with : " + productName + ":" + price);
		return this;
	}

	public EcommApp addToCart(String productName) {
		System.out.println("add to cart: " + productName);
		return this;
	}

	public EcommApp checkout(String productName) {
		System.out.println("check out: " + productName);
		return this;
	}

	public EcommApp doPayment(String cc, String pwd) {
		System.out.println("make the payment with: " + cc + " :" + pwd);
		return this;
	}

	public EcommApp doPayment(String Gpay) {
		System.out.println("make the payment with: " + Gpay);
		return this;
	}

	public EcommApp logout() {
		System.out.println("logout");
		return this;
	}

}