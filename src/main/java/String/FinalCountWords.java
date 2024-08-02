package String;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class FinalCountWords {

	public static void main(String[] args) {


		String st = "This this is is done by Arif Arif";

		String[] split = st.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0 ;i<split.length ;i++) {
			
			if(map.containsKey(split[i])) {
				
				map.put(split[i], map.get(split[i])+1);
			}else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		  
		  int maxCount = 0;
	         
	        String maxChar = "";
	         
	        for (Entry<String, Integer> entry : entrySet) 
	        {
	            if (entry.getValue() > maxCount)
	            {
	                maxCount = entry.getValue();
	                 
	                maxChar = entry.getKey();
	            }
	        }
		  
	        System.out.println("Input String : "+st);
	         
	        System.out.println("Maximum Occurring char and its count :");
	         
	        System.out.println(maxChar+" : "+maxCount); 
		
	}

}
