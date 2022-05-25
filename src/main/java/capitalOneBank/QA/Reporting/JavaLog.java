package capitalOneBank.QA.Reporting;

import java.util.logging.Logger;

import org.openqa.selenium.devtools.v99.network.model.TrustTokenOperationDone.Status;
import org.testng.Reporter;

public class JavaLog {

	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void log(final String msg) {
		LOGGER.info(msg);
		Reporter.log(msg + "<br>");
		//ExtentTestManager.getTest().log(Status.INFO, msg);
	}
}
