package String;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StringCommonCharsOfTwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String first = sc.nextLine();
		String second = sc.nextLine();
		
		printCommon(first, second);

	}
	
	public static void printCommon(String str1, String str2) {
		
			char[] firstString =	str1.replace("\\s", "").toCharArray();
			char[] secondString =	str2.replace("\\s", "").toCharArray();
			
			Set<Character> s1 = new TreeSet<Character>();
			Set<Character> s2 = new TreeSet<Character>();
			
			for(Character c1: firstString) {
				s1.add(c1);
				
			}
			
			for(Character c2: secondString) {
				s2.add(c2);
				
			}
			
			s1.retainAll(s2);
			
			System.out.println(s1);
	}

}
