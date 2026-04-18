package learn.himanen;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(factorial(5));
//       long n= 6;
//        long result = n;
//        for (int i = 1; i < n; i++) {
//            result *=  (n - i);
//        }
//        System.out.println(result);

    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int[] distinct(int[] array) {
        // your solution here

        return null;
    }


    public static void addPlace(LinkedList<Place> list, Place place) {

        scanner.nextLine();
        System.out.println("Type the itens to add separated by ,");
        String[] itensToAdd = scanner.nextLine().split(",");
        for (int i = 0; i < itensToAdd.length; i++) {

            if (list.contains(place)) {
                System.out.println("Duplicated entry");
                return;
            }
            list.add(place);
        }

    }

    record Place(String name, int distance) {
    }


//    public static int[] randomGen(int length) {
//        int[] arr = new int[length];
//        for (int i = 0; i < arr.length; i++) {
//            int randomN = (int) (Math.random() * 10000);
//
//            arr[i] = randomN;
//        }
//        return arr;
//    }




}




