package ArraysPart1;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two valuews");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(isLCm(a, b));

	}
	
	public static int isLCm(int a, int b) {
		
		int result = Math.max(a, b);
		
		while(true) {
			
			if(result % a==0 && result%b==0) {
				
				break;
			}
			result++;
		}
		
		return result;
	}

}
