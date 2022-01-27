package pomRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganisationPage {

	@FindBy(id="") private WebElement addOrg;

	public WebElement getAddOrg() {
		return addOrg;
	}
	
	
}
