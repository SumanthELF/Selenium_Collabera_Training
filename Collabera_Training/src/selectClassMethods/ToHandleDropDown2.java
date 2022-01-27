package selectClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDown2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/User/Desktop/dropDown.html");
		WebElement multiSelectDropdown = driver.findElement(By.id("m1"));
		Select select = new Select(multiSelectDropdown);
		
//		System.out.println(select.isMultiple());
//		select.selectByIndex(2);
//		Thread.sleep(2000);
//		select.selectByIndex(3);
//		Thread.sleep(2000);
//		select.selectByValue("1");
//		Thread.sleep(2000);
//		select.selectByVisibleText("Mango");
//		Thread.sleep(2000);
//		select.deselectByIndex(0);
//		Thread.sleep(2000);
//		select.deselectByValue("2");
//		Thread.sleep(2000);
//		select.deselectByVisibleText("Grapes");
//		select.deselectAll();
		
		select.selectByValue("7");
		Thread.sleep(2000);
		select.selectByValue("6");
		Thread.sleep(2000);
		select.selectByValue("5");
		
		WebElement frstOption = select.getFirstSelectedOption();
		System.out.println(frstOption.getText());
		
	}
}
