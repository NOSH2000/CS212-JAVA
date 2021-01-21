
//Money is the super (Parent) class
public class Bill extends Money {
    private int dollars;

    public Bill(int d) {
        // super(); it is called implicitly. We do not have to explicitly call
        // it.
        if (d != 1 && d!=5 && d != 10 && d != 20 && d != 100)
            throw new IllegalBillException("Bill amount is not right: " + d);
        dollars = d;
    }

    public int getValue() {
        return dollars;
    }

    public String toString() {
        return "$" + getValue() + ".00";
    }
}
