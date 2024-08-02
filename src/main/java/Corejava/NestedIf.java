package Corejava;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please provide the result of the finalist : ");

		String examStatus = scan.nextLine();

		if (examStatus.equals("Pass")) {

			System.out.println("You can go to next round which is round 1");

			String firstRoundStatus = "Pass";

			if (firstRoundStatus.equals("Pass")) {

				System.out.println("You can go to next round which is round 2");
			}
			String finalRoundStatus = "Fail";

			if (finalRoundStatus.equals("Pass")) {

				System.out.println("You are the winner of the house");
			}else {
				System.out.println("Go home");
			}

		} else {
			System.out.println("Better luck next time");
		}

	}

}
