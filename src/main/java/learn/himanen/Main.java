package learn.himanen;

public class Main {
    public static void main(String[] args) {


        CreateArrayListWithUserInput.askUser();
    }


    public static int[] randomGen(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            int randomN = (int) (Math.random() * 10000);

            arr[i] = randomN;
        }
        return arr;
    }


}




