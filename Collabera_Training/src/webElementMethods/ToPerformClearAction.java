package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformClearAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		Thread.sleep(2000);
		usernameTextField.sendKeys("sumanth");
		Thread.sleep(2000);
		
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		Thread.sleep(2000);
		passwordTextField.sendKeys("Demo123");
	}

}
