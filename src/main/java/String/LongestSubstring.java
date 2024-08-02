package String;

import java.util.LinkedHashMap;

public class LongestSubstring {

	public static void main(String[] args) {

		longestSubstring("thelongestsubstring");
	}

	public static void longestSubstring(String inputString) {
		
		char[] charArray = inputString.toCharArray();

		String longestSubstring = null;

		int longestSubstringLength = 0;

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) {
			
			char ch = charArray[i];

			if (!map.containsKey(ch)) {
				map.put(ch, i);
			}

			else {
				i = map.get(ch);

				map.clear();
			}


			if (map.size() > longestSubstringLength) {
				longestSubstringLength = map.size();

				longestSubstring = map.keySet().toString();
			}
		}

		System.out.println("Input String : " + inputString);

		System.out.println("The longest substring : " + longestSubstring);

		System.out.println("The longest Substring Length : " + longestSubstringLength);
	}

}
