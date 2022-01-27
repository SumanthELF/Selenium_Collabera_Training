package actionsClassMethods;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.myntra.com/");
		List<WebElement> navBarElement = driver.findElements(By.xpath("//a[@data-type='navElements']"));

		for(WebElement element:navBarElement) {
			Actions actions=new Actions(driver);
			actions.keyDown(Keys.CONTROL).click(element).perform();
			actions.keyUp(Keys.CONTROL).perform();

		}

		String expectedWindow = "Home and Living - Buy Interior Decoration Products and Accessories Online in India";
		Set<String> WindowHandle=driver.getWindowHandles();
		for(String windowId : WindowHandle) {
			driver.switchTo().window(windowId);
			String actualWindow=driver.getTitle();
			if(expectedWindow.equals(actualWindow)) {
				driver.close();
			}
		}
	}

}
