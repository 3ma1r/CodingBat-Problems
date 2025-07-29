public class maxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        return new int[]{max, max, max};
    }

    public static void main(String[] args) {
        maxEnd3 obj = new maxEnd3();
        System.out.println(java.util.Arrays.toString(obj.maxEnd3(new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(obj.maxEnd3(new int[]{11, 5, 9})));
        System.out.println(java.util.Arrays.toString(obj.maxEnd3(new int[]{2, 11, 3})));
        System.out.println(java.util.Arrays.toString(obj.maxEnd3(new int[]{6, 1, 6})));
    }
}
