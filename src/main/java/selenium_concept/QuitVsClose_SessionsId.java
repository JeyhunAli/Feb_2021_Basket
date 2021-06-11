package selenium_concept;

import org.openqa.selenium.WebDriver;

/**
 * differences between quit and close 
 * 1. after wrting your code debug it then it will give you session id 
 *  ChromeDriver: chrome on MAC (ecf069faa3217c564fa582b4eb41082c)  ----->>> this is the session id 
 *  this session id will be in every step in this class until we will quit our browser 
 *  once we quit the job session id will over 
 *  if you want to verify it right after quit method just write this line driver.get title 
 *  and write it again then you will get   nosuchsessionexception 
 *  
 *  
 *  
 *  but with the close statement after closing the browser we are getting same exception  nosuchsessionexception 
 *  but session id is there even after closing the browser it shows the 
 *  browser id same one but its expired 
 *  its not null as quit method in quit method it says null id 
 *  but with close it says invalid id means its already expired 
 *  the main differnces after quit in debugging mode no session id is available but after close session id is available
 *  but its already expired no use of that 
 *  
 *  
 *  somebody can ask silly question so how i can solve this issue 
 *  its simple just create again object of any browser then it will give you new session id 
 *  
 *  there's another difference as well but it belong to window pop up 
 *  i will add that difference later stay tuned )))
 *  
 * 
 */

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose_SessionsId {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "path");
		WebDriver driver = new ChromeDriver(); // Open Browser
		// 123
		driver.get("http://google.com");
		// 123
		String title = driver.getTitle();
		System.out.println(title);// Google

		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.quit();// close the browser //123
		// driver.close();//123

		// id = null
		

		//driver.quit();   //NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		//driver.close();     // org.openqa.selenium.NoSuchSessionException: invalid session id

		driver = new ChromeDriver();// 456
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

		// NoSuchSessionException: invalid session id

	}

}