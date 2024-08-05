package Collections;

import java.util.HashSet;

public class HashSetProblem {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(15);
		hs.add(7);
		hs.add(150);
		hs.add(80);
		hs.add(null);
		hs.add(null);  
		hs.add(15);
		
		System.out.println(hs);
		
		hs.remove(150);

		System.out.println(hs); 
		

	}

}
