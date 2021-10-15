package october_2021_selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * This method is used to create the webElement on the basis of By locator.
	 * 
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			JavaScriptUtil.flash(element, driver);
		} catch (Exception e) {
			System.out.println("some exception occurred while creating the webelement....");
			System.out.println(e.getMessage());
		}
		return element;
	}
	
	
	
	
	/**
	 * this method is returning list of elements 
	 * @param locator
	 * @return 
	 * @return
	 */
	public List<WebElement> getElements(By locator) {
		 List<WebElement> elements = null;
		try {
			 elements = driver.findElements(locator);
		}
		catch (Exception e) {
			System.out.println("some exception occured...");
		}
		return elements;
		
	}
	
	
	
	
	/**
	 * This method is used to click on element
	 * 
	 * @param locator
	 */
	public void doClick(By locator) {
		try {
			getElement(locator).click();
		} catch (Exception e) {
			System.out.println("some exception occurred while clicking on the webelement....");
			System.out.println(e.getMessage());

		}
	}

	/**
	 * This method is used to pass the values in a webelement
	 * 
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {
		try {
			getElement(locator).sendKeys(value);
		} catch (Exception e) {
			System.out.println("some exception occurred while passing value to the webelement....");
			System.out.println(e.getMessage());

		}
	}
	
	
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	
	
	
	/**
	 * wait concept
	 * @param locator
	 * @param timeOut
	 */
	public void waitForElementPresent(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public String waitForTitlePresent(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}

	/**
	 * this method will give you all the links with text
	 * @param locator
	 * @return
	 */
	public List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for(WebElement e : eleList) {
			String text = e.getText();
			if(!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	/**
	 * getting all elements with text 
	 * using stream and calling internally method which is written with for each and list ArrayList
	 */
	public void getLinksWith_Stream(By locator) {
		getElementsTextList(locator).stream().forEach(e -> System.out.println(e));
		
	}
	
	/**
	 * this method is used to get attribute of the elements;
	 * @param locator
	 * @param attr
	 * @return 
	 */
	public  String getAttributeList(By locator, String attr) {
		List<WebElement> attrList = getElements(locator);
            for (int i = 0; i < attrList.size(); i++) {
			String srcVal = attrList.get(i).getAttribute(attr);
			System.out.println(srcVal);
		   }
			return attr;
           
	}
	
	
	
	
	

}