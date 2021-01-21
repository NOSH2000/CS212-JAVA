
public class Word implements Comparable<Word> {
    String data;

    public Word(String data) {
        for (int i = 0; i < data.length(); i++)
            if (!Character.isLetter(data.charAt(i))) {
                throw new IllegalWordException("Invalid word: " + data);
            }
        this.data = data;
    }

    /**
     * @return a string representation of the word
     */
    public String toString() {
        return "    " + data;
    }

    @Override
    public int compareTo(Word other) {
        return (this.data.compareTo(other.data));
    }
}
