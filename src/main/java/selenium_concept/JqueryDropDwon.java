package selenium_concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDwon {

	static WebDriver driver;
	static ElementUtil util;
	static final String SELECT_ALL_THE_VALUES = "All";

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		util = new ElementUtil(driver);

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		// By choice_set = By.xpath("//ul/li/span[@class='comboTreeItemTitle']");
		By choice_set = By.xpath("//span[@class='comboTreeItemTitle']");
		By clickSelect = By.id("justAnInputBox");
		util.getElement(clickSelect).click();
		Thread.sleep(2000);

		// SelectWithoutSelectClass(choice_set, "choice 4"); // single selection
		// SelectWithoutSelectClass(choice_set, "choice 1", "choice 2 3", "choice 6 2");
		// //multi selection
		SelectWithoutSelectClass(choice_set, SELECT_ALL_THE_VALUES);

	}

	public static void SelectWithoutSelectClass(By Locator, String... value) {
		List<WebElement> listOfChoice = util.getElements(Locator);

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
	
	

	public static void SelectWithoutSelectClasswithForEachLoop(By Locator, String... value) {
		List<WebElement> listOfChoice = util.getElements(Locator);

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
