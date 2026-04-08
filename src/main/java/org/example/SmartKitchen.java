package org.example;

public class SmartKitchen {
    Refrigrerator fridge = new Refrigrerator();
    DishWasher dishWasher = new DishWasher();
    CoffeMaker iceBox = new CoffeMaker();

    // constructors
    public SmartKitchen() {

    }

    public SmartKitchen(CoffeMaker iceBox, DishWasher dishWasher, Refrigrerator fridge) {
        this.iceBox = iceBox;
        this.dishWasher = dishWasher;
        this.fridge = fridge;
    }

    public void addWater() {
        System.out.print("Adding some water");
        iceBox.setHasWorkToDo(true);

    }

    public void pourMilk() {

        System.out.print("Pouring milk ");
        fridge.setHasWorkToDo(true);
    }

    public void loadDishWasher() {

        dishWasher.setHasWorkToDo(true);

    }

    public void setKitchenState(boolean gelada, boolean dishes, boolean coffee) {

        dishWasher.setHasWorkToDo(dishes);
        fridge.setHasWorkToDo(gelada);
        iceBox.setHasWorkToDo(coffee);


    }

    public void setFridge(Refrigrerator fridge) {
        this.fridge = fridge;
    }

    public void setDishWasher(DishWasher dishWasher) {
        this.dishWasher = dishWasher;
    }

    public void setIceBox(CoffeMaker iceBox) {
        this.iceBox = iceBox;
    }


}
