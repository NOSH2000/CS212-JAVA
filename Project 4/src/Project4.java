import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Nowshin Sayara
 * @lab:CS212-11B
 * 
 * @description Add a file menu to your WordGUI with options to open any file
 *              for reading and displaying in the unsorted and sorted), and one
 *              to Quit the program. Add an edit menu with options to search for
 *              the input from the sortedMap
 * @since 12-02-2020
 * @version 1.0
 */
public class Project4 {
    public static Map<Word, String> sortedMap = new TreeMap<>();
    public static ArrayList<Word> unsortedList = new ArrayList<Word>();
    static WordGUI gui;

    public static void main(String[] args) {
        gui = new WordGUI("Project 4", 550, 500);
    }

    public boolean search(Word key) {
        return sortedMap.containsKey(key);
    }
}
