package Corejava;

public class ForEach {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i<arr.length ;i++) {
			
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		System.out.println("Total values are "+ arr.length);
		
		
		for(int ar : arr) {
			System.out.print(ar+ " ");
		}
	}

}
