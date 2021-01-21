import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 
 * @author Nowshin Sayara
 * @lab:CS212-11B
 * 
 * @description Display the 3 arrays using a GridLayout with one row and three
 *              columns using GUI.
 * @since 10-06-2020
 * @version 1.0
 */
public class WordGUI {

    /**
     * 
     * @param allArr
     * @param validArr
     * @param invalidArr
     * @param size1
     *            size of allArr array
     * @param size2
     *            size of validArr array
     * @param size3
     *            size of invalidArr array
     */
    static void createAndShowGUI(String[] allArr, int size1, String[] validArr, int size2, String[] invalidArr,
            int size3) {
        // Create and set up the window.
        JFrame frame = new JFrame("Project1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);// width, height);
        frame.setLocation(300, 200);// x, y);
        frame.setLayout(new GridLayout(1, 3)); // rows, columns

        JTextArea allText = new JTextArea(20, 15);
        allText.setEditable(false);
        JScrollPane allScrollPane = new JScrollPane(allText);
        frame.getContentPane().add(allScrollPane);

        JTextArea validText = new JTextArea(20, 15);
        validText.setEditable(false);
        JScrollPane validScrollPane = new JScrollPane(validText);
        frame.getContentPane().add(validScrollPane);

        JTextArea invalidText = new JTextArea(20, 15);
        invalidText.setEditable(false);
        JScrollPane invalidScrollPane = new JScrollPane(invalidText);
        frame.getContentPane().add(invalidScrollPane);

        allText.setText("  All words:\n");
        validText.setText("  Valid words:\n");
        invalidText.setText("  Invalid words:\n");

        // Display the window.
        frame.pack();
        frame.setVisible(true);

        for (int i = 0; i < size1; i++)
            allText.append("  " + allArr[i] + "\n");

        for (int i = 0; i < size2; i++)
            validText.append("  " + validArr[i] + "\n");

        for (int i = 0; i < size3; i++)
            invalidText.append("  " + invalidArr[i] + "\n");

    }
}
