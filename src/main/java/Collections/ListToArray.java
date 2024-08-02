package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {


		List<Integer> alist = new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(2);
		
		Integer[] arr = alist.toArray(new Integer[0]);
		
		for(int x : arr) {
			System.out.print(x + ",");
		}

	}

}
