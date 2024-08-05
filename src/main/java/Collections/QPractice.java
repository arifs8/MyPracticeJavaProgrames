package Collections;

import java.util.*;

public class QPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(2);
		pq.offer(12);
		pq.add(5);
		pq.add(30);

//		System.out.println("The First element in the head is : " + pq.peek());
//		System.out.println(pq);
//		System.out.println( "The remove of element i s: " + pq.poll());
//		System.out.println("After usiong poll method : " + pq);  
//		System.out.println("The First element in the head is : " + pq.peek());
//		System.out.println("After useing peek method: " + pq);
//		System.out.println("To remove element : " + pq.remove());
//		System.out.println("After using remove method: "+ pq);

//		System.out.println(pq);
//		System.out.println(pq.contains(2));
//		System.out.println(pq.poll());
//		System.out.println(pq.contains(2));

//		System.out.println(pq);
//
//		while (!pq.isEmpty()) {
//
//			System.out.print(pq.poll() + " ");
//		}
		
		pq.poll();
		
		Iterator<Integer> itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	
		System.out.println();

	}

}
