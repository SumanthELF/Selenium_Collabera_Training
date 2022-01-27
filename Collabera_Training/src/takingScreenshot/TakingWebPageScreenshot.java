package takingScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingWebPageScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.skillrary.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(tempFile);
		File destFile = new File("./errorshots/Scrnshot1.png");		
		
		FileUtils.copyFile(tempFile, destFile);
		
//		File weScreenShot = driver.findElement(By.xpath("//a[.='FIND FOOD']")).getScreenshotAs(OutputType.FILE);
//		File weDestFile = new File("./errorshots/weSc.png");
//		weScreenShot.renameTo(weDestFile);		
		driver.findElement(By.id("")).findElement(By.name("")).findElement(By.id(""));
	}

}
