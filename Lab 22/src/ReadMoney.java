import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadMoney {
    public static void main(String argv[]) throws Exception {
        /*
         * money.out is the file we created in SaveMoney
         */
        FileInputStream fis = new FileInputStream("money.out");
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            while (true) {
                Money m = (Money) ois.readObject();
                System.out.println(m);
            }
        } catch (EOFException e) {

        }

        ois.close();
        fis.close();
    }
}
