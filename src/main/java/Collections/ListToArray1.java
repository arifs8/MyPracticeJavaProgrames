package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListToArray1 {

	public static void main(String[] args) {


		List<String> names = new ArrayList<String>();
		names.add("Arru");
		names.add("Ammu");
		names.add("Aakibu");
		names.add("Ibuu");
		names.add("Fayeem");
		
		
		int len = names.size();
		
		String[] namesArray = new String[len];
		
		for(int i=0; i<len; i++) {
			namesArray[i] = names.get(i);
			
		}
		
		

		for(int j=0; j<namesArray.length; j++) {
			System.out.println((j+1) + " Elements Present are :" + namesArray[j]);
			
		}

	}

}
