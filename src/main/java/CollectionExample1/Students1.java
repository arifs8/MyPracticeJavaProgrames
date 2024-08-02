package CollectionExample1;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Students1 {

	public static void main(String[] args) {

	
		PriorityQueue<Integer> spq = new PriorityQueue<>((o1,o2) -> o2-o1);
		spq.offer(1);
		spq.offer(2);
		spq.offer(0);
		spq.offer(100);

		List<Integer> bot2 = new ArrayList<Integer>();
		int index = 0;

		while (!spq.isEmpty()) {

			if (index == 2)
				break;

			bot2.add(spq.poll());
			index++;
		}

		System.out.print(bot2);

	}

}
