package ArraysPart1;

import java.util.Arrays;
import java.util.Iterator;


public class SubArrayWhoseSumEqualToGivenNumber {
    public static void main(String[] args) {
        int[] inputArray = new int[]{1, 4, 20, 3, 10, 5};
        int targetSum = 33;

        findSubarrayWithGivenSum(inputArray, targetSum);
    }

    public static void findSubarrayWithGivenSum(int[] array, int sum) {
        int currentSum =0;
        int i=0;
        
        for(int j=0 ;j<array.length ;j++) {
        	
        	currentSum = currentSum + array[j];
        	
        
        
        while(currentSum > sum && i<=j) {
        	currentSum = currentSum - array[i];
        	i++;
        }
        
        if(currentSum == sum) {
        	System.out.print(i + " "+ j);
        	System.out.println();
        	
        	for(int k=i; k<=j ;k++) {
        		System.out.print(array[k]+" ");
        	}
        }
        
        }
    }
}
