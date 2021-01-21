import java.math.BigDecimal;

public class Wallet {
    private MoneyList walletContents = new MoneyList();

    public Wallet() {

    }

    public void addToWallet(Money m) {
        /*
         * since append method is not static, we cannot use the class name to
         * call it. We have to use the object name walletContents.
         */
        walletContents.append(m);
    }

    public void print() {
        System.out.println(walletContents.toString());
    }

    /**
     * @return the sum of the Linked list
     */
    public String getValue() {
        BigDecimal b = new BigDecimal(walletContents.sum()).setScale(2,BigDecimal.ROUND_HALF_UP);
        return "" + b;

    }
}
