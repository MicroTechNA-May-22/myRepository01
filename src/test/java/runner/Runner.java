package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\features\\customer\\","src\\test\\resources\\features\\order\\"
		,"src\\test\\resources\\features\\employee\\"},
		glue = {"step_definitions"},
		tags = "@smoke",
		plugin = {"pretty", "html:target/cucumber-reports"}
)
public class Runner {

}


