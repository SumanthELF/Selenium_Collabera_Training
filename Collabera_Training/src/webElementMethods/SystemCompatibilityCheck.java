package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SystemCompatibilityCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement utf = driver.findElement(By.id("email"));
		WebElement ptf = driver.findElement(By.id("passContainer"));
		
		Rectangle usernameRect = utf.getRect();
		Rectangle passwordRect = ptf.getRect();
		
		int yLocOfUsername = usernameRect.getY();
		int heightOfUsername = usernameRect.getHeight();
		final int SPACE = 5;
		
		int yLocOfPassword = passwordRect.getY();
		
		if(yLocOfUsername+heightOfUsername+SPACE <= yLocOfPassword) {
			System.out.println("It is not clashing");
		} else {
			System.out.println("It is overlapping");
		}
	}

}
