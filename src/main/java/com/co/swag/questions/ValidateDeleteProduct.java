package com.co.swag.questions;

import com.co.swag.userinterfaces.ProductInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ValidateDeleteProduct implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(ProductInterface.CONTENEDOR_PRODUCTOS).viewedBy(actor).asBoolean();
    }
    public static ValidateDeleteProduct validateDeleteProduct(){
        return new ValidateDeleteProduct();
    }
}
