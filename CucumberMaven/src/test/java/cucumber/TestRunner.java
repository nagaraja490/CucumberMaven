package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"Feature/Second.feature"},
		monochrome=false,
		//format = {"pretty","json:target/target/cucumber-reports/scucumber.json"},//target/json/cucumber.json
		plugin = {"html:target/cucumber-reports-html","json:target/cucumber-reports-html/cucumber.json"},
		glue="stepDefinition")
public class TestRunner {

}
