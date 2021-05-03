package selenium_concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectWithoutSelectClass {

	static WebDriver driver;
	static ElementUtil elementUtil;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		elementUtil = new ElementUtil(driver);

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		By submitForm = By.id("Form_submitForm_Industry");
		
		selectValueWithoutSelect_Class(submitForm, "Electronics");
	    elementUtil.selectValueWithoutSelect_Class(submitForm, "Healthcare");
}
	
	
	public static void selectValueWithoutSelect_Class(By Locator, String value) {
		List<WebElement> listOfDropDown = driver.findElements(Locator);
		for(WebElement e: listOfDropDown) {
			String text = e.getText();
		    //System.out.println(text);
			//by uncommenting print line you can get all the drop down values from list
		    if(text.equals(value))
		    e.click();
		    System.out.println("Clicked value is: " +value);
		    break;
		   
		}
	}

	
	
}