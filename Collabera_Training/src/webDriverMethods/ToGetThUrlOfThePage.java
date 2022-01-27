package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThUrlOfThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
