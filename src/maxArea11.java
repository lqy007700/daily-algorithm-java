public class maxArea11 {

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int h = Math.min(height[l], height[r]);
            int w = r - l;
            ans = Math.max(ans, h * w);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        maxArea11 m = new maxArea11();
        int ans = m.maxArea(nums);
        System.out.println(ans);
    }
}
