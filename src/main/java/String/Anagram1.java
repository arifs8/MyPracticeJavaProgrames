package String;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {
		String str1 = "anagram";
		String str2 = "nagaram";
		
		System.out.println(anagramValidation(str1, str2));

	}
	
	public static boolean anagramValidation(String s, String t) {
		
		if(s.length() != t.length()) {
			return false;
		}
		
		char[] string1 = s.toCharArray();
		char[] string2 = t.toCharArray();
		
		
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		if(Arrays.equals(string1, string1)) {
			return true;
		}else {
			return false;
		}
		
	}

}
