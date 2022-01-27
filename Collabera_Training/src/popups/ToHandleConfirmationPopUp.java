package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.get("https://licindia.in/Home/Policy-Loan-Options#");
		driver.findElement(By.linkText("Pay Direct (Without login)")).click();

		Alert confirmationPoup = driver.switchTo().alert();
		System.out.println(confirmationPoup.getText());
//		confirmationPoup.accept();
		confirmationPoup.dismiss();
	}

}
