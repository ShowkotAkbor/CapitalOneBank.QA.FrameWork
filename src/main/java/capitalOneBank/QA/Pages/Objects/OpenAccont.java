package capitalOneBank.QA.Pages.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccont {
public  OpenAccont(WebDriver driver) {
PageFactory.initElements(driver, this);	
}
@FindBy(xpath="(//a[@class='grv-button--progressive hero-card__button'])")
private WebElement Openaccountbutton;



public void clickOpenAccountButton(capitalOneBank.QA.Common.CommonActions commonActions, boolean isOpenAccountButton) {
	//boolean status = commonActions.isSelected(Openaccountbutton);
	if(!isOpenAccountButton && isOpenAccountButton) {
		commonActions.click(Openaccountbutton);
	}else if(isOpenAccountButton) {
		commonActions.logEventAndFail("Deafult status of "+ Openaccountbutton + " : is selected");
	}
}
}
