package ArraysPart1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SortArrayElementsByFrequency {

	public static void main(String[] args) {
		
		String ans = "Arif";

		int[] arr = { 7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3 };
		sortArrayElementsByFrequency(arr);

	}

	public static void sortArrayElementsByFrequency(int[] inputArray) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < inputArray.length; i++) {
			if (map.containsKey(inputArray[i])) {

				map.put(inputArray[i], map.get(inputArray[i]) + 1);

			} else {

				map.put(inputArray[i], 1);
			}
		}
		
		ArrayList<Entry<Integer, Integer>> listOfEntry = new ArrayList<Entry<Integer,Integer>>(map.entrySet());
		
		Collections.sort(listOfEntry, new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		System.out.println("Input Array : "+Arrays.toString(inputArray));
        
        System.out.println("Sorted Array Elements In Descending Order Of Their Frequency :");
          
        System.out.print("[ ");
        
        for(Entry<Integer, Integer> entrySet :listOfEntry) {
        	
        	int freqency = entrySet.getValue();
        	while(freqency >=1) {
        		System.out.print(entrySet.getKey()+" ");
        		freqency--;
        	}
        }
        
        System.out.println("]");
	}

}
