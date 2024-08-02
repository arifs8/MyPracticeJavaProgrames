package String;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the String : ");

		String st = sc.nextLine();

		reverseString1(st);

	}

	public static void reverseString1(String str) {

		StringBuilder sb = new StringBuilder();

		char[] ch = str.toCharArray();

		// String rev = "";

		for (int i = ch.length - 1; i >= 0; i--) {

			
			sb.append(ch[i]);
		}

		System.out.println(sb);
	}

}
