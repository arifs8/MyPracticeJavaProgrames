package ArraysPart1;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		 String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		  
	        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
	        
	        System.out.println(intersectioinOfArrays(s1, s2));

	}
	
	
	public static HashSet<String> intersectioinOfArrays(String[] s1, String[] s2) {
		
		
		HashSet<String> set = new HashSet<String>();
		
		
		for(int i=0; i<s1.length ;i++) {
			
			for(int j=0; j<s2.length ;j++) {
				
				if(s1[i] == s2[j]) {
					
					set.add(s1[i]);
				}
			}
		}
		return set;
		
		
	}

}
