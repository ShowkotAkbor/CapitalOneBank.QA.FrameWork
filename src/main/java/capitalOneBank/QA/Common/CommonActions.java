package capitalOneBank.QA.Common;

import org.openqa.selenium.WebElement;
// open accoount needs to be click.
public class CommonActions {
	public void click(WebElement element) {
		try {
			BaseClass.waits.waitUntilClickable(element);
			element.click();
			Logger.log(element + " clicked");
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Logger.log(element + " Element Not Found \n" + e.getLocalizedMessage());
			Assert.fail();
}
