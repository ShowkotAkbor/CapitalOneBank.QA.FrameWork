package capitalOneBank.QA.Pages.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetsGetStarted {
public void LetsGEtStarted(WebDriver driver) {
	PageFactory.initElements(driver, this);	
}
@FindBy(id="new_customer")
private WebElement newCustomerElement;
@FindBy(id="expectations-continue")
private WebElement continuElement;




}
