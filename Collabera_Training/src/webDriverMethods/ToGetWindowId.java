package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId : allWindowIds) {
			System.out.println(windowId);
		}
		driver.quit();
	}

}
