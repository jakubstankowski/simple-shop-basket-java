package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();

        int itemCount = 0;
        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to shop aplication, put how many items you want add to basket: ");
        itemCount = inputScanner.nextInt();
        for (int i = 0; i < itemCount; i++) {
            int itemNumber = i + 1;
            System.out.println("Put " + itemNumber + " element to basket, ITEM NAME and ITEM PRICE:");
            try {
                basket.addItemToBasket(inputScanner.next(), inputScanner.nextInt());
            } catch (Exception e) {
                System.out.println("Invalid type!" + e);
                exit = true;
            }
        }

        while (!exit) {
            System.out.println("What do you need? sum|add|list|delete|exit ");
            String input = keyboard.nextLine();
            switch (input) {
                case "add":
                    System.out.println("Add new item: ");
                    basket.addItemToBasket(inputScanner.next(), inputScanner.nextInt());
                    break;
                case "list":
                    basket.showBasket();
                    break;
                case "delete":
                    System.out.println("Which value yo want delete, put NAME:");
                    String deleteKey = inputScanner.next();
                    basket.deleteFromBasket(deleteKey);
                    System.out.println("Success delete, list: ");
                    basket.showBasket();
                    break;
                case "sum":
                    System.out.println("Total basket count is: " + basket.totalBasketCount() + "$");
                    break;
                case "exit":
                    System.out.println("Thanks for using my program! Standev 2019");
                    exit = true;
                    break;
                default:
                    exit = true;
            }

        }
        keyboard.close();

    }
}
