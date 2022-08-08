package co.com.testlulobank.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/co.com.testlulobank.features/readuser.feature",
        glue = "co.com.testlulobank.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class ReadUserRunner {
}
