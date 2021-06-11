package selenium_concept;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassWithOptionsMethod {

	static WebDriver driver;
	static ElementUtil elementUtil;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		elementUtil = new ElementUtil(driver);

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		By submitForm = By.id("Form_submitForm_Industry");

		// this method inside class
//	    List<String> list = getList(submitForm);
//		System.out.println(list);

		// this method comes from utility class
		List<String> listt = elementUtil.do_Select_method_GetOptions(submitForm);
		System.out.println(listt);
	}

	public static List<String> getList(By Locator) {

		Select select = new Select(driver.findElement(Locator));
		List<String> optionsList = new ArrayList<String>();
		List<WebElement> listOfOptions = select.getOptions();
		System.out.println("listOfOptions size is: " + listOfOptions.size());
		for (int i = 0; i < listOfOptions.size(); i++) {
			optionsList.add(listOfOptions.get(i).getText());

		}

		return optionsList;

	}

}
