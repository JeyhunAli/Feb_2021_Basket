package SeleniumCodingChallenge;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NooN_Carousel {
    static WebDriver driver;
    public static void main(String[] args) {
    	
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> page = driver
				.findElements(By.xpath("(//div[@class='swiper-wrapper'])[2]//div[@data-qa='product-name']/span"));   //collecting all the elements into list of WebElement

		List<String> prodctNames = new ArrayList<String>(); //starting arraylist in order to store elements and iterate them 

		for (WebElement pages : page) {  // iterating and getting text
			prodctNames.add(pages.getText());
		}
		String afterbutton = driver         //locator for next page 
				.findElement(By.xpath("//div[contains(@class, 'swiper-button-next custom-navigation')]"))
				.getAttribute("class");

		while (!afterbutton.contains("swiper-button-disabled")){  //if after button not disabled keep clicking
			driver.findElement(By.xpath("//div[contains(@class, 'swiper-button-next custom-navigation')]")).click();
			// then find products again 
            page = driver.findElements(By.xpath("(//div[@class='swiper-wrapper'])[2]//div[@data-qa='product-name']/span"));

			for (WebElement pages : page) {
				prodctNames.add(pages.getText());    //itarete them and get text 
			}
			afterbutton = driver
					.findElement(By.xpath("//div[contains(@class, 'swiper-button-next custom-navigation')]"))
					.getAttribute("class");     // again click after button get new page
		}
		for (String name : prodctNames) {
			System.out.println(name);                           //get all the product names  
		}
		
				int totalnames = prodctNames.size();
		System.out.println(totalnames);
 
		
		
	}

}