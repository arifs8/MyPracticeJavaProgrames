package MathForCoding;

import javax.swing.border.EmptyBorder;

public class MissinNumber {

	public static void main(String[] args) {
		int arr[] =  {0,1};
		System.out.println(missingNum(arr));

	}
	
	public static int missingNum(int arr[]) {
		
		
		
		int num = arr.length;
		
		int totalSum = num*(num+1)/2;
		
		int sum=0;
		
		for(int i=0; i<num ;i++) {
			
			sum = sum+arr[i];
		}
		
		
		int missingNum = totalSum - sum;
		return missingNum;
		
	}

}
