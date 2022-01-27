package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dataDriven.ExcelLib;
import pomRepo.HomePage;
import pomRepo.LoginPage;

/***
 * 
 * @author Sumanth Keshav
 *
 */
public class Login /*testCaseId*/ {                                      //testNG class

	@Test
	public void createAccount/*testCaseName*/ (){                         // test case
		//Test Data
		String testUrl = ExcelLib.readStringData("Sheet3", 0, 0);        // test steps
		String username = ExcelLib.readStringData("Sheet3", 0, 1);
		String password = ExcelLib.readStringData("Sheet3", 0, 2);
		String expectedLoginPageTitle = ExcelLib.readStringData("Sheet3", 1, 0);
		String expectedHomePageTitle = ExcelLib.readStringData("Sheet3", 1, 1);

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(testUrl);
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login Page is displayed Successfully");
		}
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApp(username, password);
		
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Login is Successfull");
		}
		
		HomePage homePage = new HomePage(driver);
		homePage.getUsersModulelink().click();
	}

}
