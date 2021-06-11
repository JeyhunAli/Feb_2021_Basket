package selenium_concept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JS_alert {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		Alert alert = driver.switchTo().alert();
		String Alerttext = alert.getText();
		System.out.println("Alert text: " +Alerttext);
		if(Alerttext.equals("Please enter a valid user name")){
			
		alert.accept();  //click on 
		//alert.dismiss(); // cancel
		
		}
		driver.switchTo().defaultContent();
		

	}

}
