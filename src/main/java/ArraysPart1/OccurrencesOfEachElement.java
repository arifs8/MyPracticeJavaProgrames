package ArraysPart1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccurrencesOfEachElement {

	public static void main(String[] args) {
		int[] ans ={4, 5, 4, 5, 4, 6};
		occuranceOfElements(ans);
		
		
	}
	
	
	public static void occuranceOfElements(int[] arr) {
		
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i : arr) {
			
			
			if(map.containsKey(i)) {
				
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(map);
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			Integer key = entry.getKey();
			 
			Integer value = entry.getValue();
			
			System.out.println("The key value is : " + key +
					"The Value is : " + value);
			
			
		}
	}

}
