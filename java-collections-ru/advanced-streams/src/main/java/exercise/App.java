package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String configFile) {
        return Arrays
                .stream(configFile.split("\\r?\\n"))
                .filter(s -> s.startsWith("environment"))
                .map(s -> s.substring(
                        s.indexOf("\"") + 1,
                        s.lastIndexOf("\"")))
                .flatMap(s -> Arrays.stream(s.split(",")))
                .filter(i -> i.startsWith("X_FORWARDED_"))
                .map(i -> i.substring(12))
                .collect(Collectors.joining(","));
    }
}
//END
