package com.co.swag.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Product.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.swag.stepdefinitons",
        plugin = "pretty"
)
public class ProductRunner {
}
