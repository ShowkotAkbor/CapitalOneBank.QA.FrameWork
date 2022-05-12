package capitalOneBank.QA.Pages.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import capitalOneBank.QA.Base.BaseClass;

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

private void inputWhatIsYourNameStep(String expected) {
	BaseClass.commonActions.inputText(whatIsYourName, expected);
}
private void firstNameInputStep(String value) {
	BaseClass.commonActions.inputText(firstNameInput, value);
}
private void lastNameInputStep(String value) {
	BaseClass.commonActions.inputText(lastNameInputElement, value);
}
}

