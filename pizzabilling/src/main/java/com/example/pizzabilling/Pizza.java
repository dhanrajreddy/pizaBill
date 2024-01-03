package com.example.pizzabilling;

import java.net.StandardSocketOptions;
public class Pizza {
    private int price, takeAwayPrice, cheesePrice, toppingPrice,basePrice;
    private boolean  takeAway, cheese, topping,isBill;
    private String bill;


    public Pizza(boolean isVeg) {
        bill="";
        if (isVeg) {
            price = 300;
            basePrice=300;
            takeAwayPrice = 20;
            cheesePrice = 80;
            toppingPrice = 70;
        } else {
            price = 400;
            basePrice=400;
            takeAwayPrice = 20;
            cheesePrice = 80;
            toppingPrice = 120;
        }
    }


    public void addExtraCheese(){
        // your code goes here
        cheese= true;
    }
    public void addExtraToppings(){
        // your code goes here
        topping= true;
    }
    public void addTakeaway(){
        // your code goes here
        takeAway=true;
    }


    public String getBill() {
        if(!isBill){
            bill += "Base Price Of The Pizza: " + this.basePrice+ "\n";
            if (cheese)
                bill += "Extra Cheese Added: " + cheesePrice + "\n";
            if (topping)
                bill += "Extra Toppings Added: " + toppingPrice + "\n";

            if (takeAway)
                bill += "Paperbag Added: " + (takeAwayPrice) + "\n";
            bill += "Total Price: " +getPrice() +"\n";
            isBill=true;
            return bill;
        }
        return bill;
    }

    public int getPrice()  {
        int total=0;
        if(cheese)
            total+=cheesePrice;
        if(topping)
            total+=toppingPrice;
        if(takeAway)
            total+=takeAwayPrice;
        return price+total;
    }
}

