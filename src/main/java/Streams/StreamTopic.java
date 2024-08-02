package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTopic {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Aaki");
		al.add("Arifsab");
		al.add("Ammu");
		al.add("Ram");
		al.add("Reshma");
		al.add("Adamsab");

		Long see = al.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(see);

		Long ans = Stream.of("Arif", "Aakib", "Reshma").filter(s ->

		s.startsWith("A")).count();

		System.out.println(ans);

		// al.stream().filter(s -> s.length() >= 3).forEach(s -> System.out.println(s));
		// al.stream().filter(s -> s.length()>1).forEach(s -> System.out.println(s));
		// al.stream().filter(s ->
		// s.length()>4).limit(1).forEach(s->System.out.println(s));
		// al.stream().forEach(s -> System.out.println(s));
		al.stream().filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		// al.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

		// al.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

//		List<String> army = Arrays.asList("Spider-Man","Iron Man","Black Panther","Deadpool","Captain America","Jessica Jones","Ant-Man");
//		
//		List<String> soilders = Arrays.asList("The Enigma","Dracula","Dormammu","Mister Sinister","The Maker","Molecule Man","Doctor Doom");
//		
//		Stream<String> allNames =  Stream.concat(army.stream(), soilders.stream());
//		
//		//allNames.sorted().map(s ->s.toUpperCase()).forEach(s ->System.out.println(s));
//		
//		boolean flag = allNames.anyMatch(s->s.equalsIgnoreCase("Spider-man"));
//		//Assert.assertTrue(flag);

	}

}
