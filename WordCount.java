import java.util.HashMap;
import java.util.Map;

public class WordCount{
    public static void main(String[] args) {
        String[]  words = {"apple", "banana", "apple", "orange",
        "banana", "apple"};
        Map<String, Integer> wordCounts = new HashMap<>();
        
        for (int i=0; i < words.length; i++) {
            String word = words[i];
            if (!wordCounts.containsKey(word)) {
                wordCounts.put(word, 1);
            } else {
                int count = wordCounts.get(word);
                wordCounts.put(word, count + 1);
            }
        }
        System.out.println("Word Count: ");
        System.out.println(wordCounts);

        // int  maxCount = 0;
        // String maxWord = "";
        //  for(String w : wordCounts.keySet()) {


        //     })

}