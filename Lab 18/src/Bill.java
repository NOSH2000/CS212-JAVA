
//Money is the super (Parent) class
public class Bill extends Money {
    private int dollars;

    public Bill(int d) {
        // super(); it is called implicitly. We do not have to explicitly call
        // it.
        dollars = d;
    }

    public int getValue() {
        return dollars;
    }

    public String toString() {
        return "$" + getValue() + ".00";
    }
}
