package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindElements {

	public static void main(String[] args) {

		List<Integer> lsit = Arrays.asList(2,3,4,1,5,1);
		
		Optional<Integer> element = lsit.stream().findFirst();
		if(element.isPresent()) {
			System.out.println(element.get());
		}else {
			System.out.println("Stream is empty");
		}
		
		Optional<Integer> ele1 = lsit.stream().findAny();
		if(ele1.isPresent()) {
			System.out.println(ele1.get());
		}else {
			System.out.println("Stream is empty");
		}
		
	
		
	
	}

}
