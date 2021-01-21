import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Create the Edit menu
 */
public class EditMenuHandler implements ActionListener {
    JFrame jframe;

    public EditMenuHandler(JFrame jf) {
        jframe = jf;
    }

    /**
     * Search for the given word in the sortedMap
     */
    public void actionPerformed(ActionEvent event) {
        String menuName = event.getActionCommand();
        if (menuName.equals("Search")) {
            search();
        }
    } // actionPerformed

    public void search() {
        String input = JOptionPane.showInputDialog(null, "Enter a word to search");
        /*
         * // Could search this way too: 
         * Word word = new Word(input); 
         * if (Project4.sortedMap.containsKey(word))
         */
        
        while (!input.equalsIgnoreCase("STOP")) {
            if (Project4.sortedMap.containsValue(input))
                JOptionPane.showMessageDialog(null, "'" + input + "'" + " is in the list");
            else
                JOptionPane.showMessageDialog(null, "'" + input + "'" + " is not in the list");
            input = JOptionPane.showInputDialog(null, "Enter a word to search. Enter STOP to exist");
        }

        /*
         * String ans = JOptionPane.showInputDialog(null,
         * "Want to search another word? (y/n)");
         * 
         * while (!ans.equalsIgnoreCase("Y") && !ans.equalsIgnoreCase("N")) ans
         * = JOptionPane.showInputDialog(null,
         * "I did not understand. Want to search another word? (y/n)");
         * 
         * if (ans.equalsIgnoreCase("Y")) search(); else
         * JOptionPane.showMessageDialog(null,
         * "You discontinued your search. Goodbye!");
         */
    }
}
