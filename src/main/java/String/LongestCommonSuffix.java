package String;

public class LongestCommonSuffix {
    
    public static String longestCommonSuffix(String[] strings) {
        if (strings == null || strings.length == 0)
            return "";
        
        // Find the length of the shortest string
        int minLength = Integer.MAX_VALUE;
        for (String str : strings) {
            minLength = Math.min(minLength, str.length());
        }
        
        // Iterate from the end of the strings
        StringBuilder suffix = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            char currentChar = strings[0].charAt(strings[0].length() - i - 1);
            for (int j = 1; j < strings.length; j++) {
                if (strings[j].charAt(strings[j].length() - i - 1) != currentChar) {
                    return suffix.reverse().toString();
                }
            }
            suffix.append(currentChar);
        }
        
        return suffix.reverse().toString();
    }
    
    public static void main(String[] args) {
        String[] strings = {"helloworldbye", "goodbye", "worldbye"};
        String longestSuffix = longestCommonSuffix(strings);
        System.out.println("Longest common suffix: " + longestSuffix);
    }
}
