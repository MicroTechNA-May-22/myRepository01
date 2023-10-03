package step_definitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import base.Base;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.ExcelReader;

public class Hooks extends Base{
	
	@Before
	public void setup() throws IOException, InvalidFormatException, MalformedURLException {
		
		config = new Properties();
		fis = new FileInputStream( System.getProperty("user.dir") + "\\src\\test\\resources\\cofig\\config.properties");
		config.load(fis);

		excelReader = new ExcelReader();
		testData = excelReader.getData(System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\loginData.xlsx", "loginTestData");
		
		switch (config.getProperty("browser")) {
		case "chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
			driver = new RemoteWebDriver(new URL("http://3.145.197.131:4444"),chromeOptions);
			break;
		case "firefox":
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			driver = new RemoteWebDriver(new URL("http://3.145.197.131:4444"),firefoxOptions);
			break;
		case "edge":

			EdgeOptions edgeOptions = new EdgeOptions();
			driver = new RemoteWebDriver(new URL("http://3.145.197.131:4444"),edgeOptions);
			break;
		}
		
		host = config.getProperty("env");
		
		int seconds = Integer.parseInt(config.getProperty("implisitWait"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		System.out.println("before run");
	}
	
	@After
	public void tearDown(Scenario scenario) throws IOException {
		System.out.println("after run");
		
		try {
			String screenshotName= scenario.getName().replace("", "");
			if(scenario.isFailed()) {
				scenario.log("this is my failure message");
				TakesScreenshot ts = (TakesScreenshot)driver;
				byte[]screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotName);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		fis.close();
		if (driver != null){
			driver.quit();
		}

	}
}
