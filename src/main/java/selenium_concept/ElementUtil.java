package selenium_concept;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
		for (WebElement e : eleList) {
			String text = e.getText();
			if (!text.isEmpty()) {
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

	// getAttributeListWith_No_Null(links, "href");
	// getAttributeListWith_No_Null(images, "src");
	/**
	 * (href stands for Hypertext REFerence) The HTML code used to create a link to
	 * another page. The HREF is an attribute of the anchor tag
	 */
	public List<String> getAttributeListWith_No_Null(By locator, String attr) {
		List<WebElement> attrList = getElements(locator);
		List<String> attrTextList = new ArrayList<String>();
		for (int i = 0; i < attrList.size(); i++) {
			String srcVal = attrList.get(i).getAttribute(attr);
			if (srcVal != null) {
				attrTextList.add(srcVal);

				// System.out.println(srcVal);
			}

		}
		return attrTextList;
	}
	
	// ********************************************* Action Class *********************************************//

	
	public void doActionsSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).build().perform();
	}

	public void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).build().perform();
	}

	public void doSendKeysWithMoveToElement(By locator, String value) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).sendKeys(value).build().perform();
	}

	public void doClickWithMoveToElement(By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).click().build().perform();
	}
	
	public void drag_and_drop_1(By source, By target ) {
		Actions action = new Actions(driver);
		action.clickAndHold(getElement(source));
		action.moveToElement(getElement(target)).release().build().perform();
		
	}
	public void drag_and_drop_2(By source, By target ) {
		Actions action = new Actions(driver);
		action.dragAndDrop(getElement(source), getElement(target)).build().perform();
	}
	
	
	
	
	// ********************************************* Select Class *********************************************//

	public void do_Select_By_Visible_Text(By locator, String text) {
		// WebElement element = getElement(locator); here i just passed get method name
		// with the locator to select parameter
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);

	}

	public void do_Select_By_Index(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void do_Select_By_value(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public List<String> do_Select_method_GetOptions(By Locator) {
		Select select = new Select(getElement(Locator));
		List<String> optionsList = new ArrayList<String>();
		List<WebElement> listOfOptions = select.getOptions();
		System.out.println("listOfOptions size is: " + listOfOptions.size());
		for (int i = 0; i < listOfOptions.size(); i++) {
			optionsList.add(listOfOptions.get(i).getText());
		}
		return optionsList;
	}

	// ********************************************* Select value without select class *********************************************//

	public void selectValueWithoutSelect_Class(By Locator, String value) {
		List<WebElement> listOfDropDown = getElements(Locator);
		for (WebElement e : listOfDropDown) {
			String text = e.getText();
			// System.out.println(text);
			// by uncommenting print line you can get all the drop down values from list
			if (text.equals(value))
				e.click();
			System.out.println("Clicked value is: " + value);
			break;

		}
	}
	
	/**
	 * 
	 * @param Locator
	 * @param value
	 * this method is used to select single, multiple, and all 
	 * the values from drop down menu 
	 * on the basis of given requirement 
	 * with for each loop 
	 */
	
	public  void SelectWithoutSelectClasswithForEachLoop(By Locator, String... value) {
		List<WebElement> listOfChoice = getElements(Locator);

		if (!value[0].equalsIgnoreCase("all")) {
			for (int j = 0; j < listOfChoice.size(); j++) {
				String text = listOfChoice.get(j).getText();

				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						listOfChoice.get(j).click();
						break;
					}
				}
			}
		} else {
			try {
				for (WebElement e : listOfChoice) {
					e.click();
				}
			} catch (Exception e) {

			}
		}
	}
	
	
	
	
	/**
	 * 
	 * @param Locator
	 * @param value
	 * this method is used to select single, multiple, and all 
	 * the values from drop down menu 
	 * on the basis of given requirement 
	 * typical for loop 
	 */
	public void SelectWithoutSelectClass(By Locator, String... value) {
		List<WebElement> listOfChoice = getElements(Locator);

		if (!value[0].equalsIgnoreCase("all")) {
			for (int j = 0; j < listOfChoice.size(); j++) {
				String text = listOfChoice.get(j).getText();

				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						listOfChoice.get(j).click();
						break;
					}
				}
			}
		} else {
			try {
				for (WebElement e : listOfChoice) {
					e.click();
				}
			} catch (Exception e) {

			}
		}
	}
	
	
	
	
	
	

}
