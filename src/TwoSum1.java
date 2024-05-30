import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        TwoSum1 t = new TwoSum1();
        int[] nums = new int[]{2, 7, 11, 15};
        int[] res = t.twoSum(nums, 9);
        System.out.printf(Arrays.toString(res));
    }
}
