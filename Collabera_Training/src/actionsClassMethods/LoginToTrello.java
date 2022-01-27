package actionsClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToTrello {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("sumanthkeshav.scl@gmail.com");
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.id("login-submit")).click();
		
		driver.findElement(By.xpath("//div[text()='Selenium Practise']")).click();
		Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
		WebElement srcElement = driver.findElement(By.xpath("//span[text()='Theory Qusetions']"));
		WebElement dstElement = driver.findElement(By.xpath("//h2[text()='Done']/../..//span[text()='Add a card']"));
//		actions.dragAndDropBy(srcElement, 800,0).perform();
		
		actions.clickAndHold(srcElement).moveByOffset(600, 300).perform();
		Thread.sleep(3000);
		actions.release().perform();
	}
}
