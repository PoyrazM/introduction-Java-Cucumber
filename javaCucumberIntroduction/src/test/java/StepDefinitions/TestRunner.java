package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/poyra/IdeaProjects/javaCucumberIntroduction/src/test/resources/Features",glue={"StepDefinitions"},
monochrome = true,
//plugin = {"pretty","html:target/HtmlReports"} --> This is report of the html format for test
//plugin = {"pretty","json:target/JSONReports/report.json"} // --> This is report of the JSON format for test
//plugin = {"pretty" ,"junit:target/JUnitReports/junit.xml"},// --> This is report of the JUnit for test

        plugin = {"pretty", "html:target/HTMLReports/report.html",
                            "json:target/JSONReports/report.json",
                            "junit:target/JUnitReports/junit.xml" }, // These are multi usages
        tags ="@smoketest")
public class TestRunner {
}

//If the json report looks bad, you can convert it to json format with the (CTRL+SHIFT+ALT+L) combination.(IntelliJ IDEA)
