package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FriusitAscOrder {

	public static void main(String[] args) {


		List<String> fruits = new ArrayList<String>();
		
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Watermelon");
		
		System.out.println("The first order without sorting : " + fruits);
		
	    List<String> fruit= 	fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	    fruit.forEach(System.out :: println);
	    System.out.println("----------------------------------------");
	    
	    List<String> fruit1 = fruits.stream().sorted((o1,o2) -> o1.compareTo(o2)).collect(Collectors.toList());
	    fruit1.forEach(System.out::println);
	    System.out.println("----------------------------------------");
	    
	    List<String> fruit2 = fruits.stream().sorted().collect(Collectors.toList());
	    fruit2.forEach(System.out::println);
	    System.out.println("----------------------------------------");
	    
	    
	    List<String> fruit3= 	fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	    fruit3.forEach(System.out :: println);
	    System.out.println("----------------------------------------");
	    
	    List<String> fruit4 = fruits.stream().sorted((o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList());
	    fruit4.forEach(System.out::println);
	    System.out.println("----------------------------------------");
	    
	   
 
	}

}
