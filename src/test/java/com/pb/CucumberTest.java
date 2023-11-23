package com.pb;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.pb"},
        features = {"src/test/resources"},
        plugin = {"pretty", "json:reports/cucumber.json", "html:reports/test-result.html"}
)
public class CucumberTest {
}
