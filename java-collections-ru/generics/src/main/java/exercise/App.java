package exercise;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> dictionary) {
        return books.stream().filter(
                        book -> dictionary.entrySet().stream().allMatch(
                                dictEntry ->
                                        book.containsKey(dictEntry.getKey()) &&
                                                book.get(dictEntry.getKey()).equals(dictEntry.getValue())
                        )
                )
                .collect(Collectors.toList());
    }
}
//END