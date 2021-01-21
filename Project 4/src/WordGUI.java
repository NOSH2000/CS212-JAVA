import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class WordGUI extends JFrame {

    /**
     * Set up GUI default window
     * @param title
     * @param height
     * @param width
     */
    public WordGUI(String title, int width, int height) {
        setTitle(title);
        setSize(width, height);
        setLocation(200, 180);
        createFileMenu();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    } // WordGUI constructor

    /**
     * Set up the menu bar with File (which has 2 options: Open and Quit) and
     * Edit, which has a Search option
     */
    private void createFileMenu() {
        JMenuItem item;
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        // this refers to current GUI, the sampleGUI
        FileMenuHandler fmh = new FileMenuHandler(this);

        item = new JMenuItem("Open"); // Open...
        item.addActionListener(fmh); // used to listen to the action
        fileMenu.add(item);

        fileMenu.addSeparator(); // add a horizontal separator line

        item = new JMenuItem("Quit"); // Quit
        item.addActionListener(fmh);
        fileMenu.add(item);

        JMenu editMenu = new JMenu("Edit");
        EditMenuHandler emh = new EditMenuHandler(this);
        item = new JMenuItem("Search");
        item.addActionListener(emh);
        editMenu.add(item);

        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

    } // createMenu

    /**
     * Set up 2 columns for the unsorted and sorted to display the words
     */
    public void printArrayList() {
        setLayout(new GridLayout(1, 2));

        JTextArea unsortedText = new JTextArea(20, 20);
        unsortedText.setEditable(false);
        JScrollPane unSortedPane = new JScrollPane(unsortedText);
        getContentPane().add(unSortedPane);

        JTextArea sortedText = new JTextArea(20, 20);
        sortedText.setEditable(false);
        JScrollPane sortedScrollPane = new JScrollPane(sortedText);
        getContentPane().add(sortedScrollPane);

        unsortedText.setText(" Unsorted Words:\n");
        sortedText.setText(" Sorted Words:\n");

        for (int i = 0; i < Project4.unsortedList.size(); i++)
            unsortedText.append("    " + Project4.unsortedList.get(i).toString() + "\n");

        /*
         * 1. Print the map iteratively Tip: Here we use a for-each loop to
         * simplify the iteration.
         * 
         * Warning: We must get the entrySet view because maps are not Iterable
         * (they do not have an iterator() method).
         * 
         * References:
         * 
         * foreach: -
         * http://stackoverflow.com/questions/85190/how-does-the-java-for-each-
         * 
         * loop-work -
         * http://docs.oracle.com/javase/1.5.0/docs/guide/language/foreach.html
         * 
         * entrySet():
         * http://docs.oracle.com/javase/7/docs/api/java/util/Map.html#entrySet%
         * 28%29
         */
        //for each entry in the map's entry set print it
        for (Map.Entry me : Project4.sortedMap.entrySet()) {
            sortedText.append("    " + me.getKey() + "\n");
        }

        /*
         * 2. While loop to Print the map iteratively
            Set set = Project4.sortedMap.entrySet();
            Iterator i = set.iterator();
            while (i.hasNext()) {
                // must cast because i.next() returns Object, not Map.Entry
                Map.Entry me = (Map.Entry) i.next();
                sortedText.append("    " + me + "\n");
            }  
        */
        
        sortedText.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
        sortedText.setBackground(Color.getHSBColor(.2f, .6f, 1f));

        unsortedText.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
        unsortedText.setBackground(Color.getHSBColor(.5f, .3f, 1f));

        setVisible(true);
    } // printArrayList

} // WordGUI
