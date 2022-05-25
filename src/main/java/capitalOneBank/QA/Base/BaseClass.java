package capitalOneBank.QA.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

import capitalOneBank.QA.Common.CommonActions;
import capitalOneBank.QA.Pages.Objects.LetsGetStartedPage;

import capitalOneBank.QA.Pages.Objects.OpenAccontPage;
import capitalOneBank.QA.Pages.Objects.PersonalInfo;
import capitalOneBank.QA.Reporting.ExtentManager;
import capitalOneBank.QA.Reporting.ExtentTestManager;
import capitalOneBank.QA.Utilities.ReadConfigFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	private ExtentReports extent;

	public CommonActions commonActions;
	protected OpenAccontPage openAccountPage;
	protected LetsGetStartedPage letsGetStartedPage;
	protected PersonalInfo personalInfoPage;

	@BeforeSuite
	public void reportingInitiating() {
		extent = ExtentManager.getInstance();
	}

	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(String browser) {
		settingUpDriver(browser);
		driver.get(ReadConfigFile.getInstance().getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(ReadConfigFile.getInstance().getPageLoadTime()));
		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(ReadConfigFile.getInstance().getImplicitlyWaitTime()));
		initClasses();
	}

	private WebDriver settingUpDriver(String driverName) {
		if (driverName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (driverName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (driverName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;
	}

	@BeforeMethod
	public void startReport(Method method) {
		String className = method.getDeclaringClass().getSimpleName();
		ExtentTestManager.startTest(method.name());
		ExtentTestManager.getTest().assignCategory(className);
	}

	@AfterMethod
	public void afterEachTestMethod(ITestResult result) {
		for (String groups : result.getMethod().getGroups()) {
			ExtentTestManager.getTest().assignCategory(groups);
		}

		if (result.getStatus() == ITestResult.SUCCESS) {
			ExtentTestManager.getTest().log(Status.PASS, "Test Passed");
		} else if (result.getStatus() == ITestResult.SKIP) {
			ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
		} else if (result.getStatus() == ITestResult.FAILURE) {
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed \n" + result.getThrowable());
			String ssLocation = commonActions.getScreenShot();
			ExtentTestManager.getTest().addScreenCaptureFromPath(ssLocation);
		}
	}

	@AfterMethod
	public void cleaningUp() {
		driver.quit();
	}

	@AfterSuite
	public void endReport() {
		extent.flush();
	}

	private void initClasses() {
		commonActions = new CommonActions();
		openAccountPage = new OpenAccontPage(driver);
		letsGetStartedPage = new LetsGetStartedPage(driver);
		personalInfoPage = new PersonalInfo(driver);

	}

}
