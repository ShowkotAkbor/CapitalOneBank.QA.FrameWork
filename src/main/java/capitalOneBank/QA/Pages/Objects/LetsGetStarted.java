package capitalOneBank.QA.Pages.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetsGetStarted {
private static final boolean status = false;

public  LetsGetStarted(WebDriver driver) {
	PageFactory.initElements(driver, this);	
}
@FindBy(id="existing_customer")
private WebElement existingCustomerYElement;
@FindBy(id="new_customer")
private WebElement newCustomerNElement;
@FindBy(id="expectations-continue")
private WebElement continuElement;

public void clickAlreadyHaveCustomerAcount(capitalOneBank.QA.Common.CommonActions commonActions, boolean isExistingCustomer) {
	//boolean status = commonActions.isSelected(existingCustomerYElement);
	if(status && isExistingCustomer) {
	//	commonActions.click(existingCustomerYElement);
	}else if(status && !isExistingCustomer){
		commonActions.click(newCustomerNElement);
	}else {
		commonActions.logEventAndFail("Daytime Lamp is not in selected status");
	}


}
}
