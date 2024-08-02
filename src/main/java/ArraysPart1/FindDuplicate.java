package ArraysPart1;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class FindDuplicate {

	public static void main(String[] args) {
		int[] ans = {111,222,333,555,666,333,555,777,999,666};
		findDup(ans);
		findDup(ans);
		
		

	}
	
	
	public static void findDup(int[] arr) {
		
		for(int i=0 ;i<arr.length ;i++) {
			
			
			for(int j=i+1 ;j<arr.length ;j++) {
				
				if(arr[i] == arr[j]) {
					System.out.print(" " + arr[i]);
					
				}
				
			}
		}
		System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
	}
	
	
	public static void findDuplicateSorting(int[] arr) {
		
		Arrays.sort(arr);
		
		for(int i=0 ;i<arr.length-1;i++) {
			
			if(arr[i] == arr[i+1]) {
				System.out.println(arr[i]);
				
			}
		}
		System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
	}
	
	
	public static void findDuplicateHashMap(int[] inputArray) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int element : inputArray) 
        {   
            if(map.get(element) == null)
            {
                map.put(element, 1);
            }
            else
            {
                map.put(element, map.get(element)+1);
            }
        }
          
        Set<java.util.Map.Entry<Integer, Integer>> entrySet = map.entrySet();
          
        for (java.util.Map.Entry<Integer, Integer> entry : entrySet) 
        {               
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
