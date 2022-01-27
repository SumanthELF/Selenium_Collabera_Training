package popups;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreshersWorld {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.linkText("Register Free")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("file-upload")).sendKeys("D:\\Sumanth ELF\\CourseContentSelenium.pdf");
	}

}
