package selenium_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadpopUp {
	
	/**
	 * 
	 * @param args
	 * for File Upload popUp in dom type=file has to be there 
	 * if it there this concept will work other wise it wont work
	 * and directly using send keys method 
	 * copy of the file path from computer and pass as String inisde pharenthesis
	 */

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		// File Upload pop up:
		// type="file" should be there
		WebElement chooseFile = driver.findElement(By.name("upfile"));

		chooseFile.sendKeys("/Users/naveenautomationlabs/Documents/POM_July.png");

	}

}