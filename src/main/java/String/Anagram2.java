package String;

import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) {
		String str1 = "syedarif";
		String str2 = "Arifsyed";
		System.out.println(anagramValidation1(str1, str2));

	}

	public static boolean anagramValidation1(String s, String t) {
		
		String st = s.toLowerCase();
		String lt = t.toLowerCase();

		if (st.length() != lt.length()) {
			return false;
		}
		
		
		int[] charCount =new int[26];
		
		for(int i=0 ;i<st.length() ;i++) {
			
			charCount[st.charAt(i) - 'a']++;
			charCount[lt.charAt(i) - 'a']--;
		}
		
		for(int count : charCount) {
			if(count != 0) {
				return false;
			}
			
			
		}
		return true;

	}

}
