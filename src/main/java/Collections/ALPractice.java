package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ALPractice {

	public static void main(String[] args) {

		Integer[] arr= new Integer[] {1,5,8,12,15,20};
		ArrayList<Integer> as = new ArrayList<Integer>(Arrays.asList(arr));
		as.add(100);
		
		System.out.println(as);
		for(Integer in : as) {
			System.out.print(in+" ");
		}

	}

}
