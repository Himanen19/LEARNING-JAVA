package org.example;

public class DishWasher {

    private boolean hasWorkToDo;

    public void doDishes() {
        System.out.println(hasWorkToDo);
        if (hasWorkToDo) {
            System.out.print("Cleaning the dishes...");
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
