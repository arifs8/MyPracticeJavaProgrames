package Streams;

import java.util.Comparator;
import java.util.stream.*;

public class StreamCount {

	public static void main(String[] args) {

		Stream<Integer> ele2 = Stream.of(1, 2);

		long count_int = ele2.collect(Collectors.counting());

		System.out.println(count_int);
		
		
		Stream<String> str = Stream.of("Arif","Aakib","Patrik");
		
		Long count = str.collect(Collectors.counting());
		System.out.println(count);
		
		
		Integer integer = Stream.of(1,2,3,4,5).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(integer);
		
		Integer integer1 = Stream.of(1,2,3,4,5).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(integer1);

	}

}
