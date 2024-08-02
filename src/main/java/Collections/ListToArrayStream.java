package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayStream {

	public static void main(String[] args) {


		List<String> names = new ArrayList<String>();
		names.add("Paul");  
        names.add("Donal");  
        names.add("James");  
        names.add("Robert");  
        names.add("Mery");
        
        String[] namesArray  = names.stream().toArray(String[] :: new);
        
        for(String x :namesArray) {
        	System.out.println(x);
        }
	}

}
