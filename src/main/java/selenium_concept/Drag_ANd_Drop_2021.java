package selenium_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_ANd_Drop_2021 {
	
	static WebDriver driver;
    static ElementUtil util;

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		util = new ElementUtil(driver);
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        
        By drag = By.id("draggable");
        By drop = By.id("droppable");
        
        util.drag_and_drop_2(drag, drop);
        
		
	}

}
