package ArraysPart1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FrequentArray {

	public static void main(String[] args) {
		int[] ans = { 4, 5, 8, 7, 4, 7, 6, 7 };
		getMostFequesnt(ans);

	}

	public static void getMostFequesnt(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : arr) {

			if (map.containsKey(i)) {

				map.put(i, map.get(i) + 1);

			} else {
				map.put(i, 1);
			}

		}
		int element = 0;
		int frequency = 1;
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();

		for (Entry<Integer, Integer> entry : entrySet) {

			if (entry.getValue() > frequency) {
				element = entry.getKey();
				frequency = entry.getValue();
			}
		}

		if (frequency > 1) {

			System.out.println("The more feequency is : " + frequency + " The repeated key is : " + element);
		}

	}

}
