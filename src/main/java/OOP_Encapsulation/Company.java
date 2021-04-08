package OOP_Encapsulation;

/**
 * 
 * @author jey 
 * 
 *         Encapsulation is data hiding we can achieve to Encapsulation by
 *         private keyword it can be class var it can be class methods to access
 *         private class methods and class var we use getters and setters if we
 *         have private class var in our class its betterkeep them as template
 *         to have them separetly without main method and its always good
 *         practice to access them from another class in order to achieve
 *         Encapsulation
 * 
 *         its not essential to achieve Encapsulation only after priavtely
 *         declared all the class var by generating getters and setters we have
 *         an option to create a constructor of the page with the exact values
 *         we want and we have to have get methods as well then in another class
 *         we can create object of that specific class and pass the constructor
 *         values and after that we can access privately declared class var
 * 
 *         another practical example of using Encapsulation in our framework for
 *         example we declare all our page locators private and we are creating
 *         our page action methods public then we calling all the priavtely
 *         declared locators inside our public action methods then start
 *         achieving our page actions through privately declared locators either
 *         we using testNG framework or CUCUCMBER it doesnt matter both of them
 *         executer TestNG or Junit will never access to the private methods or
 *         private Global var it will access to the publicly declared methods
 *         and execution will happen
 * 
 *         whenever we want to have freedom of what methods we need and based on
 *         that we do all our opeartion for example i have login page and i have
 *         login with first method --- >> us, pwd, email, otp second method only
 *         us, pwd third method us, pwd, email in that case we use encapsulation
 *         with getters and setters but lets say we have have to login us and
 *         pwd so we can create constructor with two paramaters and every time
 *         when we crate object of that class those paramaters will come up and
 *         we can achieve encapsulation with constructor
 * 
 * 
 *
 */

public class Company {

	private String name;
	private int sharePrice;
	private String HQ;

	public Company(String name, int sharePrice, String hQ) {
		this.name = name;
		this.sharePrice = sharePrice;
		this.HQ = hQ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public String getHQ() {
		return HQ;
	}

	public void setHQ(String hQ) {
		HQ = hQ;
	}

}
