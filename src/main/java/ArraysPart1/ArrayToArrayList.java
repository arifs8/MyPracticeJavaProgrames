package ArraysPart1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	
	public static void main(String[] args) {
		
		String[] srr = {"A", "B", "C", "D", "E"};
		
		List<String> arrList = new ArrayList<String>(Arrays.asList(srr));
		
		System.out.println(arrList);
	}

}
