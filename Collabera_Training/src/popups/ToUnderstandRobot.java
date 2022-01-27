package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandRobot {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(1000);
		Runtime.getRuntime().exec("./autoIt/notPopUp.exe");
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//		Thread.sleep(1000);
//		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);ABM
//		robot.keyPress(KeyEvent.VK_ALT);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(5000);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_ALT);
//		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyPress(KeyEvent.VK_B);
//		robot.keyPress(KeyEvent.VK_M);
//		robot.keyRelease(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_B);
//		robot.keyRelease(KeyEvent.VK_M);
//		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
	}

}
