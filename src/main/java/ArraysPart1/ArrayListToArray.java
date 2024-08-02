package ArraysPart1;

import java.util.ArrayList;

public class ArrayListToArray {

	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        
        String[] arr = new String[arrayList.size()];
        arr = arrayList.toArray(arr);
	}
}
