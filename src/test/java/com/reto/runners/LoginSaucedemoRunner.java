package com.reto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login_saucedemo.feature",
        glue = "com.reto.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginSaucedemoRunner {
}
