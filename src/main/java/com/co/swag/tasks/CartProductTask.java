package com.co.swag.tasks;

import com.co.swag.userinterfaces.ProductInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CartProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ProductInterface.ADD_CART));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(ProductInterface.A_CARRITO));  try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();;

    }
    public static CartProductTask cartProductTask(){
        return Tasks.instrumented(CartProductTask.class);
    }
}
