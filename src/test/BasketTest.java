package test;

import com.company.Basket;


import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @org.junit.jupiter.api.Test
    void addItemToBasket() {
        Basket basket = new Basket();
        basket.addItemToBasket("chleb", 1);
        assertTrue(basket.isInBasket("chleb", 1));
    }

    @org.junit.jupiter.api.Test
    void deleteFromBasket() {
        Basket basket = new Basket();
        basket.addItemToBasket("chleb", 1);
        basket.deleteFromBasket("chleb");
        assertFalse(basket.isInBasket("chleb", 1));
    }

    @org.junit.jupiter.api.Test
    void totalBasketCount() {
        Basket basket = new Basket();
        basket.addItemToBasket("chleb", 1);
        basket.addItemToBasket("sousages", 3);
        int expectSum  = 4;
        assertEquals(expectSum, basket.totalBasketCount());
    }


}