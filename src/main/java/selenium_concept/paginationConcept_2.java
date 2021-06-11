package selenium_concept;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class paginationConcept_2 {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//first finding locator of numbers of the pages  
		List<WebElement> numberOfPages = driver.findElements(By.xpath("//div[@id='example_paginate']/child::span/a")); 
		//starting arraylist so that later on to store into arraylist
		List<String> listOfNames = new ArrayList<String>();
		//looping the number of pages
		for(int i=1; i<=numberOfPages.size(); i++) {
			//finding locator of numbers of the pages but making it dynamic so every time when looping happening it changes to page number 2, then 3 and so on
			String pagination = "(//div[@id='example_paginate']/child::span/a)[position()="+i+"]";
			//clicking to get new page
			driver.findElement(By.xpath(pagination)).click();
			Thread.sleep(2000);
			//getting all the name 
			List<WebElement> containsNames = driver.findElements(By.xpath("//table[@id='example']//td[contains(@class, 'sorting')]"));
			for(int k=0; k<containsNames.size(); k++) {
				//storing in arraylist
				 listOfNames.add(containsNames.get(k).getText());
			}
		}
		
		//itearint names
		for (String names : listOfNames) {
			System.out.println(names);
			
		}
		int totalNamesize = listOfNames.size();
		System.out.println("total size of the names is: " + totalNamesize);
		String actualNumber = driver.findElement(By.id("example_info")).getText().split(" ")[5];
		System.out.println("actual number of names displayed on the page: " +actualNumber);
		
		Assert.assertEquals(actualNumber, String.valueOf(totalNamesize));
		Thread.sleep(5000);
		driver.quit();
		
	}

}
