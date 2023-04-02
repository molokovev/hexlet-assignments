package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static boolean scrabble(String chars, String word) {
        List<Character> charsLeft = stringToLowerCharList(chars);
        List<Character> wordChars = stringToLowerCharList(word);

        for (char letter: wordChars) {
            if (charsLeft.contains(letter)) {
                charsLeft.remove((Object) letter);
            } else {
                return false;
            }
        }

        return true;
    }

    private static List<Character> stringToLowerCharList(String str) {
        return str.chars().mapToObj(c -> (char) c).map(Character::toLowerCase).collect(Collectors.toList());
    }
}
//END
