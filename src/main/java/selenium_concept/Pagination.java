package selenium_concept;

import java.util.List;

/**
 * one of the most important concept in selenium using java 
 * Pagination where there multiple slides and it can be dynamic also 
 * to handle this we use while loop 
 * here while loop is more practical example in selenium
 * 
 * because we know that most of the time the size of iteration we know if we use for loop 
 * but with while loop exact iteration we dont know and if tomorrow more contact would created it will count all of them 
 * thats why here using while loop great example of practical use case 
 * 
 * in this concept another great practical example of having stale element exception and the way of handling of it 
 * so as we are clicking next number as next page to find matching name the locator we provided can be stale in some point 
 * and can throw stale element exception 
 * and to handle it we dont use here exception handling concept trycatch block we just rewrting same locator here and with the counter it will 
 * increase the amount of clicking size so in this case everytime if element not fount it will click another page to find the element with 
 * fresh locator
 * 
 * 
 * another great practical example of having out of bound exception since we providing size here 
 * so lets say our program keep clicking new page to find the contact name that we passed 
 * but it couldnt find and pages also ended 
 * in that case it can throw array out of bound exception anf to handle it this time we use exception handling concept try catch block
 * with proper message that pagination is over no contact founded 
 * 
 * 
 * another great practical example of having isDisplayed method and right after isDiplayed method click method 
 * if you have large amount of contacts and they all not in one page and u have to click to pagination to get another list of contact
 * in that case driver.findElement by locator and as soon as you find display it and click it method will break 
 * why because method first of all couldnt find any contact and it will throw NoSuchElementException 
 * thats why better use ListOfWebElement
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {
	static WebDriver driver;

	public static String selectContact(String name) {
		String checkBoxXpath = "//a[text()='" + name
				+ "']/parent::td/preceding-sibling::td/child::input[@type='checkbox' and @name='contact_id']";
		driver.findElement(By.xpath(checkBoxXpath)).click();
		return name;
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		Thread.sleep(3000);

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(3000);

		List<WebElement> pages = driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));

		int i = 0;
		while (true) {
			if (driver.findElements(By.linkText("Varuns Peter")).size() == 1) {
				String name = selectContact("Varuns Peter");
				System.out.println("contact Found with name: " +name );
				break;
			}
			// pagination logic:
			else {
				try {
					pages.get(i).click();
				} catch (Exception e) {
					System.out.println("pagination is over.....and no contact found");
					break;
				}
				pages = driver.findElements(By.xpath("(//div[@class='pagination'])[1]/a"));
			}
			i++;
		}

	}

}