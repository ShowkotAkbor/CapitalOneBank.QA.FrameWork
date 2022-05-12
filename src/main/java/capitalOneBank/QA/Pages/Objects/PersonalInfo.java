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

	@FindBy(xpath = "(//input[@class='ods-textfield__input ng-pristine ng-invalid ng-touched ods-textfield__input--error'])")
	private WebElement firstNameInput;
	@FindBy(xpath = "(//input[@class='ods-textfield__input ng-pristine ng-invalid ng-touched ods-textfield__input--error'and @id='first-name'])")
	private WebElement lastNameInputElement;
	@FindBy(id = "button-0")
	private WebElement clickContinueElement;
	@FindBy(xpath = "//input[@class='ods-textfield__input ng-pristine ng-invalid ng-touched ods-textfield__input--error']")
	private WebElement inputEmailElement;
	@FindBy(xpath="//input[@class='ods-textfield__input ng-pristine ng-valid ng-touched']")
    private WebElement inputConfirmEmailElement;
	
	private void inputFirstnameStep(String value) {
		BaseClass.commonActions.inputText(firstNameInput, value);
	}

	private void inputLastNameStep(String value) {
		BaseClass.commonActions.inputText(lastNameInputElement, value);
	}

	private void clickContinueButtonStep() {
		BaseClass.commonActions.click(clickContinueElement);
	}

	private void inputEmailAddressStep(String Value) {
		BaseClass.commonActions.inputText(inputEmailElement, Value);
	}
	private void inputConfirmEmailAddressStep(String value) {
		BaseClass.commonActions.inputText(inputConfirmEmailElement);
	}
}
