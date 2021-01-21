
public class Word implements Comparable<Word> {
    String data;

    public Word(String data) {
        this.data = data;
    }

    /**
     * @return a string representation of the word
     */
    public String toString() {
        return data;
    }

    @Override
    public int compareTo(Word other) {
        return (this.data.compareTo(other.data));
    }

}
