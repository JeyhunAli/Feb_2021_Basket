package selenium_concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author jey
 * select class in java we can use only if the html tag is select then we can use it 
 *
 */

public class selectC_DropDown {
	
	static  WebDriver driver;
	static ElementUtil elementUtil;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    elementUtil = new ElementUtil(driver);
		
	    driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
	    By education = By.id("Form_submitForm_Industry");
	    WebElement edu = driver.findElement(education);
	   
	    //select class not working with by class thats why here i convert it to the web element
	    
	    Select select = new Select(edu);
	    select.selectByVisibleText("Education");  //this in the form of the text
	    select.selectByIndex(4);      //this is index but recomennded because later on index can be shifted
	    select.selectByValue("health");   // value not the text we have to choose value=health" from DOM 
	    
//	    select.deselectAll();
//	    select.isMultiple();     usuful methods in Select class just keep in the mind 
//	    select.toString()
//	    select.getOptions();
	    
	   
	    By selectCountry = By.id("Form_submitForm_Country");
	    
	    
	    elementUtil.do_Select_By_Visible_Text(selectCountry, "Azerbaijan");
	    Thread.sleep(1000);
	    elementUtil.do_Select_By_Index(selectCountry, 25);
	    Thread.sleep(1000);
	    elementUtil.do_Select_By_value(selectCountry, "Germany");
	    

	}

}
