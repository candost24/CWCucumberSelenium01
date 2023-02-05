package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/07_Hooks.feature"},
        glue = {"stepdefinitions", "src/test/hooks"},
        plugin = {"html:target/cucumber-reports.html", "json:target/cucumber-json.json", "junit:target/cucumber-xml.xml", "pretty"},
        monochrome = true
)
public class ReportRunner {

}




