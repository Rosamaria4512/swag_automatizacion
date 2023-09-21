package com.co.swag.tasks;

import com.co.swag.models.DataLogin;
import com.co.swag.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTask implements Task {

    DataLogin dataLogin;

    // constructor para poder unir la data de modelo login con las tareas e instaciar en los stepdefiniton
    public LoginTask(DataLogin dataLogin) {
        this.dataLogin = dataLogin;
    }

    //damos actividad al actor con cada localizador correspodiente instanciando desde la clase LoginPage
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataLogin.getUser()).into(LoginPage.TXT_USER));
        actor.attemptsTo(Enter.theValue(dataLogin.getPassword()).into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));

        System.out.println("Datos: "+ dataLogin.getUser());
    }


    //metodo para poder instanciar la clase logintask en los stepdefinion
    public static LoginTask Login(DataLogin dataLogin)
    {
        return Tasks.instrumented(LoginTask.class, dataLogin);
    }
}
