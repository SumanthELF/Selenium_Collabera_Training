package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheTitleOfTheWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.skillrary.com/");
//		String titleOfThePage = driver.getTitle();
		System.out.println(driver.getTitle());
	}

}
