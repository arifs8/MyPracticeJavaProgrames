package CollectionExample1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArrayListString {

	 public static void main(String[] args) {
		 HashSet<String> set = new HashSet<>();
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");
	        set.add("Diamound");
	        set.add("Aarmor");
	        set.add("Aakib");

	        // Iteration order is the same as insertion order
	        for (String element : set) {
	            System.out.println(element);
	        }
	    }
	}
	
	


