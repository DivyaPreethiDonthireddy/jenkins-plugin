package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/OrangeHRM.feature",
        glue = {"stepdefinitions"},
        format = {"pretty:target/cucumber-pretty.txt",
                "html:target/cuucmber-html-report",
                "json:target/cucumber.json",
                "usage:target/cucumber-usage.json",
                "junit:target/cucumber-results.xml"}
)
public class CucumberTestRunnerNew {

}
