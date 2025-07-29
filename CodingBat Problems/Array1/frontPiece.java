public class frontPiece {
    public int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            return new int[]{nums[0], nums[1]};
        } else {
            return nums;
        }
    }

    public static void main(String[] args) {
        frontPiece obj = new frontPiece();
        System.out.println(java.util.Arrays.toString(obj.frontPiece(new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(obj.frontPiece(new int[]{1, 2})));
        System.out.println(java.util.Arrays.toString(obj.frontPiece(new int[]{1})));
        System.out.println(java.util.Arrays.toString(obj.frontPiece(new int[]{})));
    }
}
