
package builderPatternConcept;

public class AmzonShopTest {

	public static void main(String[] args) {

		EcommApp ecomm = new EcommApp();
		
		
		ecomm.login("naveen@gmail.com", "test123")
					.search("MAcbook Pro")
						.addToCart("MAcbook Pro")
							.checkout("MAcbook Pro")
								.doPayment("12121 1212 2121 2121", "test234")
									.logout();
			
		
		ecomm.login().doPayment("test@gpay").logout();
		
		ecomm.login().addToCart("iMac").logout();
		
		//just beacuse of having so many options to do payment do add to cart 
		//so in every step have choise to to use the according one 
		
		ecomm.login().logout();
		
		ecomm.logout();
		
	}
	
	/**
	 * here just beacause of the all the methods returning class object thats why after creating object of the class 
	 * we have access to all the methods one by one just 
	 * put the dot and access another method
	 * once we run this method we get complete workflow 
	 * this just another way to create the class with all this features 
	 * 
	 * this is another way of using this keyword to create different workflow and follow them accordingly
	 */

}
