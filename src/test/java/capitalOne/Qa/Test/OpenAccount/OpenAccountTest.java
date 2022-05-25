package capitalOne.Qa.Test.OpenAccount;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import capitalOneBank.QA.Base.BaseClass;

public class OpenAccountTest extends BaseClass {

	@Test(enabled = true)
	public void openAccountShowkot() {
		openAccountPage.clickOpenAccountButtonStep(commonActions);
		letsGetStartedPage.clickAlreadyHaveCustomerAcountStep(commonActions, false);
		letsGetStartedPage.clickContinueButtonStep(commonActions);
		personalInfoPage.inputFirstNameStep(commonActions, "Showkot");
		personalInfoPage.inputLastNameStep(commonActions, "Akbor");
		personalInfoPage.clickContinueButtonStep(commonActions);
		personalInfoPage.inputEmailAddressStep(commonActions, "shoks.view007@gmail.com");
		personalInfoPage.inputConfirmEmailAddressStep(commonActions, "shoks.view007@gmail.com");
		personalInfoPage.clickContinueButtonStep1(commonActions);
		personalInfoPage.inputMobileNoStep(commonActions, "2025529177");
		personalInfoPage.clickContinueButtonStep2(commonActions);
		personalInfoPage.inputStreetAdressStep(commonActions, "8582 tyroleanway");
		personalInfoPage.inputAptStep(commonActions, "A");
		personalInfoPage.inputCityStep(commonActions, "Springfield");
		personalInfoPage.inputStateTep(commonActions, "VA");
		personalInfoPage.inputZipcodeStep(commonActions, "22153");
		personalInfoPage.clickContinueButtonStep3(commonActions);
		personalInfoPage.inputPrimaryCitizenStep(commonActions, "United States of America");
		personalInfoPage.clickContinueButtonStep4(commonActions);
		personalInfoPage.clickEmploymentStatusStep(commonActions);
		personalInfoPage.inputJobTitleStep(commonActions, "Quality Assurance Analyst");
		personalInfoPage.clickContinueButtonStep5(commonActions);
		personalInfoPage.clickAnualIncomeStep(commonActions);
		personalInfoPage.inpuDOBStep(commonActions, "12/31/1986");
		personalInfoPage.inputSSNStep(commonActions, "806-70-3030");
		personalInfoPage.clickContinueButtonStep6(commonActions);
		personalInfoPage.clickTermsAndConditionStep(commonActions, true);
	}

	@Test(enabled =false)
	public void openAccountShareer() {
		openAccountPage.clickOpenAccountButtonStep(commonActions);
		letsGetStartedPage.clickAlreadyHaveCustomerAcountStep(commonActions, false);
		letsGetStartedPage.clickContinueButtonStep(commonActions);
		personalInfoPage.inputFirstNameStep(commonActions, "Shareer");
		personalInfoPage.inputLastNameStep(commonActions, "Akbor");
		personalInfoPage.clickContinueButtonStep(commonActions);
		personalInfoPage.inputEmailAddressStep(commonActions, "shareer0601@outlook.com");
		personalInfoPage.inputConfirmEmailAddressStep(commonActions, "shareer0601@outlook.com");
		personalInfoPage.clickContinueButtonStep1(commonActions);
		personalInfoPage.inputMobileNoStep(commonActions, "2025529178");
		personalInfoPage.clickContinueButtonStep2(commonActions);
		personalInfoPage.inputStreetAdressStep(commonActions, "8582 wagonTrailLane");
		personalInfoPage.inputAptStep(commonActions, "B");
		personalInfoPage.inputCityStep(commonActions, "Burke");
		personalInfoPage.inputStateTep(commonActions, "VA");
		personalInfoPage.inputZipcodeStep(commonActions, "22152");
		personalInfoPage.clickContinueButtonStep3(commonActions);
		personalInfoPage.inputPrimaryCitizenStep(commonActions, "United States of America");
		personalInfoPage.clickContinueButtonStep4(commonActions);
		personalInfoPage.clickEmploymentStatusStep(commonActions);
		personalInfoPage.inputJobTitleStep(commonActions, "Accountant");
		personalInfoPage.clickContinueButtonStep5(commonActions);
		personalInfoPage.clickAnualIncomeStep(commonActions);
		personalInfoPage.inpuDOBStep(commonActions, "2/31/1988");
		personalInfoPage.inputSSNStep(commonActions, "806-70-3879");
		personalInfoPage.clickContinueButtonStep6(commonActions);
		personalInfoPage.clickTermsAndConditionStep(commonActions, true);
	}

}