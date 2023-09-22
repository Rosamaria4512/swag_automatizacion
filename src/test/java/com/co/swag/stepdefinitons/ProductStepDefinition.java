package com.co.swag.stepdefinitons;

import com.co.swag.models.DataLogin;
import com.co.swag.questions.ValidationCartProduct;
import com.co.swag.tasks.CartProductAgregateTask;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;


public class ProductStepDefinition {
    @When("^the user select a product$")
    public void theUserSelectAProduct(List<DataLogin> dataLoginList) {
        DataLogin dataLogin;
        dataLogin=dataLoginList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(CartProductAgregateTask.cartProductTask(dataLogin));

    }

    @Then("^the user see his product in the cart$")
    public void theUserSeeHisProductInTheCart() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationCartProduct.validationCartProduct(),Matchers.equalTo(Boolean.TRUE)));
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    @When("^the user select a product for delete$")
    public void theUserSelectAProductForDelete() {


    }


    @Then("^the user will see that his product not is in the cart$")
    public void theUserWillSeeThatHisProductNotIsInTheCart() {

    }

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------


}
