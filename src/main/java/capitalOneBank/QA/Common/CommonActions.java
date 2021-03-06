package capitalOneBank.QA.Common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

import capitalOneBank.QA.Base.BaseClass;
import capitalOneBank.QA.Reporting.JavaLog;

// open accoount needs to be click.
public class CommonActions {
	private static final String text = null;
	WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
	JavascriptExecutor jsExecutor = (JavascriptExecutor) BaseClass.driver;

	public void click(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			Reporter.log("Element is Cliking : " + element + "<br>");
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.log("Element is unable to click: " + element + "\n" + e.getMessage() + "<br>");
			Assert.fail();
		}
	}

	public void inputText(WebElement element, String text) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(text);
			Reporter.log(text + " : value passed to element : " + element + "<br>");
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.log("Element is not found : " + element + "\n" + e.getMessage() + "<br>");
			Assert.fail();
		}
	}

	public void inputText(WebElement element) {
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(String.valueOf(text));
			Reporter.log(text + " : value passed to element : " + element + "<br>");
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.log("Element is not found : " + element + "\n" + e.getMessage() + "<br>");
			Assert.fail();
		}
	}

	public String getUrl() {
		String currentUrl = BaseClass.driver.getCurrentUrl();
		Reporter.log("Current URL is : " + currentUrl + "<br>");
		return currentUrl;
	}

	public void selectByValue(WebElement element, String value) {
		try {
			sleep(0.5);
			Select select = new Select(element);
			select.selectByValue(value);
			Reporter.log(value + " : value has been selected from the element : " + element + "<br>");
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.log("Locator doesn't match for : " + element + "\n" + e.getMessage() + "<br>");
			Assert.fail();
		}
	}

	public boolean isSelected(WebElement element) {
		boolean status = false;
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			status = element.isSelected();
			if (status) {
				Reporter.log(element + " : is selected" + "<br>");
			} else {
				Reporter.log(element + " : is Not selected" + "<br>");
			}
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.log("Element Not Found : " + element + "\n" + e.getMessage() + "<br>");
			Assert.fail();
		}
		return status;
	}

	public void sleep(double seconds) {
		try {
			Thread.sleep((long) (seconds * 1000));
			Reporter.log("Sleeping for : " + seconds + " seconds zZzz.." + "<br>");
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.log("Sleeping interuppted" + "<br>");
		}
	}

	public void inputUsingJSXforIdLocator(String element, String text) {
		try {
			jsExecutor.executeScript("document.getElementById('" + element + "').value='" + text + "';");
			Reporter.log(text + " : value passed to element : " + element + "<br>");
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.log("Element is not found : " + element + "\n" + e.getMessage() + "<br>");
			Assert.fail();
		}
	}

	public boolean isPresent(By by) {
		boolean status = false;
		try {
			List<WebElement> elements = BaseClass.driver.findElements(by);
			if (elements.size() > 0) {
				status = true;
				Reporter.log(by + " : Element is Present" + "<br>");
			} else {
				Reporter.log(by + " : Element is Not Present" + "<br>");
			}
		} catch (Throwable e) {
			e.printStackTrace();
			Reporter.log("Element is not found : " + by + "\n" + e.getMessage() + "<br>");
		}
		return status;
	}

	public void logEvent(String eventMsg) {
		Reporter.log(eventMsg + "<br>");
	}

	public void logEventAndFail(String eventMsg) {
		Reporter.log(eventMsg + "<br>");
		Assert.fail();
	}

	public String getScreenShot() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy_hh.mm.ss");
		String suffix = dateFormat.format(date);
		File file = new File("screenShots/error_" + suffix + ".png");
		String fileLocation = file.getAbsolutePath();
		TakesScreenshot ss = ((TakesScreenshot) BaseClass.driver);
		File srcFile = ss.getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(srcFile, file.getAbsoluteFile());
			JavaLog.log("Test Failed & Sceenshot taken in location : " + fileLocation);
		} catch (IOException e) {
			JavaLog.log("Error while taking screen shot");
		}
		return fileLocation;
	}

}
