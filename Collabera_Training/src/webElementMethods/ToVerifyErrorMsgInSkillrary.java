package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMsgInSkillrary {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/user/login");		
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		
		String expectedErrorMsg = "Email Field Is Required";
		
		WebElement errorMsgElement = driver.findElement(By.id("email-error"));
		String actualErrorMsg = errorMsgElement.getText();
		System.out.println(actualErrorMsg);
		
		if(expectedErrorMsg.equals(actualErrorMsg)) {
			System.out.println("Proper error message is dispalyed");
		}else {
			System.out.println("Invalid error message");
		}
		
	}
}
