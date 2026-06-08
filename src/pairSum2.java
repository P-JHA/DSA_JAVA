package src;

import java.util.ArrayList;

public class pairSum2 {

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();

        // Find breaking point
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1; // smallest element
        int rp = bp;     // largest element

        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);

            // Case 1: Pair found
            if (sum == target) {
                return true;
            }

            // Case 2: Sum is smaller than target
            if (sum < target) {
                lp = (lp + 1) % n;
            }
            // Case 3: Sum is greater than target
            else {
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Sorted & Rotated Array
        // 11,15,6,8,9,10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum2(list, target));
    }
}