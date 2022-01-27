package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateAnElementUsingNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("Sumanth");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Abcd123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
	}

}
