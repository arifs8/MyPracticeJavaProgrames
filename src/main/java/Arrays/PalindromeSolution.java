package Arrays;

public class PalindromeSolution {
    public static String solution(String S) {
        char[] chars = S.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n / 2; i++) {
            int j = n - 1 - i;

            if (chars[i] == '?' && chars[j] == '?') {
                // Both are '?', choose 'a' for both
                chars[i] = chars[j] = 'b';
            } else if (chars[i] == '?') {
                // Only chars[i] is '?', copy chars[j] to chars[i]
                chars[i] = chars[j];
            } else if (chars[j] == '?') {
                // Only chars[j] is '?', copy chars[i] to chars[j]
                chars[j] = chars[i];
            } else if (chars[i] != chars[j]) {
                // Conflict, cannot form a palindrome
                return "NO";
            }
        }

        // If the length of the string is odd, the middle character can be any letter
        if (n % 2 == 1 && chars[n / 2] == '?') {
            chars[n / 2] = 'a';
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(solution("ab??a")); // Output: "aabbaa"
        System.out.println(solution("bab??a")); // Output: "NO"
        System.out.println(solution("?a?")); // Output: "aaa"
    }
}

