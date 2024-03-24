import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * This Java program demonstrates a simple way to count the occurrence of words in an array using the Java Stream API.
 * It utilizes the Map interface to store the words as keys and their corresponding counts as values.
 * The program first initializes an empty HashMap and then populates it with word counts using the Stream API.
 * To ensure the word counts are sorted in descending order, it then copies the HashMap to a TreeMap, which maintains the insertion order.
 * Finally, the program prints the word counts in high to low order.
 *  @author Joseph Kabesha
 * @author Isaiah Ayres
 */
public class WordCount {
    public static void main(String[] args) {
        // Array of words to count
        String[] words = {"apple", "banana", "apple", "orange",
                "banana", "apple"};

        // Map to store the word counts
        Map<String, Integer> wordCounts = new HashMap<>();

        // Use the Stream API to populate the word counts
        Arrays.stream(words)
                .forEach(word -> wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1));

        System.out.println("word count  high to low\n");

        // Copy the HashMap to a TreeMap for sorted output
        Map<String, Integer> sortedWordCounts = new TreeMap<>(wordCounts);

        // Print the sorted word counts using the entrySet Stream
        sortedWordCounts.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}