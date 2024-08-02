package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		
		List<Integer> at = new ArrayList<Integer>();
		at.add(111);
		at.add(2222);
		at.add(333);
		at.add(400);
		at.add(500);
		
		
		List<Integer> at1 = new ArrayList<Integer>();
		
		at1.add(600);
		
		
		at1.addAll(at);
		
		at1.set(2, 300);
		
		System.out.println("The First Arraylist Value is : " + at);
		System.out.println("The Second Arraylist Value is : " + at1);
		
		System.out.println(at1.indexOf(3));
	}

}
