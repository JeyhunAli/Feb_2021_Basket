package selenium_concept;

import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");
		// collect the window IDs:
		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		while (it.hasNext()) {
				String childWindowId = it.next();
				System.out.println("child window id is: "+ childWindowId);
				driver.switchTo().window(childWindowId);
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				driver.close();
		}
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window id is: "+ parentWindowId);
		System.out.println(driver.getTitle());		
		

	}

}