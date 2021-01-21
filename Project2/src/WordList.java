
public abstract class WordList {
    public int length;
    WordNode first, last;

    public WordList() {
        /** First node in linked list - dummy node */
        first = new WordNode(null);

        /**
         * Last node in linked list if there is only one node, the first Node is
         * also the last node
         */
        last = first;

        /** Number of data items in the list. */
        length = 0;
    }// default constructor

    /**
     * Appends a String data element to the end of this List.
     * 
     * @param data
     *            the data element to be appended.
     */
    public void append(Word d) {
        // Step 1: create the new node with data d
        WordNode newNode = new WordNode(d);

        // Step 2: Append after the last node; make last node point to new node
        last.next = newNode;

        // Step 3: update, increase length
        last = newNode;
        length++;
    } // method append(String)

    /**
     * toString is an instance method
     * 
     * @return String representation of elements in linked list delimited by a
     *         space character
     */
    public String toString() {
        WordNode p = first.next;
        String returnString = "";
        while (p != null) {
            returnString += p.data + "\n";
            p = p.next;
        }
        return returnString;
    }
}
