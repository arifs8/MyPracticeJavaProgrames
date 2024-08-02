package String;

public class LongestCommonSubstring3 {
    
    public static String longestCommonSubstring(String[] strings) {
        if (strings == null || strings.length == 0)
            return "";
        
        int n = strings.length;
        String first = strings[0];
        int len = first.length();
        String longestSubstring = "";
        
        // Iterate through the characters of the first string
        for (int i = 0; i < len; i++) {
            // Check if the substring from i to end is common among all strings
            for (int j = i + 1; j <= len; j++) {
                String substring = first.substring(i, j);
                boolean allContains = true;
                for (int k = 1; k < n; k++) {
                    if (!strings[k].contains(substring)) {
                        allContains = false;
                        break;
                    }
                }
                // Update longestSubstring if current substring is common and longer
                if (allContains && substring.length() > longestSubstring.length()) {
                    longestSubstring = substring;
                }
            }
        }
        
        return longestSubstring;
    }
    
    public static void main(String[] args) {
        String[] strings = {"abcdef", "abcde", "abcxyz", "abcpqr"};
        String longestSubstring = longestCommonSubstring(strings);
        System.out.println("Longest common substring: " + longestSubstring);
    }
}
