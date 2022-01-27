package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheAttribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String username="SumanthELFCollabera";
		driver.get("https://www.skillrary.com/user/login");	
		Thread.sleep(2000);
		WebElement usernameTF = driver.findElement(By.name("email"));
		usernameTF.clear();
		usernameTF.sendKeys(username);
		String actualDataEntered = usernameTF.getAttribute("value");
		System.out.println(actualDataEntered);
		if(actualDataEntered.equals(username)) {
			System.out.println("Username is entered properly");
		}
	}

}
