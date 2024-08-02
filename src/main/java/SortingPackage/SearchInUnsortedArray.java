package SortingPackage;

public class SearchInUnsortedArray {
    
    // Method to perform QuickSort
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);
            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }
    
    // Method to partition the array
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = (start - 1);
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
               swap(arr,i,j);
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
    
    // Method to perform Binary Search
    public static int binarySearch(int[] arr, int x) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
            	start = mid + 1;
            } else {
            	end = mid - 1;
            }
        }
        return -1;
    }
    
    // Method to find the element using QuickSort and Binary Search
    public static int findElement(int[] arr, int x) {
        quickSort(arr, 0, arr.length - 1);
        return binarySearch(arr, x);
    }
    
    public static void main(String[] args) {
        int[] unsortedArray = {34, 7, 230, 32, 5, 62};
        int elementToFind = 23;
        
        int index = findElement(unsortedArray, elementToFind);
        
        if (index != -1) {
            System.out.println("Element " + elementToFind + " is present at index " + index + " in the sorted array.");
        } else {
            System.out.println("Element " + elementToFind + " is not present in the array.");
        }
    }
}

    
   
    

