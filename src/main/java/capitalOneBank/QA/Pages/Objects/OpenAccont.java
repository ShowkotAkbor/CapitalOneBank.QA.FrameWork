package capitalOneBank.QA.Pages.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import capitalOneBank.QA.Base.BaseClass;


public class OpenAccont {
public void OpenAccount(WebDriver driver) {
PageFactory.initElements(driver, this);	
}
@FindBy(xpath="(//a[@class='grv-button--progressive hero-card__button'])")
private WebElement openaccountbuttonElement;



public void clickOpenACccountbutton() {
	BaseClass.commonActions.click(openAccontbutton);
}
}