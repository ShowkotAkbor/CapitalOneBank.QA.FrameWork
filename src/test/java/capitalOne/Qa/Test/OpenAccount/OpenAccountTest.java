package capitalOne.Qa.Test.OpenAccount;

import org.testng.annotations.Test;

import capitalOneBank.QA.Base.BaseClass;

public class OpenAccountTest extends BaseClass {

	@Test(enabled = true, priority=1)
	public void openAccount() {
		openAccountPage.clickOpenAccountButtonStep(commonActions);
	}
@Test(enabled=true, priority=1)
	public void letsGetStarted() {
		letsGetStartedPage.clickAlreadyHaveCustomerAcountStep(commonActions, false);
		letsGetStartedPage.clickContinueButtonStep(commonActions);
	}

}
