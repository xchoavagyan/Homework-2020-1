package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/*
        1 Design a class Product
            properties
                - title
                - price
                - rating

        Create 10 product objects in main,
        give them titles,
        random prices in range (50$ - 100&),
        and random ratings in range (0 - 10) and store them in an array;
        get the best rated product from array and display the title.
	 */

        Product product1 = new Product("Fire TV Stick");
        Product product2 = new Product("Echo Dot");
        Product product3 = new Product("Kindle Paperwhite");
        Product product4 = new Product("Wyze Cam");
        Product product5 = new Product("TP-Link AC1750");
        Product product6 = new Product("Fire 7 Tablet");
        Product product7 = new Product("Acer SB220Q");
        Product product8 = new Product("Gimars Travel Adapter");
        Product product9 = new Product("Digital Alarm Clock");
        Product product10 = new Product("RUNMUS Gaming Headset");

        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);

        int maxRating = products.get(0).getRating();
        for (int i = 0; i < products.size(); i++) {
            if (maxRating <= products.get(i).getRating()) {
                maxRating = products.get(i).getRating();
            }
        }
        System.out.println("The Best Rated Product(s) :");
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getRating() == maxRating) {
                System.out.println((i + 1) + " : " + products.get(i).getTitle() + " : " + products.get(i).getPrice() + "$");
            }
        }
    }
}
