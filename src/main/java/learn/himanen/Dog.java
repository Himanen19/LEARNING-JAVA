package learn.himanen;

public class Dog extends Animal {
    public Dog() {
        super(80, "Big", "Hotdog");
    }


    public void move(String speed) {
        System.out.println("Dog moved");
        super.move(speed);
    }
}
