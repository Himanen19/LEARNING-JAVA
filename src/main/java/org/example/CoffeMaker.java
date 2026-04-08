package org.example;

public class CoffeMaker {

    private boolean hasWorkToDo;


    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    private void brewCoffe() {

        if (hasWorkToDo) {
            System.out.print("the coffee is on the table...");
        }


    }
}
