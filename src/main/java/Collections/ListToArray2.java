package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListToArray2 {

	public static void main(String[] args) {


		List<String> names = new ArrayList<String>();
		names.add("Paul");  
        names.add("Donal");  
        names.add("James");  
        names.add("Robert");  
        names.add("Mery");
        
        
        String[] newArray = names.toArray(new String[0]);
        
        for(int i=0 ;i<newArray.length ;i++) {
        	
        	System.out.println((i+1)+ " element of the array is " + newArray[i]);
        }

	}

}
