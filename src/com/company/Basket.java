package com.company;

import java.util.*;
import java.util.stream.IntStream;

public class Basket {

    private Map<String, Integer> orderedItems = new HashMap<>();

    public void addItemToBasket(String name, int price) {
        orderedItems.put(name, price);
    }

    public void deleteFromBasket(String name) {
        orderedItems.remove(name);
    }


    public int totalBasketCount() {
        List<Integer> valueList = new ArrayList();

        for (Map.Entry<String, Integer> entry : this.orderedItems.entrySet()) {
            valueList.add(entry.getValue());
        }
        return valueList.stream()
                .reduce(0, (a, b) -> a + b);

    }


    void showBasket() {
        for (Map.Entry<String, Integer> entry : this.orderedItems.entrySet()) {
            System.out.println("Item: " + entry.getKey() + ", price: " + entry.getValue() + "$");
        }

    }

    public boolean isInBasket(String name, int price) {
        boolean isInBasket = false;
        if (this.orderedItems.containsKey(name) && this.orderedItems.containsValue(price)) {
            isInBasket = true;
        }
        return isInBasket;
    }


}
