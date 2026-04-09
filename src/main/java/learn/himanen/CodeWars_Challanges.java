package learn.himanen;

import java.util.ArrayList;
import java.util.Arrays;

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


class ZywOo {
    public static boolean validateUsr(String s) {

        return s.matches("[a-z0-9_]{4,16}");
    }
}

class NoBoring {
    public static int noBoringZeros(int n) {
        String s = Integer.toString(n);
        s = s.replaceAll("0+", "");
        return Integer.parseInt(s);
    }


}

class Maps {
    public static int[] map(int[] arr) {

        return Arrays.stream(arr).map(item -> item * 2).toArray(); // java have 100 different methods depending on variable type xD
    }
}


class wolfi {

    public static String warnTheSheep(String[] array) {

        int wolfIndex = Arrays.asList(array).lastIndexOf("wolf");
        if (wolfIndex == array.length - 1) {
            return "Pls go away and stop eating my sheep";
        }
        return String.format("Oi! Sheep number %d! You are about to be eaten by a wolf!", array.length - 1 - wolfIndex);

    }

}

class Plural {
    public static boolean isPlural(float f) {
        if (f > 1) {
            return true;
        }

        return false;
    }
}

class Solution {
    public static String shortenToDate(String longDate) {
        return longDate.split(" ")[0];
    }
}


class Kata3 {
    public static String usdcny(int usd) {
        double yuan = usd * 6.75;
        return String.format("%.1f Chinese Yuan", yuan);
    }
}

public class Kata4 {

    public static String solution(String str) {

    }

}