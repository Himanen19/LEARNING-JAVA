package org.example;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("tim", "11/11/1998", "01/01/200-");
        SalariedEmployee joe = new SalariedEmployee("joe", "12/12/2000", "10/05/2025", 70000);


        joe.collectPay();
    }

    public static void doFishStuff(Fish fish, String speed) {
        fish.makeNoise();
        fish.move(speed);
        fish.toString();

    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("-----");

    }

}


