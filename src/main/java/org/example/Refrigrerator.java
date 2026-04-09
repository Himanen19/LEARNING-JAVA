package org.example;

public class Refrigrerator {

    private boolean hasWorkToDo;

    protected void orderFood() {

        if (hasWorkToDo) {
            System.out.println("Ordering foods: ... ");
            hasWorkToDo = false;
        }


    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
