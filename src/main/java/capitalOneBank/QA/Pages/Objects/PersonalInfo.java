package capitalOneBank.QA.Pages.Objects;

import javax.xml.xpath.XPath;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.bouncycastle.asn1.cmp.ProtectedPart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import capitalOneBank.QA.Base.BaseClass;
import capitalOneBank.QA.Common.CommonActions;

public class PersonalInfo {
	public PersonalInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='first-name']")
	protected WebElement firstNameInputElement;
	@FindBy(xpath = "(//input[@id='last-name'])")
	protected WebElement lastNameInputElement;
	@FindBy(id = "button-0")
	protected WebElement clickContinueElement;
	@FindBy(xpath = "(//input[@id='email-address'])")
	protected WebElement inputEmailElement;
	@FindBy(xpath = "(//input[@id='confirm-email-address'])")
	protected WebElement inputConfirmEmailElement;
	@FindBy(id = "button-4")
	protected WebElement clickContinueElement1;
	@FindBy(xpath = "(//input[@id='mobile-phone-number'])")
	protected WebElement inputMobileNoElement;
	@FindBy(id = "button-6")
	protected WebElement clickcontinueElement2;
	@FindBy(xpath = "(//input[@id='primary-street'])")
	protected WebElement inputStreetAdressElement;
	@FindBy(xpath = "(//input[@id='primary-apt'])")
	protected WebElement inputAptElement;
	@FindBy(xpath = "(//input[@id='primary-city'])")
	protected WebElement inputCityElement;
	@FindBy(id = "primary-state")
	protected WebElement inputStatElement;
	@FindBy(xpath = "(//input[@id='primary-zip-code'])")
	protected WebElement inputZipcodeElement;
	@FindBy(id = "button-19")
	protected WebElement clickContinueElement3;
	@FindBy(id = "primary-citizenship")
	protected WebElement inputPrimaryCitizenElement;
	@FindBy(id = "citizenship-continue")
	protected WebElement clickContinueElement4;
	@FindBy(xpath = "(//button[text()='Employed'])")
	protected WebElement employmentStatusElement;
	@FindBy(xpath = "(//input[@id='job-title'])")
	protected WebElement inputJobTitlElement;
	@FindBy(id = "button-2")
	protected WebElement clickContinueElement5;
	@FindBy(id = "button-2")
	protected WebElement clickAnualIncomeElement;
	@FindBy(xpath = "(//input[@id='date-of-birth'])")
	protected WebElement inputDOBElement;
	@FindBy(xpath = "(//input[@id='ssn-or-itin'])")
	protected WebElement inputSSNElement;
	@FindBy(id = "identity-continue")
	protected WebElement clickContinueElement6;
	@FindBy(xpath = "//label[contains(.,'I certify the following:')]")
	protected WebElement clickTermsAndConditionElement;

	public void inputFirstNameStep(CommonActions commonActions, String value) {
		commonActions.inputText(firstNameInputElement, value);
	}

	public void inputLastNameStep(CommonActions commonActions, String value) {
		commonActions.inputText(lastNameInputElement, value);
	}

	public void clickContinueButtonStep(CommonActions commonActions) {
		commonActions.click(clickContinueElement);
	}

	public void inputEmailAddressStep(CommonActions commonActions, String Value) {
		commonActions.inputText(inputEmailElement, Value);
	}

	public void inputConfirmEmailAddressStep(CommonActions commonActions, String value) {
		commonActions.inputText(inputConfirmEmailElement, value);
	}

	public void clickContinueButtonStep1(CommonActions commonActions) {
		commonActions.click(clickContinueElement1);
	}

	public void inputMobileNoStep(CommonActions commonActions, String value) {
		commonActions.inputText(inputMobileNoElement, value);
	}

	public void clickContinueButtonStep2(CommonActions commonActions) {
		commonActions.click(clickcontinueElement2);
	}

	public void inputStreetAdressStep(CommonActions commonActions, String value) {
		commonActions.inputText(inputStreetAdressElement, value);
	}

	public void inputAptStep(CommonActions commonActions, String value) {
		commonActions.inputText(inputAptElement, value);
	}

	public void inputCityStep(CommonActions commonActions, String value) {
		commonActions.inputText(inputCityElement, value);
	}

	public void inputStateTep(CommonActions commonActions, String value) {
		commonActions.inputText(inputStatElement, value);

	}

	public void inputZipcodeStep(CommonActions commonActions, String value) {
		commonActions.inputText(inputZipcodeElement, value);

	}

	public void clickContinueButtonStep3(CommonActions commonActions) {
		commonActions.click(clickContinueElement3);
	}

	public void inputPrimaryCitizenStep(CommonActions commonActions, String value) {
		commonActions.inputText(inputPrimaryCitizenElement, value);
	}

	public void clickContinueButtonStep4(CommonActions commonActions) {
		commonActions.click(clickContinueElement4);
	}

	public void clickEmploymentStatusStep(CommonActions commonActions) {
		commonActions.click(employmentStatusElement);
	}

	public void inputJobTitleStep(CommonActions commonActions, String value) {
		commonActions.inputText(inputJobTitlElement, value);

	}

	public void clickContinueButtonStep5(CommonActions commonActions) {
		commonActions.click(clickContinueElement5);
	}

	public void clickAnualIncomeStep(CommonActions commonActions) {
		commonActions.click(clickAnualIncomeElement);
	}

	public void inpuDOBStep(CommonActions commonActions, String Value) {
		commonActions.inputText(inputDOBElement, Value);

	}

	public void inputSSNStep(CommonActions commonActions, String value) {
		commonActions.inputText(inputSSNElement, value);
	}

	public void clickContinueButtonStep6(CommonActions commonActions) {
		commonActions.click(clickContinueElement6);
	}

	public void clickTermsAndConditionStep(CommonActions commonActions, boolean isselected) {
		commonActions.isSelected(clickTermsAndConditionElement);
		commonActions.click(clickTermsAndConditionElement);
	}

	public void personalInfoPageStep(CommonActions commonActions, String firstName, String lastName,
			String emailAddress, String confirmEmailAddress, String mobileNo, String streetAdress, String apt,
			String city, String state, String zipcode, String citizenShip, String jobTitle, String DOB,
			String SSNNumber) {

	}
}
