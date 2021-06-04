package SeleniumCodingChallenge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author jey
 * in this class im trying to get world population 
 * which is increasing non stop
 * and data increasing dynamically
 *
 */
public class WorldPopulation {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
	    String Current_world_POP = "//div[@class='maincounter-number']/span[@class='rts-counter']";
//		String Current_today_pop = "//div[text() = 'Today']//parent::div//span[@class = 'rts-counter']";
//		String Current_year_pop = "//div[text()= 'This year']//parent::div//span[@class='rts-counter']";
		
		String today_and_this_year = "//div[text()= 'This year' or text() = 'Today']//parent::div//span[@class='rts-counter']";
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		
		
		
		 int count = 1;
			while(count<=20) {
				System.out.println(count + " second");
				if(count == 21) break;
		System.out.println("--------------- current population data ----------------");
		getWorld_POPUlation(Current_world_POP);
		
		
		System.out.println("--------------- today_and_this_year ----------------");
        getWorld_POPUlation(today_and_this_year);
		
        System.out.println("==================== today_and_this_year ==================== ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
           count++;
	}
	}
	
	public static void getWorld_POPUlation(String Locator) {
		
 	    //with for each loop
//		List<WebElement> worldPOP = driver.findElements(By.xpath(Locator));
//		for(WebElement e: worldPOP) {
//			System.out.println(e.getText());
//		
		
		//with stream 
		driver
		        .findElements(By.xpath(Locator))
		                   .stream()
		                          .forEach(e -> System.out.println(e.getText()));
				
			
			
		}
		
	}


