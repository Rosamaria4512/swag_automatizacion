package com.co.swag.stepdefinitons;

import com.co.swag.tasks.CartProductTask;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;


public class ProductStepDefinition {
    @When("^the user select a product$")
    public void theUserSelectAProduct() {
        OnStage.theActorInTheSpotlight().attemptsTo(CartProductTask.cartProductTask());
    }

    @Then("^the user see his product in the cart$")
    public void theUserSeeHisProductInTheCart() {

    }


}
