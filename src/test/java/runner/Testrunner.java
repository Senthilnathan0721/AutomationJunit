package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "com.stepDefinitions", plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty"},
        tags = "@Regression",monochrome=true)
//plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class Testrunner {
}
