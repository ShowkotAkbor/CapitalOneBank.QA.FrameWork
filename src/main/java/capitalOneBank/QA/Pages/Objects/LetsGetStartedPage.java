package capitalOneBank.QA.Pages.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import capitalOneBank.QA.Common.CommonActions;

public class LetsGetStartedPage {

	public LetsGetStartedPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "existing_customer")
	protected WebElement existingCustomerYElement;
	@FindBy(id = "new_customer")
	protected WebElement newCustomerNElement;
	@FindBy(id = "expectations-continue")
	protected WebElement continueElement;

	public void clickAlreadyHaveCustomerAcountStep(CommonActions commonActions, boolean isAlreadyCustomer) {
		boolean status = commonActions.isSelected(newCustomerNElement);
		if (!status && !isAlreadyCustomer) {
			commonActions.click(newCustomerNElement);
		} else {
			commonActions.logEventAndFail("Existing customer is not in selected status");
		}

	}

	public void clickContinueButtonStep(CommonActions commonActions) {
		commonActions.click(continueElement);
	}
}
