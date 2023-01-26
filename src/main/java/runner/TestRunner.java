package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Testing 2022\\BDDIntroduction\\src" +
        "\\main\\resources\\Features\\userlogin.feature",
glue ={"stepdefinition"},
monochrome = false,
plugin={
"pretty",
"junit:junit_xml/cucumber.xml",
        "html:test-out/cucumber.html"
},
        dryRun = false,
tags="@regression"
)

public class TestRunner {




}
