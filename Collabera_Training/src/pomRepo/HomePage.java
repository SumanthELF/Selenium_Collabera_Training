package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="container_tasks") private WebElement tasksModulelink;
	
	@FindBy(id="container_reports") private WebElement reportsModulelink;
	
	@FindBy(id="container_users") private WebElement usersModulelink;

	public WebElement getTasksModulelink() {
		return tasksModulelink;
	}

	public WebElement getReportsModulelink() {
		return reportsModulelink;
	}

	public WebElement getUsersModulelink() {
		return usersModulelink;
	}
	
}
