package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Data members or properties
	@FindBy(id="username") 
	private WebElement usernameTextField;
	
	@FindBy(name="pwd") 
	private WebElement passwordTextField;
	
	@FindBy(id="loginButton") 
	private WebElement loginButton;

	//getter methods
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//action methods or business logics or page action         
	public void loginToApp(String username,String password) {      //landing page concept
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	
	public void signUp() {
		
	}
}
