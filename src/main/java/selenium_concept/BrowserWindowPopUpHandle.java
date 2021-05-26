package selenium_concept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpHandle {
	
	/**
	 * how will u handle window pop up 
	 * we can handle window pop up i mean multiple window handling 
	 * with windowHandles api there is a method getWindowHandles which will return the set object
	 * and i will iterate the set object to get window id one by one
	 * why iterator because set object is orderless
	 * and the using switch to window method and passing child window id 
	 * as selenium supports cross origin policy thats why we can switch between window 
	 * once i switch tp child window i can do some verification such getting page title or current url 
	 * once im done with child window i have to close it not quit because quit will close netire session 
	 * then switching back to the parent window then here i can quit or close 
	 * @param args
	 */

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

		// collect the window IDs:
		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {
			String id = it.next();
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
			driver.close();
		}

		String parentWindowId = it.next();
		System.out.println("Parent window id is: " + parentWindowId);

		String childWindowId = it.next();
		System.out.println("Child window id is: " + childWindowId);

		// switching to child window:

		driver.switchTo().window(childWindowId);
		System.out.println("child window title is: " + driver.getTitle());
		System.out.println("child window url is: " + driver.getCurrentUrl());

		// close the child window:
		driver.close();

		// switching back to the parent window:
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title is: " + driver.getTitle());
		System.out.println("parent window url is: " + driver.getCurrentUrl());

		// close the parent window:
		driver.quit();

	}

}