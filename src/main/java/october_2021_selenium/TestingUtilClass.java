package october_2021_selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingUtilClass {
	
	static WebDriver driver;
	static ElementUtil ele;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");
        
		By linkList = By.tagName("a");
		
		ele = new ElementUtil(driver);
		
		
		/**
		 * getting all elements with text 
		 */
//		List<String> text = ele.getElementsTextList(linkList);
//		System.out.println(text);
		
		
		
		/**
		 * getting all elements with text 
		 * using stream and calling internally method which is written with for each and list ArrayList
		 */
		ele.getLinksWith_Stream(linkList);
	}

}
