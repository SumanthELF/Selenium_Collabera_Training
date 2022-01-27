package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement usernameTextField = driver.findElement(By.name("username"));
		WebElement passwordTextField = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[.='Log In']"));
		
//		System.out.println(loginButton.isEnabled());		
		usernameTextField.sendKeys("Sumanth");	
		passwordTextField.sendKeys("123sdajgf");
		
		System.out.println(usernameTextField.isDisplayed());
	}

}
