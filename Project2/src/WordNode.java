
public class WordNode {
    protected Word data;
    protected WordNode next;

    /**
     * Set the new nodes
     * Constructors are always public
     */
    public WordNode(Word d) {
        data = d;
        next = null;
    }
}
