import javax.swing.*;
import java.awt.event.*;
import java.util.Collections;
import java.util.StringTokenizer;

public class FileMenuHandler implements ActionListener {
    JFrame jframe;

    public FileMenuHandler(JFrame jf) {
        jframe = jf;
    }

    /**
     * Handles the actions of the menu where the user chooses the file
     */
    public void actionPerformed(ActionEvent event) {
        String menuName = event.getActionCommand();
        if (menuName.equals("Open")) {
            chooseAndReadFile();
            Project3.gui.printArrayList();
        } else if (menuName.equals("Quit"))
            System.exit(0);
    } // actionPerformed

    /**
     * choose and read the file and store the words in the appropriate array
     * lists
     */
    public void chooseAndReadFile() {
        // Select a file
        JFileChooser fd = new JFileChooser("./");
        fd.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fd.showOpenDialog(null);
        String fileName = fd.getSelectedFile().getName();

        // Read the inputs from a file
        String word = "", sentence = "";
        TextFileInput myFile = new TextFileInput(fileName);
        String line = myFile.readLine();
        while (line != null) {
            sentence += line + " ";
            line = myFile.readLine();
        }
        
        // Add each word to the three array lists
        StringTokenizer tokens = new StringTokenizer(sentence);
        while (tokens.hasMoreTokens()) {
            try {
                word = tokens.nextToken();
                Word w = new Word(word);
                Project3.unsortedList.add(w);
                Project3.sortedList.add(w);
            } catch (IllegalWordException e) {
                Project3.erroneousList.add(word);
                System.err.println(e.getMessage());
            }
        } 
        // Sort list in place
        Collections.sort(Project3.sortedList);
    }// readFile

} // FileMenuHandler class