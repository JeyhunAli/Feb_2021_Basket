package selenium_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_Handle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// Browser

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");// Page

		//driver.switchTo().frame(2);    // frame overloaded method and getting frame with index its not recommended 
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));

		String header = driver.findElement(By.xpath("/html/body/h2")).getText();

		System.out.println(header);
		
		driver.switchTo().defaultContent();
		
		//driver.switchTo().parentFrame();

	}

}