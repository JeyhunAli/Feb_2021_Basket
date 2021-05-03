package seleniumsessions2021April;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextConcept {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
//		String h2Text = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(h2Text);
		
		By h2Header = By.tagName("h2");
		ElementUtil eleUtil = new ElementUtil(driver);
		
		String h2Text =  eleUtil.doGetText(h2Header);
		System.out.println(h2Text);
		
		String text[] = h2Text.split(" ");
		System.out.println(text[0]);
		System.out.println(text[1]);
		System.out.println(text[2]);
		System.out.println(text[3]);
		System.out.println(text[4]);
		System.out.println(text[5]);
		System.out.println(text[6]);
		System.out.println(text[7]);
		
	}

}
