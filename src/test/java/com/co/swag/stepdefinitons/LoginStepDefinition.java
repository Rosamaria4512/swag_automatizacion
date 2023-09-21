package com.co.swag.stepdefinitons;

import com.co.swag.models.DataLogin;
import com.co.swag.questions.ValidationLogin;
import com.co.swag.tasks.LoginTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepDefinition {

    @Managed
    WebDriver hisBroswer;

    @Before
    public void setUp()
    {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Rosa");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBroswer));
    }
    @Given("^he user enter the website$")
    public void heUserEnterTheWebsite() {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.saucedemo.com/"));

    }


    @When("^he user enter with credentials$")
    public void heUserEnterWithCredentials(List<DataLogin> dataLoginList) {
        DataLogin dataLogin;
        dataLogin=dataLoginList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.Login(dataLogin));


    }

    @Then("^he could succesfully$")
    public void heCouldSuccesfully() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationLogin.verifyLogin()
        , Matchers.is("Sauce Labs Backpack")));

        System.out.println("VALIDACION CORRECTA");

    }

}
