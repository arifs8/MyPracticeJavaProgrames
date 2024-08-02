package Corejava;

import java.util.Scanner;

public class Switchclass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide the number between 1 to 5 : ");

		int num = scan.nextInt();

		switch (num) {
		case 1:
//				System.out.println("This is First statement");
//			break;

		case 2:
			System.out.println("This is Second statement");
			break;

		case 3:
			System.out.println("This is Third statement");
			break;

		case 4:
			System.out.println("This is Fourth statement");
			break;

		case 5:
			System.out.println("This is Fifth statement");
			break;

		default:
			System.out.println("This is Default statement");
			break;
		}

	}

}
