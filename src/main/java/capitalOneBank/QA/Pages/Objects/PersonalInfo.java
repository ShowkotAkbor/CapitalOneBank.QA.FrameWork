package capitalOneBank.QA.Pages.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfo {
public PersonalInfo(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(className="ods-text__heading--medium-large title")
private WebElement whatIsYourName;

@FindBy(xpath ="(//input[@class='ods-textfield__input ng-pristine ng-invalid ng-touched ods-textfield__input--error'])")	
	private WebElement firstNameInput;
@FindBy(xpath ="(//input[@class='ods-textfield__input ng-pristine ng-invalid ng-touched ods-textfield__input--error'and @id='first-name'])")
private WebElement lastNameInputElement;

private void getWhatIsYourNameStep(String expected) {
	BaseClass.commonActions.getText(whatIsYourName, expected);
}
private void firstNameInputStep(String value) {
	BaseClass.commonActions.writeText(firstNameInput, value);
}
private void lastNameInputStep(String value) {
	BaseClass.commonActions.writeText(lastNameInput, value);
}
}

