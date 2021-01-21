
/**
 * @description read a file (twodimension.txt) with string inputs and print them
 *              like a 2D array.
 * @author Nowshin Sayara
 * @since 09/29/2020
 * @version 1.0
 */
public class TwoDimArray {

    public static int[][] myArray;

    public static void main(String[] args) {
        myArray = fillArray(args[0]); // args[0] means file name
                                      // twodimension.txt
        printArray(myArray);
        printArrayEven(myArray);
    }

    /**
     * @description read from the input file myFile containing strings and
     *              return a two dimension array of integers.
     * @param myFile
     *            -- receives integer inputs from twodimension.txt
     * @return array -- 2D array 4X5
     */
    public static int[][] fillArray(String myFile) {
        TextFileInput in = new TextFileInput(myFile);
        int row = Integer.parseInt(in.readLine()); // 4 - first line
        int col = Integer.parseInt(in.readLine()); // 5 - second line
        int[][] array = new int[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                array[r][c] = Integer.parseInt(in.readLine()); // starts
                                                               // from third
                                                               // line
            }
        }
        return array;
    }

    /**
     * @description print 2D array
     * @param theArray
     */
    private static void printArray(int[][] theArray) {
        for (int i = 0; i < theArray.length; i++) {
            for (int j = 0; j < theArray[i].length; j++)
                display(theArray[i][j]);
            System.out.println();
        }
        System.out.println();
    }

    private static void display(int num) {
        if (num < 10)
            System.out.print(" " + num + " ");
        else
            System.out.print(num + " ");
    }

    /**
     * @description print even numbers and * in place of odd
     * @param theArray
     *            -- 2D array
     */
    private static void printArrayEven(int[][] theArray) {
        System.out.println("printArrayEven:");
        for (int i = 0; i < theArray.length; i++) {
            for (int j = 0; j < theArray[i].length; j++) {
                if (theArray[i][j] % 2 == 0)
                    display(theArray[i][j]);
                else
                    System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
