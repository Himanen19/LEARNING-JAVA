package learn.himanen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CreateArrayListWithUserInput {


    public static void askUser() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> theList = new ArrayList<>();
        boolean flag = true;
        while (flag) {

            String userInput;
            System.out.println("0 to exit\n 1 to add\n 2 to remove\n");
            try {
                int userCommand = scanner.nextInt();
                if (userCommand == 0) {
                    System.out.println("System is shuting down");
                    flag = false;

                } else if (userCommand == 1) {
                    scanner.nextLine();
                    System.out.println("Type the itens to add");
                    userInput = scanner.nextLine();
                    if (theList.contains(userInput)) {
                        System.out.println("Duplicated itens not allowed");
                    } else {
                        theList.add(userInput);
                        theList.sort(Comparator.naturalOrder());
                        System.out.println(theList.toString());
                    }
                } else if (userCommand == 2) {
                    System.out.println("Type the itens to remove");
                    scanner.nextLine();
                    userInput = scanner.nextLine();
                    theList.remove(userInput);
                    theList.sort(Comparator.naturalOrder());
                    System.out.println(theList.toString());
                } else {
                    System.out.println("Command not allowed!!!!!");
                }
            } catch (Exception e) {
                System.out.println("Type a fucking number mate");
                break;
            }
        }
    }
}
