package Collections;

import java.util.HashSet;

public class HashPractice {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(23);
		hs.add(12);
		hs.add(66);
		hs.add(42);
		hs.add(82);
		hs.add(12);
		
		System.out.println(hs);

		
		for(Integer inte :hs) {
			
			System.out.print(inte + " ");
		}
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains(42));
	
	}

}
