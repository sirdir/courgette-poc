package com;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
@CucumberOptions(
        features = {"src/test/java/com/features/"}
        , glue = {"com.steps"}
)
public class CR extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                System.out.println("********");
                return super.scenarios();
        }
}