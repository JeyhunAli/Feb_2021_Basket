package javaSessionsMarch2021;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		/**
		 * but here is different from reqular if > if 
		 * if > else if > else 
		 * here condition is jumping rught away the case where statment is satified 
		 * for example here browser safari 
		 * and statement is coming at the end and it will right away jumping to safari not checking each and every 
		 * condition 
		 * to proof that 
		 * here delete all the break keyword then execute u will see that 
		 * its just for proofing concept
		 * but with switch case its compulsary to have break keyword  
		 */
		
		
		String browser = "safari";

		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
			
		case "firefox":
			System.out.println("launch ff");
			break;
			
		case "IE":
			System.out.println("launch IE");
			break;
			
		case "safari":
			System.out.println("launch safari");
			break;
		

		default:
			System.out.println("please pass the right browser ..." + browser);
			break;
		}

	}

}