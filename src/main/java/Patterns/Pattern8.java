package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        //Taking rows value from the user
 
        System.out.println("How many rows you want in this pattern?");
 
        int n = sc.nextInt();
 
        System.out.println("Here is your pattern....!!!");
 
        for (int row = n; row >= 1; row--)
        {
            for (int col = 1; col <= row; col++)
            {
                System.out.print(col+" ");
            }
 
            System.out.println();
        }
 
        //Closing the resources
 
        sc.close();
    }
}
