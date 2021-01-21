import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Nowshin Sayara
 * @lab:CS212-11B
 * @description Display the 2 sorted and unsorted list using a GridLayout with
 *              one row and column using GUI
 * @since 10-30-2020
 * @version 1.0
 *          {@link http://www.java2s.com/Code/Java/Swing-JFC/BevelBorder.htm} 
 *          {@link https://rgb.to/}
 *          {@link https://codepen.io/HunorMarton/details/eWvewo }
 */
public class WordGUI {
    JFrame frame = new JFrame("Project 2");

    public WordGUI() {
        // Create and set up the window.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);// width, height);
        frame.setLocation(300, 200);// x, y);
        frame.setLayout(new GridLayout(1, 2)); // rows, columns
    }

    public void displayGUI(UnsortedWordList uwl, SortedWordList swl) {
        JTextArea unsortedText = new JTextArea(20, 20);
        unsortedText.setEditable(false);
        JScrollPane unsortedScrollPane = new JScrollPane(unsortedText);
        frame.getContentPane().add(unsortedScrollPane);

        JTextArea sortedText = new JTextArea(20, 20);
        sortedText.setEditable(false);
        JScrollPane sortedScrollPane = new JScrollPane(sortedText);
        frame.getContentPane().add(sortedScrollPane);

        unsortedText.setText("  Unsorted Words:\n");
        sortedText.setText("  Sorted Words:\n");
        sortedText.setForeground(Color.BLACK);

        unsortedText.append(uwl.toString());
        sortedText.append(swl.toString());
        
        //Styling
        unsortedText.setBackground(Color.pink);
        unsortedText.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
        unsortedText.setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.getHSBColor(.9f, .58f, 1f)));

        sortedText.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));
        sortedText.setBackground(Color.getHSBColor(.15f, .56f, 1f));
        sortedText.setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.getHSBColor(1f, .5f, 1f)));
        
        // unsortedText.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,
        // Color.WHITE, Color.GRAY));
        // Display the window.
        frame.pack();
        frame.setVisible(true);

    }
}
