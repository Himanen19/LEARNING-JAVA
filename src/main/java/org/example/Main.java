package org.example;

public class Main {
    public static void main(String[] args) {

        Printer hp = new Printer(true, 300);
        hp.printPages(31);

        System.out.println(hp);
        System.out.println(hp.getPagesPrinted());

    }


}


