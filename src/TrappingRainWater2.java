package src;

public class TrappingRainWater2 {

    public static int trap(int[] height) {
        int n = height.length;

        int res = 0, l = 0, r = n - 1;
        int lMax = height[l], rMax = height[r];

        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                res += rMax - height[r];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        System.out.println(trap(height));
    }
}