package com.test18;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/features/01.Login.feature",
        glue = "com.test18",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)

public class RunnerTest extends AbstractTestNGCucumberTests {
}
