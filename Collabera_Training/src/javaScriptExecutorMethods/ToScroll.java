package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScroll{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.skillrary.com/");
		WebElement scrollEle = driver.findElement(By.xpath("//h3[contains(text(),'Testimonials')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		/*Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500);");*/ 

		js.executeScript("arguments[0].scrollIntoView(false);",scrollEle);
	}

}
