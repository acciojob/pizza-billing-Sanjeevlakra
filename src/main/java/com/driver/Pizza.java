package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingPrice;
    private int takeAway;
    private boolean addExtraCheese;
    private boolean addExtraToppings;
    private boolean addtakeAway;
    private boolean isBillGeneration;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
       this.cheesePrice=80;
       this.takeAway=20;

        if(isVeg==true){
            this.price=300;
            this.toppingPrice=70;
        }

        else {
            this.price=400;
            this.toppingPrice=120;
        }

        this.addExtraCheese=false;
        this.addExtraToppings=false;
        this.addtakeAway=false;
        this.isBillGeneration=false;
        this.bill="Base Price of the Pizza: " +this.price+"\n";

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(addExtraCheese==false){
            this.price+=this.cheesePrice;
            addExtraCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(addExtraToppings==false){
            this.price+=this.toppingPrice;
            addExtraToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(addtakeAway==false){
            this.price+=this.takeAway;
            addtakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGeneration==false){
            if(addExtraCheese==true){
                this.bill+="Extra Cheese Added: " +this.cheesePrice+ "\n";
            }
            if(addExtraToppings==true){
                this.bill+="Extra Toppings Added: " +this.toppingPrice+ "\n";
            }
            if(addtakeAway==true){
                this.bill+="PaperBag Added: " +this.takeAway+ "\n";
            }
            this.bill+="Total Price: " +this.price+ "\n";
            isBillGeneration=true;
        }

        return this.bill;
    }
}
