package com.co.swag.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static Target TXT_USER = Target.the("campo Pára escribir el usuario")
            .locatedBy("//*[@id='user-name']");
    public static Target TXT_PASSWORD = Target.the("campo pára escribir ela contrasena")
            .locatedBy("//*[@id='password']");
    public static Target BTN_LOGIN = Target.the("click en el boton login para ingresar")
            .locatedBy("//*[@id='login-button']");
    public static Target VERIFICATION_LOGIN_CORRECT = Target.the("validar si fue correcto el inicio de sesion")
            .locatedBy("//div[text()='Sauce Labs Backpack']");



}
