package seleniumsessions2021April;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
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
	
	
	public void printElementsText(By locator) {
		getElementsTextList(locator).stream().forEach(e -> System.out.println(e));
	}
	
	
	public void getAttributeList(By locator, String attr) {
		List<WebElement> attrList = getElements(locator);
		for (int i = 0; i < attrList.size(); i++) {
			String srcVal = attrList.get(i).getAttribute(attr);
			System.out.println(srcVal);
		}
	}
	
	
	//getAttributeListWith_No_Null(links, "href");
	//getAttributeListWith_No_Null(images, "src");
	/**
	 * (href stands for Hypertext REFerence) 
	 * The HTML code used to create a link to another page.
	 * The HREF is an attribute of the anchor tag
	 */
	public List<String> getAttributeListWith_No_Null(By locator, String attr) {
		List<WebElement> attrList = getElements(locator);
		List<String> attrTextList = new ArrayList<String>();
		for (int i = 0; i < attrList.size(); i++) {
			String srcVal = attrList.get(i).getAttribute(attr);
			if(srcVal != null) {
				attrTextList.add(srcVal);
			
			//System.out.println(srcVal);
			}
			
		}
		return attrTextList;
	}

}
