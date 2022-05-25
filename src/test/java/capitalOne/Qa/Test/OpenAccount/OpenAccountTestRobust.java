package capitalOne.Qa.Test.OpenAccount;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import capitalOneBank.QA.Base.BaseClass;

public class OpenAccountTestRobust extends BaseClass {

	@Parameters({ "MobileNo", "FirstName" })

	@Test(enabled = true, groups = { "openAccount", "Showkot" })
	public void showkotTest(String mobileNo, String firstName) {
		openAccountPage.clickOpenAccountButtonStep(commonActions);
		personalInfoPage.inputMobileNoStep(commonActions, mobileNo);
		personalInfoPage.personalInfoPageStep(commonActions, firstName, "Akbor", "shoks.view007@gmail.com",
				"shoks.view007@gmail.com", "2025529177", "8582 tyroleanway", "A", "Springfield", "VA", "22153",
				"United States Of America", "Waiter", "12/31/1983", "806803720");
	}

	@Test(enabled = true, groups = { "openAcoount", " showkot" })
	public void showkotTestWithoutParam() {
		openAccountPage.clickOpenAccountButtonStep(commonActions);
		personalInfoPage.inputMobileNoStep(commonActions, "2025529177");
		personalInfoPage.personalInfoPageStep(commonActions, "showkot", "Akbor", "shoks.view007@gmail.com",
				"shoks.view007@gmail.com", "2025529177", "8582 tyroleanway", "A", "Springfield", "VA", "22153",
				"United States Of America", "Waiter", "12/31/1983", "806803720");
	}

	@Test(enabled = true, groups = { "openAccount", "Shareer" })
	public void shareerTest() {
		openAccountPage.clickOpenAccountButtonStep(commonActions);
		personalInfoPage.inputMobileNoStep(commonActions, "2024456778");
		personalInfoPage.personalInfoPageStep(commonActions, "shareer", "Akbor", "shareer0601@outlook.com",
				"shareer0601@outlook.com", "2024456778", "8586 tyroleanway", "A", "Springfield", "VA", "22153",
				"United States Of America", "Quality assurance Analyst", "06/01/2003", "806803030");
	}

	@Test(enabled = true, dependsOnMethods = "shareerTest", ignoreMissingDependencies = true, groups = { "shareer" })
	public void dependsOnMethod() {

	}

	@Test(dependsOnGroups = { "showkot" }, ignoreMissingDependencies = true, enabled = false)
	public void dependsOnGroups() {

	}
}
