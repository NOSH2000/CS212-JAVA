public class Lab25 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] intArray = { 3, 5, 9, 4, 10, 33, 12, 19, 4, 16, 23, 30 };
        int[] intArray1 = { 1, 2, 4, 5, 5, 6, 7, 8, 9, 100 };

        System.out.println(largest(intArray, 0));
        System.out.println(sum(intArray, 0));
        System.out.println(isSorted(intArray, 0));
        System.out.println(isSorted(intArray, 8));
        System.out.println(isSorted(intArray1, 0));
    }

    /**
     * The largest number in the array is the larger of the first number in the
     * array, and the largest number n the rest of the array
     * 
     * @param myArray
     * @param index
     * @return
     */
    public static int largest(int[] myArray, int index) {
        // Base case: the array contains nothing
        if (myArray.length == index)
            return 0;
        // Recursive
        if (myArray[index] > largest(myArray, index + 1))
            return myArray[index];
        else
            return largest(myArray, index + 1);

    }

    /**
     * The sum of the numbers in the array is the first number plus he sum of
     * the rest of the numbers in the array
     * 
     * @param myArray
     * @param index
     * @return
     */
    public static int sum(int[] myArray, int index) {
        // Base case: the array contains nothing
        if (myArray.length == index)
            return 0;
        // Recursive
        return myArray[index] + sum(myArray, index + 1);
    }

    /**
     * The array is sorted if the first number in the array is less than or
     * equal to the second number in the array, and the rest of the array is
     * sorted
     * 
     * @param myArray
     * @param index
     * @return
     */
    public static boolean isSorted(int[] myArray, int index) {
        if (myArray.length - 1 == index)
            return true;
        return (myArray[index] < myArray[index + 1]) && (isSorted(myArray, index + 1));
    }

}