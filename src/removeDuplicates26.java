public class removeDuplicates26 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int l = 0, r = 0;

        // 1,1,2
        while (r < nums.length) {
            if (nums[r] != nums[l]) {
                nums[l + 1] = nums[r];
                l++;
            }
            r++;
        }
        return l + 1;
    }


    public static void main(String[] args) {

    }
}
