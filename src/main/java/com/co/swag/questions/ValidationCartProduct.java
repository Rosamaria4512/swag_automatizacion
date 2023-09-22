package com.co.swag.questions;

import com.co.swag.userinterfaces.ProductInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidationCartProduct implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return ProductInterface.TXT_VERIFICATION_TO_CART.resolveFor(actor).getText().contains("Your Cart");

    }

    public static ValidationCartProduct validationCartProduct(){
        return new ValidationCartProduct();
    }

}
