package String;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class MaximumOccurringCharProgram {

	public static void main(String[] args) {

		String str = "Java Concept Of The Day";
		maxOcuureance(str);

	}

	public static void maxOcuureance(String st) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char[] charArray = st.replaceAll("\\s", "").toCharArray();

		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> entrySet = map.entrySet();

		int maxCount = 0;

		char maxChar = 0;

		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();

				maxChar = entry.getKey();
			}
		}

		System.out.println("Input String : " + st);

		System.out.println("Maximum Occurring char and its count :");

		System.out.println(maxChar + " : " + maxCount);
	}

}
