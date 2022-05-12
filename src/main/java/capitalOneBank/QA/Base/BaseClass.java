package capitalOneBank.QA.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import capitalOneBank.QA.Common.CommonActions;
import capitalOneBank.QA.Pages.Objects.LetsGetStarted;
import capitalOneBank.QA.Pages.Objects.OpenAccont;
import capitalOneBank.QA.Pages.Objects.PersonalInfo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	protected LetsGetStarted letsGetStartedPage;
	protected CommonActions commonActions;
	protected OpenAccont openAccountPage;
	protected PersonalInfo personalInfoPage;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.progressive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initClasses();
	}

	@AfterMethod
	public void cleaningUp() {
		// driver.quit();
	}

	private void initClasses() {
		commonActions = new CommonActions();
		letsGetStartedPage = new LetsGetStarted(driver);
		openAccountPage = new OpenAccont(driver);
		personalInfoPage = new PersonalInfo(driver);

	}

}
