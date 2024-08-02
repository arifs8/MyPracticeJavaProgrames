package SortingPackage;

public class QuickSort {

	public static void main(String[] args) {

		int[] arr = { 10, 37, 28, 9 };
		int n = arr.length;

		quickSort(arr, 0, n - 1);

		System.out.println("Sorted array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void quickSort(int[] arr, int start, int end) {

		if (start < end) {

			int partition = findPartition(arr, start, end);

			quickSort(arr, start, partition - 1);

			quickSort(arr, partition + 1, end);
		}
	}

	private static int findPartition(int[] arr, int start, int end) {

		int piviot = arr[end];

		int i = (start - 1);

		for (int j = start; j < end; j++) {

			if (arr[j] < piviot) {
				i++;

				swap(arr, i, j);
			}
		}

		swap(arr, i + 1, end);
		return i + 1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
	
	
}
