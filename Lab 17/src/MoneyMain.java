
public class MoneyMain {

    static String[] dataSource = { "B5", "Q", "B20", "Q", "D", "N", "P" };
    // B5 represents 5 dollars and Q is quarters, D= dime, N = nickel, p = penny
    static Money[] wallet = new Money[dataSource.length]; 

    public static void main(String[] args) {
        /*
         * substring(beginningIndex): from the beginningIndex to the end: 
         *       "hello".substring(3) -s> return "lo"
         * 
         * substring(beginningIndex,endingIndex) inclusive, exclusive,
         *       "hello".substring(0,1)->"h" Bill amount
         * 
         * dataSource[i].substring(1, dataSource[i].length()) is the
         * same as dataSource[i].substring(1)
         */
        for (int i = 0; i < dataSource.length; i++) {
            char dataItem = dataSource[i].charAt(0);
            if (dataItem == 'B') {                
                int billValue = Integer.parseInt(dataSource[i].substring(1));
                wallet[i] = new Bill(billValue);
            } else {
                if (dataItem == 'Q')
                 wallet[i] = new Quarter();
                else if (dataItem == 'D')
                    wallet[i] = new Dime();
                else if (dataItem == 'N')
                    wallet[i] = new Nickel();
                else
                    wallet[i] = new Penny();
            }
        } 
        printWallet();
    }
    public static void printWallet() {
        for (int i = 0; i < wallet.length; i++) {
            /*
             * "IS-A" child class instanceof child class -> true 
             * if (wallet[i] instanceof Bill) 
             * --System.out.println("$ "+((Bill)wallet[i]).getValue()+".00"); 
             * else
             */

            System.out.println(wallet[i]); // calls toString method implicitly

        }
    }
}
