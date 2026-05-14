package src;

public class MajorityElement2 {
    public static int countInRange(int[] nums, int num, int lo, int hi){
        int count = 0;
        for(int i =lo; i<=hi; i++){
            if(nums[i] == num){
                count++;
            }
        }
        return count;
    }
    private static int MajorityElementRec(int[] nums, int lo, int hi){
        //base case: the only element in an array of size 1 is the majority element 
        if(lo == hi){
            return nums[lo];
        }

        //recurse on left and right halves of this slice 
        int mid = (hi-lo)/2+lo;
        int left = MajorityElementRec(nums, lo ,mid);
        int right = MajorityElementRec(nums, mid+1, hi);

        //if the two halves agree on the majority eleemnts,return it 
        if(left == right){
            return left;
        }
        //otherwise count each element and return the "Winner"
        int leftcount = countInRange(nums, left, lo, hi);
        int rightcount = countInRange(nums, right, lo, hi);

        return leftcount>rightcount ? left:right;
    }

    public static int majorityElement(int[] nums){
        return MajorityElementRec(nums, 0, nums.length-1);
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
