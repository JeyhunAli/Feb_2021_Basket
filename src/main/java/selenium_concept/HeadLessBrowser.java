package selenium_concept;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	WebElement element;
	
	public static void main(String[] args) {

		
		//headless: No UI
		//testing is happening behind the scene
		//faster than normal UI mode
		/**
		 * this is an optional 
		 * usually we dont use it 
		 * lets say we are expecting some pops or mouse movement 
		 * in that case it might not work 
		 * specially with complex dom its not recomenned 
		 * its recommended with small amount and simple test cases 
		 * there is another headless browser PhantomJS but developers of this browser stopped work on that
		 * another one GhostDriver
		 * 
		 * ------------------------------------------------------------------
		 * 
		 * webdriver interface is extending searchContext super interface 
		 * only two abstract methods find element and find elements coming from searchcontext 
		 * 
		 * WebElement is also interface its extending SearchContex and TakesScreenshot interface
		 * remote webdriver is class is implementing webdriver interface
		 * whenever we are executing our test cases locally i mean in my laptop i use webdriver driver = new Chrome or any other 
		 * driver 
		 * but whenever i need to run my test cases on cloud for example on docker or aws on that case i use 
		 * webdriver driver = new remote webdriver 
		 * remote webdriver has constructor and it says pass a remote url 
		 * and some capabilities so that i can execute test cases on the remote machine 
		 * 
		 * chromeDriver first is extending cromium driver which is another class then extending remotewebdriver is implementing webdriver interface
		 * but another browsers like safari opera firefox they are directly extending remote webdriver 
		 * 
		 */
		
        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--headless");
        WebDriver driver = new ChromeDriver(co);
        
        
		
		
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		
//		WebDriver driver = new FirefoxDriver(fo);
//        
        
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
	}

}