package String;

import java.util.Scanner;

public class LongestCommonSubstring1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Read the strings into an array
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        
        // Find the longest common substring
        String longestCommonSubstring = findLongestCommonSubstring(strings);
        
        System.out.println("Longest common substring: " + longestCommonSubstring);
        
        scanner.close();
    }
    
    public static String findLongestCommonSubstring(String[] strings) {
        if (strings == null || strings.length == 0)
            return "";
        
        String longestCommonSubstring = "";
        
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                String commonSubstring = findCommonSubstring(strings[i], strings[j]);
                if (commonSubstring.length() > longestCommonSubstring.length()) {
                    longestCommonSubstring = commonSubstring;
                }
            }
        }
        
        return longestCommonSubstring;
    }
    
    public static String findCommonSubstring(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        int maxLength = 0;
        int endIndex = 0;

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return s1.substring(endIndex - maxLength, endIndex);
    }
}