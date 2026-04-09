package learn.himanen;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {

        System.out.println("the car is started" + description);
        this.runEngine();

    }

    public void drive() {

        System.out.println("You are driving on the highwaysss! with a : " + description + " and that's a: " + getClass().getSimpleName());
        runEngine();

    }

    protected void runEngine() {

        System.out.println("the engine is on fire!!!!");

    }

}


class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.cylinders = cylinders;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    @Override
    public void startEngine() {
        System.out.printf("this is a GAS car and have %d Cylinders that are ready \n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("this is a GAS car and makes %f KM per Litre on avg \n", avgKmPerLitre);
    }
}

class EletricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;
    public EletricCar(String description) {
        super(description);
    }


    public EletricCar(String description, int batterySize, double avgKmPerCharge) {
        super(description);
        this.batterySize = batterySize;
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public void topSpeed() {

        System.out.println("A eletric cars top speed is 200km/h and it makes a avg of " + avgKmPerCharge + " and have up to " + batterySize + " battery size.");
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;
    public HybridCar(String description) {
        super(description);
    }

}


class Car1 {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public String getMake() {

        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {

        System.out.println(" door: " + doors + " model: " + model + " color: " + color + " convertible: " + convertible);
    }


}

class Car3 {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car3(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "The engine is starting" + this.getClass().getSimpleName();
    }

    public String accelerate() {

        return "the Car is accelerating..." + this.getClass().getSimpleName();
    }

    public String brake() {

        return "the car is breaking" + this.getClass().getSimpleName();
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car3 {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The mitsubishi engine is starting" + this.getClass().getSimpleName();
    }

    @Override
    public String accelerate() {

        return "the mitsubishi is accelerating..." + this.getClass().getSimpleName();
    }

    @Override
    public String brake() {

        return "the mitsubishi is breaking" + this.getClass().getSimpleName();
    }

}

class Holden extends Car3 {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Holden engine is starting " + this.getClass().getSimpleName();
    }

    @Override
    public String accelerate() {

        return "the Holden is accelerating..." + this.getClass().getSimpleName();
    }

    @Override
    public String brake() {

        return "the Holden is breaking" + this.getClass().getSimpleName();
    }

}

class Ford extends Car3 {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "The Ford engine is starting" + this.getClass().getSimpleName();
    }

    @Override
    public String accelerate() {

        return "the Ford is accelerating..." + this.getClass().getSimpleName();
    }

    @Override
    public String brake() {

        return "the Ford is breaking" + this.getClass().getSimpleName();
    }

}
