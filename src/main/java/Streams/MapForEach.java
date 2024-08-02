package Streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapForEach {

	public static void main(String[] args) {


		Map<Integer, Person> map = new HashMap<Integer, Person>();
		map.put(1, new Person("Arif",29));
		map.put(1, new Person("Aaru",1));
		map.put(1, new Person("Ammu",29));
		
		for(Entry<Integer, Person> entry : map.entrySet()) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName());
		}
		
		System.out.println("________________________________");
		
		//for eah lambda expresion
		
		map.forEach((k,v) -> {
			
			System.out.println(k);
			System.out.println(v.getName());
			
		});

	}

}
