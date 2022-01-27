package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOHandleFileUploadPopUp {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email')]")).sendKeys("sumanthqsp@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
//		try {
//			driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
//		}catch(NoSuchElementException e) {
//
//		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='uploadBtn']")).sendKeys("D:\\WebTechnology\\TestYantra - HTML5 pdfs.pdf");
//		Runtime.getRuntime().exec("./autoIt/fileUpload.exe");
	}

}
