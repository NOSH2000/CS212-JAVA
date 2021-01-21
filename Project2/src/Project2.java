import java.util.StringTokenizer;

/**
 * @author Nowshin Sayara
 * @lab:CS212-11B
 * 
 * @description
 * @since 10-30-2020
 * @version 1.0
 */
public class Project2 {
    public static void main(String args[]) {
        TextFileInput myFile = new TextFileInput("input.txt");
        UnsortedWordList uwl = new UnsortedWordList();
        SortedWordList swl = new SortedWordList();

        // Read the inputs from a file
        String word, sentence = "";
        String line = myFile.readLine();
        while (line != null) {
            sentence += line + " ";
            line = myFile.readLine();
        }

        // Add each word to the two linked lists
        StringTokenizer tokens = new StringTokenizer(sentence);
        while (tokens.hasMoreTokens()) {
            word = tokens.nextToken();
            Word w = new Word(word);
            uwl.add(w);
            swl.add(w);
        }

        WordGUI gui = new WordGUI();
        gui.displayGUI(uwl, swl);
    }
}
