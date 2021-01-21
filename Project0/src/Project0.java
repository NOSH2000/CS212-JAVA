import javax.swing.JOptionPane;

/**
 * @author Nowshin Sayara
 * @lab:CS212-11B
 * 
 * @description Count the number of upper case and lower case e's from the user given sentence.
 * @since 09-24-2020
 * @version 1.0
 */

public class Project0 {
	public static void main(String[] args) {

		String inputSentence;
		int upperE, lowerE;

		// loop through repeatedly to check multiple sentences for upper case and lower case e's.
		while (true) {
			// reset the counter for upper case and lower case e every time the user enters a new sentence
			upperE = 0;
			lowerE = 0;

			// This line asks the user for input by popping out a single window with text input
			inputSentence = JOptionPane.showInputDialog(null, "Please enter a sentence. Enter stop to exist.");

			// Exist the while loop when stop is entered.
			if (inputSentence.equalsIgnoreCase("STOP"))
				System.exit(0);

			// update upperE and lowerE every time an upper case e or lower case e is encountered respectively.
			for (int i = 0; i < inputSentence.length(); i++) {
			    if (inputSentence.charAt(i) == 'e')
					lowerE++;
				if (inputSentence.charAt(i) == 'E')
					upperE++;
			}
			
			/*
			 * Output to a JOptionPane window the total number of upper case e and lower case e
			 * 
			 * System.lineSeparator():
			 * Returns the system-dependent line separator string. 
			 * It always returns the same value - the initial value of the system property line.separator.
			 * */
			JOptionPane.showMessageDialog(null,
					"You entered: " + inputSentence + System.lineSeparator() + "Number of lower case e's: " + lowerE
							+ System.lineSeparator() + "Number of upper case E's: " + upperE);
		} // while
	} // main
}
