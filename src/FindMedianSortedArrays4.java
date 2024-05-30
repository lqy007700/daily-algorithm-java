public class FindMedianSortedArrays4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int len = m + n;

        int l = -1, r = -1;
        int a = 0, b = 0;

        for (int i = 0; i <= len / 2; i++) {
            l = r;
            if (a < m && (b >= n || nums1[a] < nums2[b])) {
                r = nums1[a++];
            } else {
                r = nums2[b++];
            }
        }

        if (len % 2 == 0) {
            return (double) (l + r) / 2;
        }

        return r;
    }

    public static void main(String[] args) {
        int[] nums1 = {0,0};
        int[] nums2 = {0,0};
        FindMedianSortedArrays4 f = new FindMedianSortedArrays4();
        int res = (int) f.findMedianSortedArrays(nums1, nums2);
        System.out.println(res);
    }
}
