package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayListBox = driver.findElement(By.id("day"));
		WebElement monthListBox = driver.findElement(By.id("month"));
		WebElement yearListBox = driver.findElement(By.id("year"));
		
//		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));
//		for(WebElement ele : months) {
//			System.out.println(ele.getText());
//		}
		Select daySelect = new Select(dayListBox);
		System.out.println(daySelect.isMultiple());
//		List<WebElement> dayListBoxOptions = daySelect.getOptions();
//		for(WebElement ele : dayListBoxOptions) {
//			System.out.println(ele.getText());
//		}
		daySelect.selectByIndex(20);
		
		Select monthSelect = new Select(monthListBox);
		System.out.println(monthSelect.isMultiple());
//		List<WebElement> monthListBoxOptions = monthSelect.getOptions();
//		for(WebElement ele : monthListBoxOptions) {
//			System.out.println(ele.getText());
//		}
		monthSelect.selectByValue("12");
		
		Select yearSelect = new Select(yearListBox);
		System.out.println(yearSelect.isMultiple());
//		List<WebElement> years = yearSelect.getOptions();
//		for(WebElement ele : years) {
//			System.out.println(ele.getText());
//		}
		yearSelect.selectByVisibleText("1994");
	}

}
