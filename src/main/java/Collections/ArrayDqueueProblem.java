package Collections;

import java.util.ArrayDeque;

public class ArrayDqueueProblem {

	public static void main(String[] args) {


		ArrayDeque<String> ads = new ArrayDeque<String>();
		
		ads.addLast("Cheku");
		ads.addFirst("Green apple");
		ads.add("Banana");
		ads.offer(null);
		ads.offerFirst("Mango");
		ads.offerLast("Cherry");
		
		System.out.println(ads);
		
		System.out.println(ads.peekLast());
		
		for (String st : ads) {
			System.out.println(st);
		}

	}

}
