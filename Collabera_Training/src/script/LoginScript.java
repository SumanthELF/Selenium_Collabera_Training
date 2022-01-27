package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dataDriven.ExcelLib;

/***
 * 
 * @author Sumanth Keshav
 *
 */
public class LoginScript {

	public static void main(String[] args) {
		//Test Data
		String testUrl = ExcelLib.readStringData("Sheet3", 0, 0);
		String username = ExcelLib.readStringData("Sheet3", 0, 1);
		String password = ExcelLib.readStringData("Sheet3", 0, 2);
		String expectedLoginPageTitle = ExcelLib.readStringData("Sheet3", 1, 0);
		String expectedHomePageTitle = ExcelLib.readStringData("Sheet3", 1, 1);

		//Step 1 : Open the browser Enter the URL
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		driver.get(testUrl);
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login page is displayed successfully");
		}else {
			System.out.println("Login page is not displayed successfully");
		}

		//Step 2 : Enter Username into username text field
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(username);
		String actualUsernameEntered = usernameTextField.getAttribute("value");
		if(actualUsernameEntered.equals(username)) {
			System.out.println("Username is entered successfully");
		}else {
			System.out.println("Username is not enterd successfully");
		}

		//Step 3 : Enter Password into password text field
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys(password);
		String actualPasswordEntered = passwordTextField.getAttribute("value");
		if(actualPasswordEntered.equals(password)) {
			System.out.println("Password is entered successfully");
		}else {
			System.out.println("Password is not enterd successfully");
		}
		
		//Step 4 : Click on Login button
		driver.findElement(By.id("loginButton")).click();	
		explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Home page is displayed successfully");
		}else {
			System.out.println("Home page is not displayed successfully");
		}
	}

}
