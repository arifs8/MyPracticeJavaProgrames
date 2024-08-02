package Collections;

import java.util.LinkedList;
import java.util.*;

public class ListIterator1 {

	public static void main(String[] args) {
		
		
		List<Integer> ls = new LinkedList<Integer>();
		
		ls.add(100);
		ls.add(200);
		ls.add(300);
		ls.add(400);
		ls.add(500);
		ls.add(600);
		
		ListIterator<Integer> ltr = ls.listIterator();
		System.out.println(ltr.next());
		System.out.println(ltr.next());
		System.out.println(ltr.previous());
		
	
	
	}

}
