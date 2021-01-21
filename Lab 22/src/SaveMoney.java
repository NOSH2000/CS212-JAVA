import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * run SaveMoney, then run ReadMoney
 */
public class SaveMoney {
    public static void main(String argv[]) throws Exception {
        FileOutputStream fos = new FileOutputStream("money.out"); //We save the object in money.out file we create here
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for(int i=0; i<10; i++){
            Quarter q = new Quarter();
            oos.writeObject(q);
            Bill b = new Bill(20);
            oos.writeObject(b);
            Nickel n = new Nickel();
            oos.writeObject(n);
            Dime d = new Dime();
            oos.writeObject(d);
            Penny p = new Penny();
            oos.writeObject(p);
        }
        oos.flush();
        oos.close();
        fos.close();
    }
}
