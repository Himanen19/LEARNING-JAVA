package learn.himanen;

public class Printer {

    private int tonerLevel;    // % of toner left
    private int pagesPrinted; // count of total pages printed
    private boolean duplex; // print on both sides or not

    public Printer(boolean duplex, int tonerLevel) {
        this.duplex = duplex;
        this.tonerLevel = tonerLevel < 0 || tonerLevel > 100 ? -1 : tonerLevel;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount < 100) {


            if (tonerLevel + tonerAmount < 0 || tonerLevel + tonerAmount > 100) {
                return -1;
            }
            tonerLevel += tonerAmount;
            return tonerLevel;
        }
        return tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = duplex ? (pages / 2) + (pages % 2) : pages;

        pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
