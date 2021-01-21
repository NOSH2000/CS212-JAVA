
public class SortedWordList extends WordList {
    public SortedWordList() {
        super();
    }

    /**
     * Sort word before adding it to the word list
     * @param w
     */
    public void add(Word word) {
        // new Node to be added
        WordNode newNode = new WordNode(word);

        // super.first is in the superclass WordList
        WordNode p = super.first;

        /*
         * Compares two strings based on the Unicode value of each character in
         * the strings. The result is a negative integer if this String object
         * lexicographically come before the argument string
         */
        while (p.next != null) {
            // str refers to the data in Word class
            if (newNode.data.str.compareTo(p.next.data.str) < 0) {
                break;
            }
            // If newNode is not less than currentNext node, move to the next
            // node.
            p = p.next;
        }
        newNode.next = p.next;
        p.next = newNode;
    }
}
