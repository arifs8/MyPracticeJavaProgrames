package String;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {


		String strinfg = "aabbccdefatafaz";
		
		char[] str = strinfg.toCharArray();
		
		Set<Character> st = new HashSet<Character>();
		
		for(char c :str) {
			
			st.add(c);
		}
		
//		StringBuilder sb = new StringBuilder();
//		
//		for(Character chars :st) {
//			
//			sb.append(chars);
//		}
		
		System.out.println(st.toString());

	}

}
