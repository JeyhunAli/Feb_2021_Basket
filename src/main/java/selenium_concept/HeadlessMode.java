package selenium_concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessMode {

	public static void main(String[] args) {
		
		
		/**
		 * no browser 
		 * its fast
		 * testing happening behind sciene
		 * 
		 * complex gtml dom it might not work 
		 * mouse hover , move to elment
		 * alert pop up it might not work 
		 * in local machine it will work fine but 
		 * to run test cases on cloud machine sych as docker jenkins it will block 
		 * 
		 */
		
		

//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
//		WebDriver driver = new ChromeDriver(co);
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(fo);
		
		
		driver.get("https://google.com");
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("Wrong title");
		}
		

}

	
}