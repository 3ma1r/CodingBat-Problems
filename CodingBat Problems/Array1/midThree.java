public class midThree {
    public int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};
    }

    public static void main(String[] args) {
        midThree obj = new midThree();
        System.out.println(java.util.Arrays.toString(obj.midThree(new int[]{1, 2, 3, 4, 5})));
        System.out.println(java.util.Arrays.toString(obj.midThree(new int[]{8, 6, 7, 5, 3, 0, 9})));
        System.out.println(java.util.Arrays.toString(obj.midThree(new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(obj.midThree(new int[]{11, 22, 33, 44, 55})));
    }
}
