package learn.himanen;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double heigh) {
        super(radius);
        this.height = heigh < 0 ? 0 : heigh;


    }

    public double getHeight() {

        return height;
    }

    public double getVolume() {

        return super.getArea() * height;
    }

}
