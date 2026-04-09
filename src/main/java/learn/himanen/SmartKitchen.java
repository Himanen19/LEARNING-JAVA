package learn.himanen;

public class SmartKitchen {
    private Refrigrerator fridge;
    private DishWasher dishWasher;
    private CoffeMaker iceBox;
    // constructors
    public SmartKitchen() {
        fridge = new Refrigrerator();
        dishWasher = new DishWasher();
        iceBox = new CoffeMaker();
    }

    //

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

    public void doKitchenWork() {

        iceBox.brewCoffe();
        fridge.orderFood();
        dishWasher.doDishes();
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

    public Refrigrerator getFridge() {
        return fridge;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeMaker getIceBox() {
        return iceBox;
    }
}


class CoffeMaker {

    private boolean hasWorkToDo;


    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    protected void brewCoffe() {

        if (hasWorkToDo) {
            System.out.println("the coffee is on the table...");
            hasWorkToDo = false;
        }


    }
}