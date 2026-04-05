package src;

import java.util.HashSet;

public class containsDuplicate2 {
    public static boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> Set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (Set.contains(nums[i])) {
                return true;
            } else {
                Set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };
        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        System.out.println(containsDuplicate2(nums1));
        System.out.println(containsDuplicate2(nums2));
        System.out.println(containsDuplicate2(nums3));

    }

}
