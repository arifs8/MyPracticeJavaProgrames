package CollectionExample1;

import java.util.HashSet;

public class Set {
	
	public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Iteration order may not be the same as insertion order
        for (String element : set) {
            System.out.println(element);
        }
    }

}
