package org.lesson.creational.builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .toppings("topping")
                .sauce("sauce")
                .cheese(true)
                .oregano(true)
                .size(12)
                .additionalTopping("chicken")
                .build();
    }
}
