package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffMail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login1")).sendKeys("SumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();

		driver.findElement(By.xpath("//a[.='Write mail']")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthElfBatch@rediffmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'subject')]")).sendKeys("Sumanth");
		Thread.sleep(2000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]"));
		Thread.sleep(2000);

		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hi Good evening");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Send")).click();
		Thread.sleep(2000);
		for(;;) {
			try {
				driver.findElement(By.xpath("//span[text()='Sumanth']/..//cite[@title='Select mail']")).click();
				driver.findElement(By.xpath("//span[text()='Delete' and @class='rd_fil_del']")).click();
				driver.findElement(By.xpath("//button[text()='Ok']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.navigate().refresh();
			}
		}	
	}

}
