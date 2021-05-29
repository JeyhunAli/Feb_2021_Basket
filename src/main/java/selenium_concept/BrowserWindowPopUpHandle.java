package selenium_concept;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpHandle {
	
	/**
	 * cross origin policy new window pop up concept 
	 * one thing selenium supports window pop like cross origin pop up but cyprus not
	 * selenium handle it by using 
	 * window handler api
	 * always we need window id to switch between window
	 * now another big concept comes into the picture exact way to use 
	 * how will u handle window pop up 
	 * we can handle window pop up i mean multiple window handling 
	 * with windowHandler api there is a method getWindowHandles which will return the set object
	 * and i will iterate the set object to get window id one by one
	 * why iterator because iterator applied on set object and set is orderless
	 * and then using switch to window method and passing child window id 
	 * and what ever we want to verify on child window sunch as getting window title current url 
	 * as selenium supports cross origin policy thats why we can switch between window 
	 * once i switch tp child window i can do some verification such getting page title or current url 
	 * once im done with child window i have to close it not quit because quit will close entire session 
	 * then switching back to the parent window then here i can quit or close 
	 * 
	 * 
	 * driver.getWindowHandle()  and driver.getWindowHandles() 
	 * differences between them first one is for single window and it will tell you where is your window and it can provide you that window id 
	 * second one is for hansling multiple window 
	 * 
	 *  another concept selenium is not able to handle random pop up 
	 *  which is we dont know when it comes thats why while developing testing we always asking developer for timely to disable them 
	 *  this is limitations of selenium
	 * 
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

//		while (it.hasNext()) {
//			String id = it.next();
//			driver.switchTo().window(id);
//			System.out.println(driver.getTitle());
//			driver.close();
//		}

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