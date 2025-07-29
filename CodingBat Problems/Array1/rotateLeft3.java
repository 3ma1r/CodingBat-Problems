public class rotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public static void main(String[] args) {
        rotateLeft3 obj = new rotateLeft3();
        System.out.println(java.util.Arrays.toString(obj.rotateLeft3(new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(obj.rotateLeft3(new int[]{5, 11, 9})));
        System.out.println(java.util.Arrays.toString(obj.rotateLeft3(new int[]{7, 0, 0})));
        System.out.println(java.util.Arrays.toString(obj.rotateLeft3(new int[]{9, 8, 7})));
    }
}
