package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features ="src/test/java/features"
,glue= {"seleniumgluecode"}
,tags= {"@Testing"}
,monochrome = true
,plugin = {"pretty", "html:target/cucumber-html-report"}
//,plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}

)

public class testrunner {

}
