package stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;

import org.openqa.selenium.firefox.FirefoxProfile;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

//http://www.seleniumframework.com/cucumber-jvm-first-project/
public class stepDefinition {
	WebDriver webdriver;
	@Before
	public void selectBrowser(Scenario scenario)
	{
		System.out.println("Scenario Name"+scenario.getName());
		//scenario.embed(screenshot, "image/png");
		
		
	}
	@Given("^User is on Google Home Page$")
	public void verifyGooglePage() throws Throwable
	{
		//DesideCapabilities
		final FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setPreference("xpinstall.signatures.required", false);
		//driver = new FirefoxDriver(firefoxProfile);
		System.out.println("Hello Maven");
		webdriver=new FirefoxDriver(firefoxProfile);
		webdriver.get("https://www.google.com");
		//webdriver.navigate().to("https://www.google.com");		
	}
	
	@After
	public void tearDown(Scenario scenario) throws Exception
	{
		/*System.out.println("Results generating");
		CucumberResultsOverview results = new CucumberResultsOverview();
		results.setOutputDirectory("target");
		results.setOutputName("cucumber-results");
		results.setSourceFile("./src/test/resources/cucumber.json");
		results.executeFeaturesOverviewReport();	
		System.out.println("======Results Completed======");	*/
		try {
			scenario.write("Current Page URL is " + webdriver.getCurrentUrl());
			byte[] screenshot = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			} 
			catch (WebDriverException somePlatformsDontSupportScreenshots) {
			System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			} 
		webdriver.close();
	}
	

}
