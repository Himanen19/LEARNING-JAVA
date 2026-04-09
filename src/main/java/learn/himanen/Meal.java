package learn.himanen;


public class Meal {

    private Fries fries;
    private Drinks drinks;
    private Burgers burger;
    private double totalPrice;


    public Meal() {
        this(new Burgers(20, "X-Bacon"), new Drinks(), new Fries());
    }

    public Meal(Burgers burger, Drinks drinks, Fries fries) {
        this.burger = burger;
        this.drinks = drinks;
        this.fries = fries;
    }

    public void orderMeal(String burgerType, boolean putMustard, boolean putCalabresa, boolean putBacon) {

        String burgerDetails = burger.makeBurger(burgerType, putMustard, putCalabresa, putBacon);


        totalPrice = fries.getPrice() + drinks.getPrice() + burger.getPrice();


        System.out.printf("You Ordered a " + fries.getSize() + " $" + fries.getPrice() + " fry with a " + drinks.getSize() + " $" + drinks.getPrice() + " size drink and a burger " + burgerDetails + " $" + burger.getPrice() + " the total price was " + totalPrice);


    }

}

class Fries {


    private String size;
    private double price;

    public Fries() {
        this("medium");
    }

    public Fries(String size) {
        setSize(size);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        if (size.equals("large")) {
            this.price = 20;
        } else if (size.equals("medium")) {
            this.price = 15;
        } else if (size.equals("small")) {
            this.price = 10;
        }
    }

    public double getPrice() {
        return price;
    }
}

class Drinks {


    private String size;
    private double price;

    public Drinks() {
        this("medium");
    }

    public Drinks(String size) {
        setSize(size);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        if (size.equals("large")) {
            this.price = 10;
        } else if (size.equals("medium")) {
            this.price = 8;
        } else if (size.equals("small")) {
            this.price = 5;
        }
    }

    public double getPrice() {
        return price;
    }
}

class Burgers {

    private String burgerType;
    private double price;
    private boolean putMustard;
    private boolean putCalabresa;
    private boolean putBacon;

    public Burgers(int price, String burgerType) {
        this.price = price;
        this.burgerType = burgerType;
    }

    public double getPrice() {
        return price;
    }

    public String makeBurger() {
        return String.format("Your burger is ready and is a %s and the total price is: $%.2f \n", burgerType, price);
    }

    public String makeBurger(String burgerType, boolean putMustard, boolean putCalabresa, boolean putBacon) {
        double totalBurgerPrice = this.price;
        totalBurgerPrice += putBacon ? 5 : 0;
        totalBurgerPrice += putMustard ? 2.5 : 0;
        totalBurgerPrice += putCalabresa ? 8 : 0;

        this.price = totalBurgerPrice;
        return String.format("a %s with " + (putMustard ? "Mustard " : "")
                + (putBacon ? "Bacon " : "") + " " + (putCalabresa ? "Calabresa " : "0") + " and the burger price is: ", burgerType);

    }


    public void deluxeBurger(boolean extraToppings1, boolean extraToppings2) {
        double deluxePrice = 100;
        deluxePrice += extraToppings2 ? 9.99 : 0;
        deluxePrice += extraToppings1 ? 7.34 : 0;
        System.out.printf("You ordered a deluxe burger with " + (extraToppings1 ? "Chedder " : "")
                + (extraToppings2 ? "Barbecue" : "") + " and the total price is: $%.2f\n", deluxePrice);
    }

}


