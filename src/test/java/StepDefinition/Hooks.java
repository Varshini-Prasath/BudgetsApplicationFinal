package StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Utilities.PropertyFileAccess;
import Utilities.TestContainer;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public TestContainer tc;
	public Hooks(TestContainer tconter) {
		this.tc = tconter;
	}
	
	@Before(order=2)
	public void landingToWebPage() throws IOException {
		tc.driver.get(PropertyFileAccess.prop().getProperty("url"));
	}
	@Before(order=1)
	public void setOut() {
		System.out.println("Testing order 1");
	}
	
	@After()
	public void tearDown() throws IOException {
		
		File screenShot = ((TakesScreenshot)tc.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File("C:\\Users\\suren\\eclipse-workspace\\BudgetsQA2\\target\\ScreenShot.png"));
		tc.driver.close();
	}

}
