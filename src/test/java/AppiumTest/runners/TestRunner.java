package AppiumTest.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(


        plugin={"html:target\\Pcucumber-reportsapi.html",
                "json:target/json-reports/Pcucumber1.json",
                "junit:target/xml-report/Pcucumber1.xml"},
        features = "src/test/resources/features",
        glue = "AppiumTest/stepdefinitions",
        tags = "@wifi",
        dryRun = false
)
public class TestRunner {
}
