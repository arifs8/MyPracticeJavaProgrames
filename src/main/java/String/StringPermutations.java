package String;

import java.util.Scanner;

public class StringPermutations {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    System.out.print("Enter string to generate its permutations: ");
	    String str = scn.next(); //String input from the user
	    if (str.length() == 0 || str == null) {
	      return;
	    }
	    solve(str.toCharArray(), 0); //function call to find all the permutations
	    //toCharArray() converts a given string into a character array

	}
	
	
	public static void solve(char[] arr, int fi) {
	    if (fi == arr.length - 1) { //Base condition of recursion
	      System.out.print(String.valueOf(arr) + " ");
	    }

	    for (int i = fi; i < arr.length; i++) {
	      swap(arr, fi, i);
	      solve(arr, fi + 1);
	      swap(arr, fi, i);
	      //Backtracking: reverting all the elements to their original places
	    }
	  }


	public static void swap(char[] arr, int fi, int i) {
		 char temp = arr[fi];
		    arr[fi] = arr[i];
		    arr[i] = temp;
		
	}

}
