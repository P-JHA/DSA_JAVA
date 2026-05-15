package src;

public class InversionCount {
    public static int getInnCount(int arr[]){
        int n = arr.length;
        int invcount = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    invcount++;
                }
            }
        }
        return invcount;
    }
    public static void main(String[] args) {
        int arr[] = {1,20,6,4,5};
        System.out.println("Inversion Count: "+getInnCount(arr));
    }
}
