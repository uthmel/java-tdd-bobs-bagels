package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void testAddBagelToBasket(){
        Basket basket = new Basket();
        boolean result = basket.addBagel("Plain Bagel");
        Assertions.assertTrue(result);
    }

}
