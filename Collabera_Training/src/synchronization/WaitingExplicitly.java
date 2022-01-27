package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitingExplicitly {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.instagram.com/"); 
//		explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.name("usename")));
		driver.findElement(By.name("username")).sendKeys("Sumanth");
		
		
		
		
	}

}
