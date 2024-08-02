package Arrays;

public class replaceEvenZero {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		modifyArray(arr);



	}


	public static int[] modifyArray(int[] arr) {
		int n = arr.length;
		int result[] = new int[n];

		for(int i=0; i<n; i++) {
			if(arr[i] % 2 == 0) {

				result[i] = 0;
				//System.out.println(arr[i]);

			}else {
				result[i] =1;
				//System.out.println(arr[i]);

			}


			System.out.print(result[i]+" ");
		}

	return result;
}

}
