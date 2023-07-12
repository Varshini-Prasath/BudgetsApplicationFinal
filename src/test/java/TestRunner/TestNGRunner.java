package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/java/Features",
		glue = "StepDefinition",
		stepNotifications = true,
		//tags = ("@CheckCategory and @CreatCat"),
		monochrome = true)
public class TestNGRunner {

}
