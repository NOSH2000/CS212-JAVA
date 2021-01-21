// LinkedList.java
// 
// This version uses three instance variables,
// a pointer to the first node, a pointer to
// the last node, and length, to make our
// append and getLength methods more efficient
// than the would be if our only instance
// variable were a pointer to the first node.
//
// This version uses a dummy first node.  Hence
// it needs less decision-making than it would
// need if a dummy first node were not used.
//

/**
 * Encapsulates a linked list of <code>String</code>.
 */
public class LinkedList {
    private ListNode first, last;
    private int length;

    public LinkedList() {
        /** First node in linked list - dummy node */
        first = new ListNode(null);

        /**
         * Last node in linked list if there is only one node, the first Node is
         * also the last node
         */
        last = first;

        /** Number of data items in the list. */
        length = 0;
    }

    /**
     * Gets the number of data values currently stored in this LinkedList.
     * 
     * @return the number of elements in the list.
     */

    public int getLength() {
        return length;
    }

    /**
     * Appends a String data element to the end of this LinkedList.
     * 
     * @param data
     *            the data element to be appended.
     */
    public void append(String d) {
        // TODO Code here for append
        // Step 1: create the new node with data d
        ListNode newNode = new ListNode(d);

        // Step 2: Append after the last node; make last node point to new node
        last.next = newNode;

        // Step 3: update, increase length
        last = newNode;
        length++;

        // Step 4: check the empty linked list manually, no code, just trace
    } // method append(String)

    /**
     * Prepends (adds to the beginning) a String data element to this
     * LinkedList.
     * 
     * @param data
     *            the data element to be prepended.
     */
    public void prepend(String d) {
        // TODO Code here for prepend
        // Step 1: create the new node with data d
        ListNode newNode = new ListNode(d);

        // Step 2: Check if it is empty linkedList, update the last node to
        // newNode
        if (first.next == null)
            last = newNode;

        // First node is always dummy node, thus have the first node point to
        // the new node. But before that, have the New node point to the second
        // node
        // Step 3: New node point to the second node
        newNode.next = first.next;

        // Step 4: the first node point to the new node
        first.next = newNode;

        // Step 5: check the update
        length++;

        // Step 6: check the empty linked list manually, no code, just trace
    } // method append(String)

    /**
     * Find a given String in the linkedList
     * 
     * @param s
     * @return
     */
    public ListNode find(String s) {
        ListNode p = first.next;
        while (p != null && !(p.data).equals(s)) {
            p = p.next;
        } // while
        return p;
    }

    /**
     * Add Before given String
     * 
     * @param given
     * @param s
     *            string to be inserted
     */
    public void addBeforeGiven(String given, String s) {
        // new Node to be added
        ListNode newNode = new ListNode(s);
        ListNode p = first;
        while (p.next != null && !(p.next.data).equals(given)) {
            p = p.next;
        }
        newNode.next = p.next;
        p.next = newNode;
    }

    /**
     * Add After given String
     * 
     * @param given
     * @param s
     *            string to be inserted
     */
    public void addAfterGiven(String given, String s) {
        // new Node to be added
        ListNode newNode = new ListNode(s);
        ListNode p = first.next;
        while (p != null && !(p.data).equals(given)) {
            p = p.next;
        }
        newNode.next = p.next;
        p.next = newNode;
    }

    public void printList() {
        ListNode p = first.next;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    /**
     * @return String representation of elements in linked list delimited by a
     *         space character
     */
    public String toString() {
        // first.next because the first node is the dummy node
        ListNode p = first.next;
        String returnString = "";
        while (p != null) {
            returnString += p.data + " ";
            p = p.next;
        }
        return returnString;
    }

    /**
     * Determines whether this ShortSequenceLinkedList is equal in value to the
     * parameter object. They are equal if the parameter is of class
     * ShortSequenceLinkedList and the two objects contain the same short
     * integer values at each index.
     * 
     * @param other
     *            the object to be compared to this ShortSequenceLinkedList
     * 
     * @return <code>true</code> if the parameter object is a
     *         ShortSequenceLinkedList containing the same numbers at each index
     *         as this ShortSequenceLinkedList, <code>false</code> otherwise.
     */
    public boolean equals(Object other) {
        // getClass() is same as this.getClass() --> it just means to get the
        // class type of current object
        // since "other" object does not have length as a field, we have to cast
        // it
        if (other == null || getClass() != other.getClass() || length != ((LinkedList) other).length)
            return false;

        ListNode nodeThis = first;
        ListNode nodeOther = ((LinkedList) other).first;
        while (nodeThis != null) {
            // Since the two linked lists are the same length, they should reach
            // null on the same iteration.
            if (nodeThis.data != nodeOther.data)
                return false;
            nodeThis = nodeThis.next;
            nodeOther = nodeOther.next;
        } // while

        return true;
    } // method equals

} // class LinkedList
