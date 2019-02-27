package com;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.junit.Courgette;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Courgette.class)
@CourgetteOptions(
        threads = 3,
        runLevel = CourgetteRunLevel.SCENARIO,
        reportTargetDir = "build",
        showTestOutput = true,
        cucumberOptions = @CucumberOptions(
                features = "src/test/java/com/features",
                glue = "com.steps"
        ))
public class CR {
}