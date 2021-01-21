import java.util.*;

/**
 * 
 * @author Nowshin Sayara
 * @lab:CS212-11B
 * 
 * @description Read from a file that contains a paragraph of words. Put all the
 *              words in an array, put the valid words (words that have only
 *              letters) in a second array, and put the invalid words in a third
 *              array. Sort the array of valid words using Selection Sort.
 * @since 10-06-2020
 * @version 1.0
 */
public class Project1 {
    public static TextFileInput myFile;
    public static StringTokenizer myTokens;
    public static String[] allWords;
    public static String[] valid;
    public static String[] invalid;
    public static String line;
    public static int size1, size2 = 0, size3 = 0;
    // static WordGUI gui;

    /**
     * @description Read a line from the file and use a StringTokenizer to
     *              extract the words from the line into the respective arrays.
     * @param args
     */
    public static void main(String[] args) {
        /*
         * Open the file and read a line. Each word in the input.txt file is
         * called a token
         */
        String sentence = "";
        myFile = new TextFileInput("Project1Input.txt");
        line = myFile.readLine();
        while (line != null) {
            sentence += line + " ";
            line = myFile.readLine();
        }

        /*
         * Create a new StringTokenizer, passing the String
         */
        myTokens = new StringTokenizer(sentence);
        size1 = myTokens.countTokens();

        /*
         * Declare an array whose size is equal to the number of tokens found
         * using the method countTokens from the StringTokenizer class
         */
        allWords = new String[size1];
        valid = new String[size1];
        invalid = new String[size1];

        /*
         * Get the separated strings one by one from the StringTokenizer and put
         * them in the array
         */
        int l = 0;
        String word;
        while (myTokens.hasMoreTokens()) {
            word = myTokens.nextToken();
            allWords[l++] = word;
            if (word.matches("[a-zA-Z]+"))
                valid[size2++] = word;
            else
                invalid[size3++] = word;
        } // while

        /*
         * sort the valid array alphabetically and then print out the 3 arrays
         * using GUI
         */
        selectionSort(valid, size2);
        WordGUI.createAndShowGUI(allWords, size1, valid, size2, invalid, size3);

    }// main

    /**
     * This sorting algorithm is an in-place comparison-based algorithm in which
     * the list is divided into two parts, the sorted part at the left end and
     * the unsorted part at the right end. Initially, the sorted part is empty
     * and the unsorted part is the entire list.
     * 
     * The smallest element is selected from the unsorted array and swapped with
     * the leftmost element, and that element becomes a part of the sorted
     * array. This process continues moving unsorted array boundary by one
     * element to the right.
     * 
     * @param array
     *            valid array
     * @param length
     *            size of valid array
     */
    public static void selectionSort(String[] array, int length) {
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < length - 1; i++) {
            // Find the minimum element in unsorted array
            int indexLowest = i;
            for (int j = i + 1; j < length; j++)
                // Current //compareTo uses ASCII values
                if (array[j].compareTo(array[indexLowest]) < 0)
                    indexLowest = j;

            // Swapping the minimum element with the first element
            // if they are not equal.
            if (!array[indexLowest].equals(array[i])) {
                String temp = array[indexLowest];
                array[indexLowest] = array[i];
                array[i] = temp;
            }
        } // for(i)
    }// selectionSort

}// class
