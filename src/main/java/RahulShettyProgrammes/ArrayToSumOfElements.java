package RahulShettyProgrammes;

import Arrays.sumOfAllNumbers;

public class ArrayToSumOfElements {

	public static void main(String[] args) {
		int[] add = {10,20,30,40,50};
		
		System.out.println("The addition of the number is :" + sumOfArray(add));
		
	}
	
	public static int sumOfArray(int[] add) {
		
		int sum=0;
		for(int i=0 ;i<add.length;i++) {
			
			sum = sum +add[i];
		}
		
		return sum;
	
	}

}
