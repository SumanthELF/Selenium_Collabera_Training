package actionsClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToKeyUpAndKeyDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
		List<WebElement> navBarElements = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		Actions actions = new Actions(driver);
		
		for(WebElement ele : navBarElements) {
			actions.keyDown(Keys.SHIFT).click(ele).perform();
			actions.keyUp(Keys.SHIFT).perform();
		}
	}

}
