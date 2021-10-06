package october_2021_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3CWebDriver {
	
	                    /**
	                     * 
	                     * @param args
	                     *   The World Wide Web Consortium
	                     *   
	                     *   before w3c how was it working let me explain so we had our script where we write our java code 
	                     *   that java selenium code is used to communicate with executible browsers like chrome, firefox, edge
	                     *   or safari via json wire protocol we used sent http request once the session id created over 
	                     *   executable browser then it communicate with actual web browser and the same way we were getting response
	                     *   to the client 
	                     *   this is the way of json wire protocol is used to commincate with browser 
	                     *   
	                     *   but now http json wire protocol replaced with w3c webdriver protocol its actually implemented
	                     *   on the language binding its not using json wire protocol
	                     *   now our same script interacting with w3c protocol and creating communication with the browsers 
	                     *  
	                     *   now we are using selenium  3.141.59 but upto 3.8 we were using selenium with json wire protocol
	                     *   after 3.8 they started to iplement communication with w3c 
	                     *   it means we are already using w3c standarts in our scripts to make communication with web browers 
	                     *   
	                     *   advantages :
	                     *   1. standarts both side following common protocolas 
	                     *   communications happening wire w3c web protocol because when your script, executable driver and 
	                     *   actual webdriver all these following common w3c standarts then easy and fastest communication happening 
	                     *   
	                     *   2.stability :
	                     *   earlier what happening lets say we have script and we were on chrome browser 
	                     *   and same script its not working properly on firefox or edge or safari 
	                     *   because same latency issue, some locator issue some locator works on chrome some not works on firefox
	                     *   but with w3c standarts these issues not happening 
	                     *   
	                     *   3.Actions Api :
	                     *   for example two keys in keyboard can be press same time, or zoom in zoom out can be done 
	                     *   
	                     *   
	                     *  
	                     * 
	                     */

	public static void main(String[] args) {
		

		
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.get("https://google.com");//2. launch url
        		
        		String title = driver.getTitle();//3. get the title of the page
        		System.out.println(title);
        		
        		driver.quit();//close the browser
        		//driver.close();//close the browser
        		
//        		driver = new ChromeDriver();
//        		driver.get("https://google.com");
//        		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
	}

}
