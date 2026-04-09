package learn.himanen;

public class Fish extends Animal {

    private int gills;
    private int fins;

    public Fish() {

    }

    public Fish(double weight, String size, String type, int fins, int gills) {
        super(weight, "small", type);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscles() {

        System.out.println("Moving muscles");
    }

    private void moveBackFin() {
        System.out.println("Moving back fin very fast");

    }

    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast") {
            moveBackFin();
        }
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
