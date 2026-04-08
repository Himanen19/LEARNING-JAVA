package org.example;

public class Main {
    public static void main(String[] args) {
//        CoffeMaker coffeMaker = new CoffeMaker();
//        Refrigrerator fridge = new Refrigrerator();
//        DishWasher dish = new DishWasher();
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.loadDishWasher();
        kitchen.dishWasher.doDishes();

    }


}


