import javax.swing.*;
import java.awt.*;

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
     * Set up the menu bar with Open and Quit
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

        setJMenuBar(menuBar);
        menuBar.add(fileMenu);

    } // createMenu

    /**
     * Set up 3 columns for the unsorted, sorted, and erroneous arrays.
     */
    public void printArrayList() {
        setLayout(new GridLayout(1, 3));

        JTextArea unsortedText = new JTextArea(20, 20);
        unsortedText.setEditable(false);
        JScrollPane unSortedPane = new JScrollPane(unsortedText);
        getContentPane().add(unSortedPane);
        
        JTextArea sortedText = new JTextArea(20, 20);
        sortedText.setEditable(false);
        JScrollPane sortedScrollPane = new JScrollPane(sortedText);
        getContentPane().add(sortedScrollPane);

        JTextArea erroneousText = new JTextArea(20, 20);
        erroneousText.setEditable(false);
        JScrollPane erroneousScrollPane = new JScrollPane(erroneousText);
        getContentPane().add(erroneousScrollPane);

        unsortedText.setText(" Unsorted Words:\n");
        sortedText.setText(" Sorted Words:\n");
        erroneousText.setText(" Erroneous Words:\n");

        for (int i = 0; i < Project3.unsortedList.size(); i++)
            unsortedText.append(Project3.unsortedList.get(i).toString() + "\n");

        for (int i = 0; i < Project3.sortedList.size(); i++)
            sortedText.append(Project3.sortedList.get(i).toString() + "\n");

        for (int i = 0; i < Project3.erroneousList.size(); i++)
            erroneousText.append("    " + Project3.erroneousList.get(i) + "\n");

        erroneousText.setBackground(Color.pink);
        erroneousText.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));

        sortedText.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
        sortedText.setBackground(Color.getHSBColor(.2f, .6f, 1f));
        
        unsortedText.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
        unsortedText.setBackground(Color.getHSBColor(.5f, .3f, 1f));
        
        setVisible(true);
    } // printArrayList

} // WordGUI 
