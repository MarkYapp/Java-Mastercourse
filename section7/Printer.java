package section7;

public class Printer {
    private double tonerLevel = 100;
    private int numPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numPagesPrinted = 0;
        this.duplex = duplex;
    }

    public void fillToner(int toner) {
        if (toner + this.tonerLevel > 100) {
            System.out.println("Toner full. Leftover toner = " + (toner - (100 - this.tonerLevel)));
            this.tonerLevel = 100;
        } else {
            this.tonerLevel += toner;
        }
    }

    public void print(int pages) {
        this.numPagesPrinted += this.duplex ? pages / 2 + pages % 2 : pages;
        this.tonerLevel -= (double) pages / 100;
        System.out.println("Number of pages printed = " + this.numPagesPrinted);
    }

    public double getToner() {
        System.out.println("Toner level = " + this.tonerLevel);
        return tonerLevel;
    }
}
