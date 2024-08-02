package String;

import java.util.*;
import java.util.Set;

public class CommonLetters {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        Set<Character> commonLetters = findCommonLetters(strings);
        System.out.println("Common letters: " + commonLetters);
    }

    public static Set<Character> findCommonLetters(String[] strings) {
        Set<Character> commonLetters = new HashSet<>();
        if (strings.length == 0) return commonLetters;

        String firstString = strings[0];
        for (char c : firstString.toCharArray()) {
            boolean isCommon = true;
            for (int i = 1; i < strings.length; i++) {
                if (strings[i].indexOf(c) == -1) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                commonLetters.add(c);
            }
        }
        return commonLetters;
    }
}
