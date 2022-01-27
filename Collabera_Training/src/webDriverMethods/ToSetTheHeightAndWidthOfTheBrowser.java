package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetTheHeightAndWidthOfTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		Dimension dimension = new Dimension(1000, 500);
		driver.manage().window().setSize(dimension);
	}
}
