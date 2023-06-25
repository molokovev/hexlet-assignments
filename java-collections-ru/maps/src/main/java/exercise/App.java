package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        HashMap<String, Integer> result = new HashMap<>();
        String[] words = sentence.split(" ");
        for (String word :
                words) {
            if (word.isEmpty() || word.isBlank()) {
                continue;
            }
            Integer prev = result.get(word);
            result.put(word, prev == null ? 1 : prev + 1);
        }

        return result;
    }

    public static String toString(Map<String, Integer> map) {
        StringBuilder result = new StringBuilder("{");
        Set<String> keySet = map.keySet();
        if (!keySet.isEmpty()) {
            result.append(System.lineSeparator());
        }
        for (String key :
                keySet) {
            result.append(String.format("  %s: %d", key, map.get(key)));
            result.append(System.lineSeparator());
        }
        result.append("}");

        return result.toString();
    }
}
//END
