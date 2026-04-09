package learn.himanen;

public class Rectangle {


    private double length;
    private double width;

    public Rectangle(double width, double length) {

        this.length = length < 0 ? 0 : length;
        this.width = width < 0 ? 0 : width;
    }

    public double getWidth() {

        return this.width;
    }

    public double getLength() {
        return length;

    }

    public double getArea() {
        return width * length;
    }
}
