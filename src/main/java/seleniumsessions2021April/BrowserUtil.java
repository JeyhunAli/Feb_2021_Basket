package seleniumsessions2021April;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	public WebDriver driver;

	/**
	 * this method will initialize the driver on the basis of given browser name
	 * 
	 * @param browserName
	 * @return this will return the driver
	 */
	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is : " + browserName);
		
		switch (browserName.toLowerCase()) {     //this line will make the browser name lower case and even if u pass with capital letters it will work
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("Browser not found...Please pass the right browser name...");
			break;
		}

		return driver;

	}

	public void lauchUrl(String url) {
		if (url == null)
			return;
		System.out.println("url is null " + url);
		if (url.isEmpty())
			return;
		System.out.println("url is empty " + url);
		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}

}
