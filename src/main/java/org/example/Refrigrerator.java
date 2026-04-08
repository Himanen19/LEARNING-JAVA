package org.example;

public class Refrigrerator {

    private boolean hasWorkToDo;

    private void orderFood() {

        if (hasWorkToDo) {
            System.out.print("Ordering foods: ... ");
        }


    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
