import java.io.File;
import javax.swing.*;

public class ListLargestFile {
    static File largestFile;
    static long largestLength = 0;
    
    //in java, it is not allowed to have any static local variable
    public static void main(String[] args) {
        JFileChooser fd = new JFileChooser(); 
        
        // mode - the type of files to be displayed:
        // * JFileChooser.FILES_ONLY
        // * JFileChooser.DIRECTORIES_ONLY
        // * JFileChooser.FILES_AND_DIRECTORIES
        fd.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fd.showOpenDialog(null);
        File f = fd.getSelectedFile();
        listFiles(f, "");
        System.out.println("The largest file: " + largestFile.getName() + ", and its length is " + largestLength);
    }

    // recursive method
    public static void listFiles(File f, String indent) {
        // f.listFiles() is different from our method. f.listFiles() belongs to file
        File files[] = f.listFiles(); // list all the files in the current directory
        for (int i = 0; i < files.length; i++) {
            File f2 = files[i];
            if(f2.length()> largestLength){
                largestFile = f2;
                largestLength = f2.length();
            }
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
