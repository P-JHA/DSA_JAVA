package src;

public class Merge_Sort {

    // Function to merge two sorted arrays
    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];

        int i = si;       // iterator for left part
        int j = mid + 1;  // iterator for right part
        int k = 0;        // iterator for temp array

        // Compare elements from both parts
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Remaining elements of left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Remaining elements of right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp array to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Merge Sort function
    public static void mergeSort(int arr[], int si, int ei) {

        // Base case
        if (si >= ei) {
            return;
        }

        // Find middle
        int mid = si + (ei - si) / 2;

        // Left part sort
        mergeSort(arr, si, mid);

        // Right part sort
        mergeSort(arr, mid + 1, ei);

        // Merge both sorted parts
        merge(arr, si, mid, ei);
    }

    // Print array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {6, 3, 9, 5, 2, 8};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArr(arr);
    }
}