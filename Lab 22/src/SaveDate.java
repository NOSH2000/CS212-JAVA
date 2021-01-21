
import java.io.*; // Serializable
import java.util.Date;

public class SaveDate {

  public static void main(String argv[]) throws Exception {
    FileOutputStream fos = new FileOutputStream("date.out");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    Date date = new Date(); // By default it is today's date
    oos.writeObject(date);
    oos.flush();
    oos.close();
    fos.close();
  }
}