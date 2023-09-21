package com.co.swag.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductInterface {

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static Target ADD_CART=Target.the("añadir al carrito").locatedBy("//button[@id='add-to-cart-sauce-labs-backpack']");
    public static Target SEE_PRODUCT=Target.the("ver producto").locatedBy("//a[@id='item_4_title_link']");
    public static Target A_CARRITO=Target.the("ir al carrito").locatedBy("//a[@class='shopping_cart_link']");
    public static Target BTN_DELET_CART=Target.the("borrar producto del carrito").locatedBy("(//button[@class='btn btn_secondary btn_small cart_button'])[1]");
    public static Target BTN_SIGTE_MODULE=Target.the("borrar producto del carrito").locatedBy("//button[@id='checkout']");
    public static Target TXT_VERIFICATION_TO_CART=Target.the("verificar carrito modulo").locatedBy("//span[text()='Your Cart']");
    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static Target TXT_FACTURATION_NAME=Target.the("Escribir nombre").locatedBy("//input[@name='firstName']");
    public static Target TXT_FACTURATION_LAST_NAME=Target.the("Escribir apellidos").locatedBy("//input[@name='lastName']");
    public static Target TXT_SIGTE_MODULE_ZIP_CODE=Target.the("Escribir Direccion").locatedBy("//input[@name='postalCode']");
    public static Target BTN_SIGTE_MODULE_ZIP_CODE=Target.the("Boton siguiente").locatedBy("//input[@name='continue']");
    public static Target TXT_VERIFICATION_FACTURATION=Target.the("Boton siguiente").locatedBy("//span[text()='Checkout: Your Information']");

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static Target BTN_FINAL_BUY=Target.the("Finalizar compra").locatedBy("//button[@name='finish']");
    public static Target TXT_VERIDFICACION=Target.the("Verificar compra").locatedBy("//button[@id='checkout']");

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


}
