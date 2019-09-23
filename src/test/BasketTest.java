package test;

import com.company.Basket;
import org.junit.jupiter.api.DisplayName;


import static org.junit.jupiter.api.Assertions.*;

class BasketTest {


    private final Basket basket = new Basket();


    @org.junit.jupiter.api.Test
    @DisplayName("test add item to basket")
    void addItemToBasket() {
        basket.addItemToBasket("chleb", 1);
        assertTrue(basket.isInBasket("chleb", 1));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("test delete item to basket")
    void deleteFromBasket() {
        basket.addItemToBasket("chleb", 1);
        basket.deleteFromBasket("chleb");
        assertFalse(basket.isInBasket("chleb", 1));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("test total basket count")
    void totalBasketCount() {
        basket.addItemToBasket("chleb", 1);
        basket.addItemToBasket("sousages", 3);
        int expectSum  = 4;
        assertEquals(expectSum, basket.totalBasketCount());
    }


}