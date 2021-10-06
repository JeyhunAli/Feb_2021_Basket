package october_2021_selenium;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();

		br.initDriver("chrome");
		br.lauchUrl("https://www.amazon.com");

		String title = br.getPageTitle();
		System.out.println("page title : " + title);

		if (title.contains("Online Shopping")) {
			System.out.println("correct title");
		}

		System.out.println("current url: " +br.getPageUrl());
		br.closeBrowser();

	}

}