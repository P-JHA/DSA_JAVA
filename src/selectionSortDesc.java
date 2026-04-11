package src;

public class selectionSortDesc {
    public static void selectionSortDescending(int arr[]){
        for(int turn = 0; turn < arr.length; turn++){
            int minPos = turn; 
            for(int j= turn+1; j<arr.length; j++){
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }
            //loop
            int temp = arr[turn];
            arr[turn] = arr[minPos];
            arr[minPos] = temp;
        }

    }
    public static void printArr (int arr[]){
        for(int num : arr){
            System.out.print(num +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        selectionSortDescending(arr);
        System.out.println("Sorted array (Descending) : ");
        printArr(arr);
    }
}
