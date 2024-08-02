package String;

	
	
	public class LongestCommonPrefix1 {
	    
	    public static String longestCommonPrefix(String[] strings) {
	        if (strings == null || strings.length == 0)
	            return "";
	        
	        int minLength = Integer.MAX_VALUE;
	        
	        // Find the length of the shortest string
	        for (String str : strings) {
	            minLength = Math.min(minLength, str.length());
	        }
	        
	        // Check character by character for common prefix
	        StringBuilder prefix = new StringBuilder();
	        for (int i = 0; i < minLength; i++) {
	            char currentChar = strings[0].charAt(i);
	            for (int j = 1; j < strings.length; j++) {
	                if (strings[j].charAt(i) != currentChar) {
	                    return prefix.toString();
	                }
	            }
	            prefix.append(currentChar);
	        }
	        
	        return prefix.toString();
	    }
	    
	    public static void main(String[] args) {
	        String[] strings = {"flower", "flow", "floight"};
	        String longestPrefix = longestCommonPrefix(strings);
	        System.out.println("Longest common prefix: " + longestPrefix);
	    }
	

}
