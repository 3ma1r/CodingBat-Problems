public class sum2 {
    public int sum2(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return nums[0] + nums[1];
    }

    public static void main(String[] args) {
        sum2 obj = new sum2();
        System.out.println(obj.sum2(new int[]{1, 2, 3}));
        System.out.println(obj.sum2(new int[]{1, 1}));
        System.out.println(obj.sum2(new int[]{1, 1, 1, 1}));
        System.out.println(obj.sum2(new int[]{}));
    }
}
