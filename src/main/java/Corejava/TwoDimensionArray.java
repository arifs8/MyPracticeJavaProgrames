package Corejava;

public class TwoDimensionArray {

	public static void main(String[] args) {


			int[][] arr = {{3,3,3},{2,2,2},{1,1,1}};

			int size=0;
			for(int i=0 ;i<arr.length ;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			

	}

}
