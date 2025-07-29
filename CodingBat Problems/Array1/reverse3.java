public class reverse3 {
    public int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public static void main(String[] args) {
        reverse3 obj = new reverse3();
        System.out.println(java.util.Arrays.toString(obj.reverse3(new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(obj.reverse3(new int[]{5, 11, 9})));
        System.out.println(java.util.Arrays.toString(obj.reverse3(new int[]{7, 0, 0})));
        System.out.println(java.util.Arrays.toString(obj.reverse3(new int[]{4, 6, 8})));
    }
}
