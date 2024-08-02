package ArraysPart1;

public class SecondSmallestValue {

	public static void main(String[] args) {
		int[] arr = {1,2,1,4,6};
		int n = arr.length;
		
		System.out.println(fiunc(arr, n));
		System.err.println(secondLargest(arr, n));
		

	}
	
	
	public static int fiunc(int[] arr ,int n) {
		
		
		int smallest = Integer.MAX_VALUE;
		int second_Smallest = Integer.MAX_VALUE;
		
		for(int i=0 ;i<n ;i++) {
			
			
			if(arr[i] < smallest) {
				second_Smallest = smallest;
				smallest = arr[i];
	
			}else if(arr[i] < second_Smallest && arr[i] > smallest){
				
				second_Smallest = arr[i];
			}
			
				
		}
		
		return second_Smallest;
				
	
	}
	
	public static int secondLargest(int[] arr ,int n) {
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0 ; i<n ;i++) {
			
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i] > secondLargest && arr[i] < largest) {
				
				secondLargest=arr[i];
			}
		}
		
		return secondLargest;
	}

}
