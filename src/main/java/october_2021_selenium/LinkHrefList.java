package october_2021_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkHrefList {
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.apple.com/");

//		By links = By.tagName("a");
//		
//		List<WebElement> linksList = driver.findElements(links);
//		
//		for(WebElement e : linksList) {
//			String hrefVal = e.getAttribute("href");
//			System.out.println(hrefVal);
//		}

		By links = By.tagName("a");
		By images = By.tagName("img");
		
		getAttributeList(links, "href");
		getAttributeList(images, "src");

	}

	public static void getAttributeList(By locator, String attribute) {
		List<WebElement> attributeList = driver.findElements(locator);

		for (int i = 0; i < attributeList.size(); i++) {
			String srcVal = attributeList.get(i).getAttribute(attribute);
			System.out.println(srcVal);
		}
	}

}
