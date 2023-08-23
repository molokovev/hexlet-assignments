package exercise;

import java.util.List;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        List<String> freeDomains = List.of("gmail.com", "yandex.ru", "hotmail.com");

        return emails.stream()
                .filter(email -> freeDomains.stream().anyMatch(email::endsWith))
                .count();
    }
}
// END
