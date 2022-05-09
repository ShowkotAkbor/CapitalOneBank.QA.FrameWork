package capitalOneBank.QA.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
//import objects.MainPage;
//import objects.MusicPage;
//import objects.SignInPage;

public class BaseClass {
	public static WebDriver driver;
	//public HomePage homePage;
	//public MusicPage musicPage;
	//public SignInPage signInPage;
	
	
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.capitalone.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//initClasses();
	}
	
	@AfterMethod
	public void cleaningUp() {
		driver.quit();
	}
	
	/*private void initClasses() {
		mainPage = new MainPage(driver);
		musicPage = new MusicPage(driver);
		signInPage = new SignInPage(driver);
		*/
	}
}
