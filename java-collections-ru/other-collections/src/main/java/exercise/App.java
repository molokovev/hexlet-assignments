package exercise;

import java.util.*;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Set<String> keys1 = data1.keySet();
        Set<String> keys2 = data2.keySet();

        Set<String> resultKeys = new HashSet<>();
        resultKeys.addAll(keys1);
        resultKeys.addAll(keys2);

        System.out.println(resultKeys);

        LinkedHashMap<String, String> result = new LinkedHashMap<>();

        for (String key : resultKeys) {
            if (!data1.containsKey(key)) {
                result.put(key, "added");
            } else if (!data2.containsKey(key)) {
                result.put(key, "deleted");
            } else if (data1.get(key).equals(data2.get(key))) {
                result.put(key, "unchanged");
            } else {
                result.put(key, "changed");
            }
        }

        return result;
    }
}
//END
