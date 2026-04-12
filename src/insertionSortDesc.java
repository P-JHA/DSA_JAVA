package src;

public class insertionSortDesc {
    public static void insertionsortDescending(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            //to find the index where currnis to be inserted 
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void printArr (int arr[]){
        for(int num : arr){
            System.out.print(num +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {3,6,2,1,8,7,4,5,3,1};
        insertionsortDescending(arr);
        System.out.println("Sorted Array (Descending): ");
        printArr(arr);
    }
}
