package com.co.swag.tasks;

import com.co.swag.models.DataLogin;
import com.co.swag.userinterfaces.LoginPage;
import com.co.swag.userinterfaces.ProductInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CartDeleteProductTasks implements Task {
    DataLogin dataLogin;

    public CartDeleteProductTasks(DataLogin dataLogin) {
        this.dataLogin = dataLogin;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataLogin.getUser()).into(LoginPage.TXT_USER));
        actor.attemptsTo(Enter.theValue(dataLogin.getPassword()).into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
        actor.attemptsTo(Click.on(ProductInterface.ADD_CART));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(ProductInterface.A_CARRITO));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(ProductInterface.BTN_DELET_CART_PRODUCT));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static CartDeleteProductTasks cartDeleteProductTasks(){
        return Tasks.instrumented(CartDeleteProductTasks.class);
    }
}
