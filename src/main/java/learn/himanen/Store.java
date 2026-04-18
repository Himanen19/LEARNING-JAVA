package learn.himanen;

public abstract class Store {


}

class Factorial {

    public static long factorial(int n) {

        long result = 0;
        for (int i = 0; i < n; i++) {
            result += n * (n - i);
        }
        return result;
    }
}
