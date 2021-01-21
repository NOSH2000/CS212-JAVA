
public class Money implements Comparable<Money> {

    private int dollars, cents;

    /**
     * Constructor makes a call to {@link #Money(int, int)} with (0,0) as
     * parameters
     */
    public Money() {
        this(0, 0);
    }

    public Money(int dollars, int cents) {
        // TODO Fill this in
        // Hint: Use integer division by 100 to get dollars from cents
        // and use modulus to get cent values between 0 and 100 (mod by 100)
        // Do not need to include this
        this.dollars = dollars + (cents / 100);
        this.cents = cents % 100;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // LAB 14
        Money m1 = new Money(), m2 = new Money(6, 5), m3 = new Money(6,5);

        System.out.println("m1.getDollars(): " + m1.getDollars());
        System.out.println("m1.getCents(): " + m1.getCents());
        System.out.println("m2.getDollars(): " + m2.getDollars());
        System.out.println("m2.getCents(): " + m2.getCents());
        
        /*
         *  
         *  Anything that prints out to the console is a string format
         *  System.out.println expects a string as an input
         *  So when we try to print m2, which is a money type, the program will look for a toString Method
         *  If there isn't one given by the class, it will automatically call the 
         *  toString method from the superclass Object.
         *  The toString method of Object is too generic. It will print out the hashcode of the memory address.
         *  
         *  A hashcode is an integer value that represents the state of the object upon which it was called. 
         *  That is why an Integer that is set to 1 will return a hashcode of "1" because an Integer's 
         *  hashcode and its value are the same thing. A character's hashcode is equal to it's ASCII character code.
         *  
         *  When we try to print m2, it implicitly calls the toString Method: m2.toString 
         */
        System.out.println(m2); 
        
        
        System.out.println("Compare m1 to m2: " + m1.compareTo(m2));
        System.out.println("Compare m2 to m3: " + m2.compareTo(m3));
        
        System.out.println("Is m1 equal to m2: " + m1.equals(m2));
        System.out.println("Is m2 equal to m3: " + m2.equals(m3));

        // LAB 15
        m1 = new Money(4, 87);
        m2 = new Money(5, 243);

        m1.add(m2);

        System.out.println(m1.toString()); // Explicitly calls the toString method

    }

    public void add(Money other) {
        // TODO Fill this in
        // Hint: Add the cents first, check if you surpass 100 (check hint from
        // 2-ar0g constructor),
        // then add dollars
        // LAB 15
        this.cents += other.cents;
        this.dollars += other.dollars + (cents / 100);
        this.cents %= 100;

    }

    @Override
    public int compareTo(Money other) {
        // TODO Fill this in
        /*
         * Steps: 
         * 1) Test the dollars in both first 
         * 2) If dollar values are equal, test cents in both 
         * 3) If both dollars and cents are equal return 0
         * 
         * Hint: compareTo can be viewed as a subtraction operation
         */
        if (this.dollars < other.dollars)
            return -1;
        else if (this.dollars > other.dollars)
            return 1;
        else { // this.dollars == other.dollars
            if (this.cents < other.cents)
                return -1;
            else if (this.cents > other.cents)
                return 1;
            else // same dollar and same cents
                return 0; 
        }

    }

    @Override
    public boolean equals(Object other) {
        /*
         * Class Object is the root of the class hierarchy. 
         * Every class has Object as a superclass. 
         * All objects, including arrays, implement the methods of this class.
         * 
         * Money is a subclass of Object
         */
        
        /*
         * TODO Fill this in
         * Steps: 
         * 1) Test if other is null 
         * 2) Test if other is of type Money 
         * 3)If the above tests pass, then cast other into type Money 
         * 4) Compare dollar and cents in both. If equal return true, otherwise return
         * false
         */
        // "this" is the current object
        if (this == other) 
            return true; // m1.equals(m2)
        //                   current Object class type
        if (other != null && this.getClass().equals(other.getClass())) {
            // Start from step 3
            /*
             * Object class does not have any fields called dollars or cents. 
             * As such, "other" does not also have any such fields.
             * That's why we have to cast Money type to dollars and cents of other 
             */
            if (this.dollars == ((Money) other).dollars && this.cents == ((Money) other).cents)
                return true;
            else
                return false;
        } else
            return false;
    }

    @Override
    public String toString() { // convert the object to string format
        String c;
        if (cents < 10) {
            c = "0" + cents;
        } else {
            c = "" + cents;
        }
        return "$" + dollars + "." + c;
    }

    public int getCents() {
        return cents;
    }

    public int getDollars() {
        return dollars;
    }

}
