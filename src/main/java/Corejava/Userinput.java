package Corejava;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi How are you dear may I know your name ");
		String name = scan.nextLine();
		System.out.printf("Hellow  %s, how are you , What is your age" , name);
		int age = scan.nextInt();
		System.out.printf("Thanks %s, for letting your aga as %d",name,age);
		scan.close();

	}

}
