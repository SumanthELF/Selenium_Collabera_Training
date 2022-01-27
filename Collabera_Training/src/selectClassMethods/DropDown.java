package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/User/Desktop/dropDown.html");
		WebElement multiSelectBox = driver.findElement(By.id("m1"));
		
		Select select = new Select(multiSelectBox);
		select.selectByVisibleText("Jackfruit");
		select.selectByVisibleText("Orange");
		
		WebElement frstOption = select.getFirstSelectedOption();
		System.out.println(frstOption.getText());
//		List<WebElement> optionsSelected = select.getAllSelectedOptions();
//		for(WebElement ele :  optionsSelected) {
//			System.out.println(ele.getText());
//		}
	}
}
