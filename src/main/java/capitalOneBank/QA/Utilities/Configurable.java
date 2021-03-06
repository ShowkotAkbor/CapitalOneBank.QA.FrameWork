package capitalOneBank.QA.Utilities;

/*import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.formula.SheetNameFormatter;
import org.testng.Assert;

import capitalOneBank.QA.Reporting.Java_Logger;



public class Configurable {
	static Configurable configurable;
	private String path = "./configuration/config.properties";
	private Properties properties;

	private String url;
	private int explicitWait;
	private int pageLoadWait;
	private int elementImplicitWait;
	//private String excelPath;
	//private int sheetNum;

	private Configurable() {
	}

	public static Configurable getInstance() {
		if (configurable == null) {
			configurable = new Configurable();
		}
		configurable.loadProperties();
		return configurable;
	}

	private void loadProperties() {
		// BufferedReader bufferedReader;
		// FileReader fileReader;
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(path);
			properties = new Properties();
			properties.load(fileInputStream);
			url = properties.getProperty("url");
			excelPath = properties.getProperty("excelPath");
			try {
				explicitWait = Integer.parseInt(properties.getProperty("explicitWait"));
				pageLoadWait = Integer.parseInt(properties.getProperty("pageLoadWait"));
				elementImplicitWait = Integer.parseInt(properties.getProperty("elementImplicitWait"));
				sheetNum = Integer.parseInt(properties.getProperty("sheetNum"));
			} catch (NumberFormatException e) {
				e.printStackTrace();
				Java_Logger.getLog("Check your config file @ " + new File(path).getAbsolutePath());
				Assert.fail();
			}
		} catch (IOException e) {
			e.printStackTrace();
			Java_Logger.getLog("File Not Found");
		}
	}
	}
*/