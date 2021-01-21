
public class Quarter extends Coin {
      public Quarter () {
          // Since we already created a constructor in the Coin class,
          // Coin class no longer has a default constructor.
          // Thus, we need to to explicitly call the Coin constructor
         super (25); // 25 cents
      }
}
