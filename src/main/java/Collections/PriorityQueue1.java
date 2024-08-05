package Collections;

import java.util.*;

public class PriorityQueue1 {

	public static void main(String[] args) {


		java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<Integer>();
		
		pq.offer(111);
		pq.offer(200);
		pq.offer(11);
		pq.offer(7);
		pq.offer(50);
	
		List<Integer> top2 = new ArrayList<Integer>();
		
		int index=0;
		
		while(!pq.isEmpty()) {
			
			if(index == 2) 
				
				break;
				top2.add(pq.poll());
				index++;
			
		}
		
		System.out.println(top2);
		
		

	}

}
