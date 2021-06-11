package selenium_concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonsuggestionsearch {

	static WebDriver driver;
	static ElementUtil util;
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		util = new ElementUtil(driver);

		driver.get("https://www.amazon.com/");
		
		By searchBox = By.id("twotabsearchtextbox");
		By suggestion = By.xpath("//div[@id='suggestions']/div");
		
		util.doActionsSendKeys(searchBox, "macbook pro");
		Thread.sleep(3000);
		

		List<WebElement>  list = util.getElements(suggestion);
		System.out.println(list.size());
		for(WebElement e : list) {
			System.out.println(e.getText());
		
		}
		
		
		

}

	
}