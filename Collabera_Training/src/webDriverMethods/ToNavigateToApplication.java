package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com");
		driver.get("https://www.swiggy.com/");
	}

}
