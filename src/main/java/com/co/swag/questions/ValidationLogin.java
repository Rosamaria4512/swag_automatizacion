package com.co.swag.questions;

import com.co.swag.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationLogin implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LoginPage.VERIFICATION_LOGIN_CORRECT).viewedBy(actor).asString();


    }

    public static ValidationLogin verifyLogin(){
        return new ValidationLogin();
    }
}
