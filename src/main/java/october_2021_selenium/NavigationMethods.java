package october_2021_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		driver.get("https://www.amazon.in/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		/**
		 * there no difference between driver.get and driver.navigate.to methods 
		 * both are Synonym 
		 * navigate.to method use .get method internally 
		 * only differences naviagate method can refresh page can redirect page to 
		 * backward an forward point 
		 *
		 */
		
		
		
	}

}