import javax.swing.JOptionPane;

/**
 * 
 * @author Nowshin Sayara
 * @since Sep 23rd, 2020
 * @description find if the user entered word is in the list. The list is read
 *              from a different file: lab5input.txt
 */

// Run as -- run configurations -- arguments -- lab5input.txt
public class Lab5 {

	public static void main(String[] args) {

		String[] wordArray = new String[20];
		// read file
		String fileName = args[0];
		inputFromFile(fileName, wordArray);

		String isOrIsNot, inputWord;

		// loop through repeatedly to verify multiple words. exists the loop
		// when stop is entered.
		while (true) {
			// This line asks the user for input by popping out a single window
			// with text input
			inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");

			if (inputWord.equalsIgnoreCase("STOP"))
				System.exit(0);

			// if the inputWord is contained within wordArray return true
			if (wordIsThere(inputWord, wordArray))
				isOrIsNot = "is"; // set to is if the word is on the list
			else
				isOrIsNot = "is not"; // set to is not if the word is not on the
										// list

			// Output to a JOptionPane window whether the word is on the list or
			// not
			JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " in the list.");
		}
	} // main

	private static int inputFromFile(String filename, String[] numbers) {
		TextFileInput in = new TextFileInput(filename);
		int lengthFilled = 0;
		String line = in.readLine();
		while (lengthFilled < numbers.length && line != null) {
			numbers[lengthFilled++] = line;
			line = in.readLine();
		} // while
		if (line != null) {
			System.out.println("File contains too many numbers.");
			System.out.println("This program can process only " + numbers.length + " numbers.");
			System.exit(1);
		} // if
		in.close();
		return lengthFilled;
	} // method inputFromFile

	/* 
	 * you cannot compare Strings with the "==" operator. You must use the
	 * equals method of class String, for example:if(s1.equals(s2)) will compare
	 * String s1 with String s2 equals compare the string value, == compares the
	 * memory address
	 * 
	 * @param findMe user Input
	 * @param theList word array
	 * @return true if the word is in the list. Else return false
	 */
	public static boolean wordIsThere(String findMe, String[] theList) {
		for (int i = 0; i < theList.length; i++) {
			if (findMe.equals(theList[i]))
				return true;
		}
		return false;
	} // wordIsThere
} // class Lab4