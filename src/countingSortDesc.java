package src;

public class countingSortDesc {
    public static void countingSortDescending(int arr[]){
        int largest = Integer.MIN_VALUE;
        //Find the largest Element 
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        //create the count array
        int count[] = new int[largest+1];
        //Store Frequency
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        } 
        int j= 0; 
        //Fill array in descending order
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        
    }
        public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        countingSortDescending(arr);
        System.out.println("Sorted Array (Descending): ");
        printArr(arr);
    }
}
