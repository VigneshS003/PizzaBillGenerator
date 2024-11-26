package PizzaBillGenerato;

public class pizza {

    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;
    public pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300; 
            System.out.println("Veg pizza");
        } else {
            this.price = 400; 
            System.out.println("Non-Veg Pizza");
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese() {
        if (!isExtraCheeseAdded) { 
            isExtraCheeseAdded = true;
            this.price += extraCheesePrice;
        }
    }
    public void addExtraToppings() {
        if (!isExtraToppingsAdded) { 
            isExtraToppingsAdded = true;
            this.price += extraToppingsPrice;
        }
    } 
    public void takeAway() {
        if (!isOptedForTakeAway) { 
            isOptedForTakeAway = true;
            this.price += backPackPrice;
        }
    }  
    public void getBill() {
        String bill = "Base Pizza Price: " + basePizzaPrice + "\n";
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings Added: " + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take Away Charges: " + backPackPrice + "\n";
        }
        bill += "Total Bill: " + this.price + "\n";

        System.out.println(bill);
    }
}
