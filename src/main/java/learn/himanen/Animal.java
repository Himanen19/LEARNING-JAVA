package learn.himanen;

public class Animal {

    private String type;
    private String size;
    private double weight;

    public Animal() {

    }

    public Animal(double weight, String size, String type) {
        this.weight = weight;
        this.size = size;
        this.type = type;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + "Animal.move at" + speed);
    }

    public void makeNoise() {
        System.out.println(type + " Animal make some Noise");
    }

}
