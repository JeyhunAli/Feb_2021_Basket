package seleniumsessions2021April;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	static WebDriver driver;
	public static void main(String[] args) {

		// total number of links on the page
		// you have to print the text of each link on the console
		// ignore the blank link text

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");

//		for(int i=0; i<linksList.size(); i++) {
//			System.out.println(linksList.get(i).getText());
//		}
		
		By links = By.tagName("a");
		
//		List<String> actualList = getElementsTextList(links);
//		for(String s : actualList) {
//			System.out.println(s);
//		}
		
		printElementsText(links);
	}

	/**
	 * This function will take By locator and will return the list of elements
	 * @param locator
	 * @return 
	 */
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();   //starting arraylist with list interface doing top casting
		for(WebElement e : eleList) {                        //for each loop
			String text = e.getText();                       //getting text from webPage
			if(!text.isEmpty()) {                            //if text is not empty then get it
				eleTextList.add(text);                       //calling arraylist and adding all text one by one 
			}
		}
		return eleTextList;                                  //returning all the text
	}
	
	public static void printElementsText(By locator) { 
		getElementsTextList(locator).stream().forEach(e -> System.out.println(e));     //calling getElementsTextList method 
		                                                       //inside printelementstext method and applying stream 
		                                                //stream not faster as for loop and for each loop 
	}

}
