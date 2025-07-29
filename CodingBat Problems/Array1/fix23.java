public class fix23 {
    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        fix23 obj = new fix23();
        System.out.println(java.util.Arrays.toString(obj.fix23(new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(obj.fix23(new int[]{2, 3, 5})));
        System.out.println(java.util.Arrays.toString(obj.fix23(new int[]{1, 2, 1})));
        System.out.println(java.util.Arrays.toString(obj.fix23(new int[]{2, 3, 3})));
    }
}
