package com.example.pizzabilling;

public class DeluxePizza extends Pizza {

    public DeluxePizza(boolean isVej){
        super(isVej);
        addExtraCheese();
        addExtraToppings();
        System.out.println(getBill());
    }
}
