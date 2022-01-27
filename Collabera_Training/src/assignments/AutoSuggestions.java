package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).click();
		List<WebElement> listOfSuggestions = driver.findElements(By.xpath("//li[@role='presentation' and @jsaction]"));
		List<WebElement> dataForSuggestion = driver.findElements(By.xpath("//li[@role='presentation' and @jsaction]//span[text()]"));
		System.out.println("The number of auto suggestion are : "+ listOfSuggestions.size());
		
		for(WebElement ele : dataForSuggestion) {
			System.out.println(ele.getText());
		}
	}

}
