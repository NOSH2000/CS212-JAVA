import java.io.File;
import javax.swing.*;

public class ListFiles {

    public static void main(String[] args) {
        /*
         * if you put "./" inside that parameter then run it it'll load up that
         * directory at your current file
         * 
         * ./ represents current directory
         * 
         * if you just have an empty parameter, it will open home directory for
         * MAC and documents for windows
         */
        JFileChooser fd = new JFileChooser(); 

        // mode - the type of files to be displayed:
        // * JFileChooser.FILES_ONLY
        // * JFileChooser.DIRECTORIES_ONLY
        // * JFileChooser.FILES_AND_DIRECTORIES
        fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fd.showOpenDialog(null);
        File f = fd.getSelectedFile();
        listFiles(f, "");

    }

    // recursive method
    public static void listFiles(File f, String indent) {
        // f.listFiles() is different from our method. f.listFiles() belongs to
        // file
        File files[] = f.listFiles(); // list all the files in the current
                                      // directory
        for (int i = 0; i < files.length; i++) {
            File f2 = files[i];
            System.out.print(indent + f2.getName());
            System.out.print("...");
            System.out.print(f2.lastModified());
            System.out.print("...");
            System.out.print(f2.length());
            System.out.println();
            if (f2.isDirectory())
                listFiles(f2, indent + "   ");
        }
    }
}
