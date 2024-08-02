package Arrays;

public class reverseOfArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		//revArray(arr);
		reverse2(arr);
		
		System.out.print("Reversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        
	}
	
	public static void revArray(int[] arr) {
		
		int n = arr.length;
		
		int i=0;
		int j =n-1;
		
		while(i<j) {
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		i++;
			j--;
		}
		
		
	}
	
	public static void swap(int i , int j) {
		
		
			
			int temp =i;
			i = j;
			j = temp;
			
		i++;
			j--;
		}
	
	
	public static void reverse2(int[] arr) {
		
		int n = arr.length;
		int i=0;
		int j=n-1;
		
		while(i<j) {
			
			swap(arr[i],arr[j]);
			i++;
			j--;
		}
	}

}
