package learn.himanen;

public class Point {


    private int x;
    private int y;

    //constructors
    public Point() {


    } //constructors

    public Point(int x, int y) {
        this.y = y;
        this.x = x;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
//     d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        double thisPointX = 0;
        double thisPointY = 0;
        double result = Math.sqrt(Math.pow(thisPointX - this.x, 2) + Math.pow(thisPointY - this.y, 2));
        return Math.abs(result);
    }

    public double distance(Point newPoint) {

        double result = Math.sqrt(Math.pow(newPoint.x - this.x, 2) + Math.pow(newPoint.y - this.y, 2));
        return Math.abs(result);

    }

    public double distance(int pointx, int pointy) {
        double result = Math.sqrt(Math.pow(pointx - this.x, 2) + Math.pow(pointy - this.y, 2));
        System.out.println(result);
        return Math.abs(result);
    }

}
