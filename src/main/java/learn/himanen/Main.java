package learn.himanen;

import java.util.*;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Menu.m();

    }

    public static int[] distinct(int[] array) {
        return Arrays.stream(array).distinct().toArray();
    }

    public class Kata {

        public static int dutyFree(int normPrice, int discount, int hol) {
            return (hol * 100) / (normPrice * discount);
        }

    }

    public class WideMouthedFrog {
        public static String mouthSize(String animal) {
            // your code here

            return animal.toLowerCase().equals("alligator") ? "small" : "wide";
        }
    }

    public class Kat3a {
        public static int sequenceSum(int start, int end, int step) {
            int num = 0;
            if (start > end) return 0;
            for (int i = start; i <= end; i += step) {
                num += i;
            }
            return num;
        }
    }

    public class ZywOo {

        public static String warnTheSheep(String[] array) {
            int wolfId = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals("wolf")) {
                    wolfId = i;
                }
            }
            return wolfId == array.length - 1 ? "Pls go away and stop eating my sheep" : String.format("Oi! Sheep number %d! You are about to be eaten by a wolf!", (array.length - 1) - wolfId);
        }

    }

    public class NoBoring {
        public static int noBoringZeros(int n) {

            if (n == 0) {
                return 0;
            }
            if (n % 10 == 0) {
                n = n / 10;
            }
            return n;
        }
    }

    public class Solution {
        public static String shortenToDate(String longDate) {
            //Put your code here ^_^
            String[] c = longDate.split(",");

            return c[0];
        }
    }

    public class Menu {
        public static void m() {

            System.out.println("type 0 to shutdown 1, to add itens 2 to remove itens");
            ArrayList<String> lista = new ArrayList<>();
            boolean active = true;
            while (active) {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    scanner.nextLine();
                    System.out.println("Digite os itens separados por vírgula:");
                    String text = scanner.nextLine();

                    lista.addAll(List.of(text.split(",")));
                    System.out.println("Itens adicionados!");

                } else if (choice == 2) {
                    scanner.nextLine();
                    System.out.println("Digite os itens separados por vírgula:");
                    lista.removeAll(List.of(scanner.nextLine().split(",")));
                    System.out.println("Itens removidos!");
                } else if (choice == 3) {
                    System.out.println(lista.toString());
                } else {
                    active = false;
                }
            }
        }
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public class Maps {
        public static int[] map(int[] arr) {
//             ArrayList<Integer> lista = new ArrayList();
//            for (int i = 0; i < arr.length; i++) {
//               lista.add(arr[i]);
//            }
//            return  lista.stream().toArray(int);
            return Arrays.stream(arr).map(n -> n * 2).toArray();
        }
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




