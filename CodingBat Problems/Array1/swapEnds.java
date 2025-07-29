public class swapEnds {
    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public static void main(String[] args) {
        swapEnds obj = new swapEnds();
        System.out.println(java.util.Arrays.toString(obj.swapEnds(new int[]{1, 2, 3, 4})));
        System.out.println(java.util.Arrays.toString(obj.swapEnds(new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(obj.swapEnds(new int[]{8, 6, 7, 9, 5})));
        System.out.println(java.util.Arrays.toString(obj.swapEnds(new int[]{10, 20})));
    }
}
