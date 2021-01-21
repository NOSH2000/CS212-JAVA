import javax.swing.JOptionPane;

/**
 * 
 * @author Nowshin Sayara
 * @since Sep 23rd, 2020
 * @description find the sum and average of a set of numbers that are saved (1D
 *              array) in a file
 */
// Run as -- run configurations -- arguments -- lab6input.txt
public class Lab6 {

	public static void main(String[] args) {

		int[] wordArray = new int[20];
		// read file
		String fileName = args[0];
		int actualLength = inputFromFile(fileName, wordArray);
		JOptionPane.showMessageDialog(null,
				"sum: " + sum(wordArray, actualLength) + ", average: " + average(wordArray, actualLength));
	} // main

	/**
	 * 
	 * @param myArray integer inputs from lab6input.txt
	 * @param myArraySize from main method
	 * @return (int) the sum of all the numbers 
	 */
	public static int sum(int[] myArray, int myArraySize) {
		int s = 0;
		for (int i = 0; i < myArraySize; i++)
			s += myArray[i];
		return s;
	}

	/**
	 * 
	 * @param myArray integer inputs from lab6input.txt
	 * @param myArraySize from main method
	 * @return (int) the average of all the numbers 
	 */
	public static int average(int[] myArray, int myArraySize) {
		return sum(myArray, myArraySize) / myArraySize;
	}
	
	/**
	 * 
	 * @param filename txt file
	 * @param numbers 
	 * @return total number of inputs
	 */
	private static int inputFromFile(String filename, int[] numbers) {
		TextFileInput in = new TextFileInput(filename);
		int lengthFilled = 0;
		String line = in.readLine();
		while (lengthFilled < numbers.length && line != null) {
			numbers[lengthFilled++] = Integer.parseInt(line);
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

} // class Lab4