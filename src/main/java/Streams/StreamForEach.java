package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamForEach {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Arif", 1));
		list.add(new Person("Aakib", 2));
		list.add(new Person("Ammu", 3));
		list.add(new Person("Ammi", 4));

		// Before java 8
		for (Person per : list) {
			System.out.println(per.getName());
			System.out.println(per.getAge());
		}

		System.out.println("-----------------------");

		list.forEach((person) -> {

			System.out.println(person.getName());
			System.out.println(person.getAge());

		});

		System.out.println("-----------------------");

		list.stream().forEach((person) -> {

			System.out.println(person.getName());
			System.out.println(person.getAge());

		});

	}

}

class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StreamForEach [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";

	}

}
