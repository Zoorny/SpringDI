package com.lookupPizza;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("pizza-spring-config.xml");

            PizzaShop pizzaShop = (PizzaShop) context.getBean("pizzaShop");
            Pizza firstPizza = pizzaShop.makePizza();
            System.out.println("First Pizza: " + firstPizza);

            Pizza secondPizza = pizzaShop.makePizza();
            System.out.println("Second Pizza: " + secondPizza);

            Pizza veggiePizza = pizzaShop.makeVeggiePizza();
            System.out.println("Veggie Pizza: " + veggiePizza);
    }
}
