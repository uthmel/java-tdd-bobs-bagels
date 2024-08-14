package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class BasketTest {



    @Test
    public void testAddBagelToBasketIfNotFull(){
        Basket basket = new Basket(10);
        boolean result = basket.addBagel("Plain Bagel");
        Assertions.assertTrue(result);
    }

    @Test
    public void testAddBagelToBasketIfFull(){
        Basket basket = new Basket(15);
        boolean result = basket.addBagel("Plain Bagel");
        Assertions.assertTrue(result);
    }

    @Test
    public void testRemoveBagelFromBasket() {


    }

    @Test
    public void testShouldNotAddDuplicateBagel() {
        Basket basket = new Basket();
        basket.addBagel("Plain Bagel");
        boolean result = basket.addBagel("Plain Bagel");
        Assertions.assertFalse(result);
    }

}
