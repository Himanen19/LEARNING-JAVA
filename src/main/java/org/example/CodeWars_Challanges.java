package org.example;

import java.util.ArrayList;

public class CodeWars_Challanges {
}

class AddLength {

    public static String[] addLength(String str) {

        String[] sArr = str.split(" ");

        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = sArr[i] + " " + sArr[i].length();
        }

//    return   stream(str.split(" ")).map(s ->  s + " " + s.length()).toArray(String[]::new); resultado com map estudar bem!
        return sArr;
    }

}

class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
        int positiveValue = 0;
        int negativeValue = 0;
        if (input == null || input.length == 0) {
            return new int[0]; // criar arrays é complicado em java xD
        }
        for (int i = 0; i < input.length; i++) {
//      java n aceita xD input[i] < 0 ? negativeValue += input[i] : positiveValue += input[i];
            if (input[i] < 0) {
                negativeValue += input[i];
            }
            if (input[i] > 0) {
                positiveValue++;
            }
        }
        return new int[]{positiveValue, negativeValue};
    }
}

class Multiples {
    public static int[] find(int base, int limit) {
        // your code here

//        return iterate(base, inde -> base * inde <= limit  );
        ArrayList<Integer> finalArr = new ArrayList<>();

        for (int i = 1; base * i <= limit; i++) {

            finalArr.add(base * i);

        }
        return finalArr.stream().mapToInt(x -> x).toArray();
    }
}