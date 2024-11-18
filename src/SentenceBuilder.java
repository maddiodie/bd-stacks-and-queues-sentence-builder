import java.util.ArrayList;
import java.util.Stack;

public class SentenceBuilder {

    private Stack<String> sentence;

    private Stack<String> currentSentence;

    /**
     * Constructor.
     */
    public SentenceBuilder() {
        sentence = new Stack<>();
        currentSentence = new Stack<>();
    }

    /**
     * Adds a word to the sentence.
     * @param word to be added to the sentence.
     */
    public void addWord(String word) {
        sentence.push(word);
    }

    /**
     * Undoes the last word added, and returns it.
     * @return The word most recently added to the sentence, if any; null, otherwise.
     */
    public String undo() {
        if (sentence.isEmpty()) {
            return null;
        }

        return sentence.pop();
    }

    /**
     * Display all the current words in our sentence.
     * @return string representation of the words currently in the sentence.
     */
    public String getSentenceWords() {
        if (sentence.isEmpty()) {
            return "[]";
        }

        while(!sentence.isEmpty()) {
            currentSentence.push(sentence.pop());
        }

        String currentWords = "[" + currentSentence.pop();

        while (!currentSentence.isEmpty()) {
            currentWords += ", ";
            currentWords += currentSentence.pop();
        }

        return currentWords + "]";
    }
}
