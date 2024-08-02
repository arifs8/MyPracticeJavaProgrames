package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
	//	Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
		
		System.out.println(groupAnagrams(strs));

	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		
		
		Map<String, List<String>> groupAnagram = new HashMap<String, List<String>>();
		
		for(String str : strs) {
			
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			
			String sortedString = String.valueOf(ch);
			
			if(!groupAnagram.containsKey(sortedString)) {
				
				groupAnagram.put(sortedString, new ArrayList<String>());
			}
			
			groupAnagram.get(sortedString).add(str);
		}
		
		return new ArrayList<>(groupAnagram.values());
		
		
		
	}

}
