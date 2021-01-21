import java.util.ArrayList;

/**
 * @author Nowshin Sayara
 * @lab:CS212-11B
 * 
 * @description Add a file menu to your WordGUI with options to open any file
 *              for reading and displaying in the unsorted, sorted, and erroneous columns), and one
 *              to Quit the program.
 * @since 11-17-2020
 * @version 1.0
 */
public class Project3 {
    public static ArrayList<Word> unsortedList = new ArrayList<Word>();
    public static ArrayList<Word> sortedList = new ArrayList<Word>();
    public static ArrayList<String> erroneousList = new ArrayList<String>();// Invalid Words
    static WordGUI gui;

    public static void main(String[] args) {
        gui = new WordGUI("Project 3", 780, 500);
    }
}
