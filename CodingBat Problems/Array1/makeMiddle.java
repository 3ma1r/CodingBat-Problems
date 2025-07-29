public class makeMiddle {
    public int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid]};
    }

    public static void main(String[] args) {
        makeMiddle obj = new makeMiddle();
        System.out.println(java.util.Arrays.toString(obj.makeMiddle(new int[]{1, 2, 3, 4})));
        System.out.println(java.util.Arrays.toString(obj.makeMiddle(new int[]{7, 1, 2, 3, 4, 9})));
        System.out.println(java.util.Arrays.toString(obj.makeMiddle(new int[]{1, 2})));
        System.out.println(java.util.Arrays.toString(obj.makeMiddle(new int[]{8, 6, 4, 2})));
    }
}
