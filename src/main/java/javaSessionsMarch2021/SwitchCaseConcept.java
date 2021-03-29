package javaSessionsMarch2021;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "chrome";

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