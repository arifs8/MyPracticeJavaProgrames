package Exception;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {

		System.out.println("Please pass the age: ");

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

	if(age>60) {
		
		throw new tooOldException("Too young to get marrie brother!...............Lucifer is on the way ");
	}else if(age<18) {
		
		throw new tooYoungException("May be you need to wait for some more time");
	}else {
		System.out.println("Submitted you r age ");
	}
	 

	}

}
