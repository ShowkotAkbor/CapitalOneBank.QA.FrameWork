package capitalOneBank.QA.Pages.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import capitalOneBank.QA.Base.BaseClass;
import commons.CommonActions;


public class OpenAccont {
public  OpenAccont(WebDriver driver) {
PageFactory.initElements(driver, this);	
}
@FindBy(xpath="(//a[@class='grv-button--progressive hero-card__button'])")
private WebElement Openaccountbutton;



public void checkopenaccountbutton(capitalOneBank.QA.Common.CommonActions commonActions, boolean isopenaccountbutton) {
	//boolean status = commonActions.isSelected(Openaccountbutton);
	if(!isopenaccountbutton && isopenaccountbutton) {
		commonActions.click(Openaccountbutton);
	}else if(isopenaccountbutton) {
		commonActions.logEventAndFail("Deafult status of "+ Openaccountbutton + " : is selected");
	}
}
}
