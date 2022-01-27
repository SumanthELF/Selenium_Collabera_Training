package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToAnELementWinthOffset {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.skillrary.com/user/login");
//		WebElement passwordtextField = driver.findElement(By.name("password"));
//		passwordtextField.sendKeys("sadlkfhasf");
//		
		Actions actions = new Actions(driver);
//		actions.moveToElement(passwordtextField, 430, -100).click().perform();
		actions.moveByOffset(100, 100).contextClick().perform();
	}

}
