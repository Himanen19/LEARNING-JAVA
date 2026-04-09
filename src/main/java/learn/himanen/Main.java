package learn.himanen;

public class Main {
    public static void main(String[] args) {

//        Burgers myBurger = new Burgers(100, "Chedder supreme");
//        Drinks coca = new Drinks();
//        Fries fry = new Fries();
//        Meal myMeal = new Meal();
//        myMeal.orderMeal("x-supreme", true, true, true);
////       myBurger.makeBurger("Chedder Supreme", true, true, false);
//
////       myBurger.deluxeBurger(true, true);


        Item coke = new Item(2, "drink", "Coca-Cola");
        coke.setSize("small");

        coke.printItem();

    }

}


