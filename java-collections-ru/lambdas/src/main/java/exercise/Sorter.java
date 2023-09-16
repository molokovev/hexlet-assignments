package exercise;

import java.util.*;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(u -> u.get("gender").equals("male"))
                .sorted((u1, u2) ->
                {
                    LocalDate birthday1 = LocalDate.parse(u1.get("birthday"));
                    LocalDate birthday2 = LocalDate.parse(u2.get("birthday"));
                    if (birthday1.isEqual(birthday2)) return 0;
                    return birthday1.isAfter(birthday2) ? 1 : -1;
                })
                .map(u -> u.get("name"))
                .collect(Collectors.toList());
    }
}
// END
