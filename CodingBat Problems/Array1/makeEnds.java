public class makeEnds {
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public static void main(String[] args) {
        makeEnds obj = new makeEnds();
        System.out.println(java.util.Arrays.toString(obj.makeEnds(new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(obj.makeEnds(new int[]{1, 2, 3, 4})));
        System.out.println(java.util.Arrays.toString(obj.makeEnds(new int[]{7, 4, 6, 2})));
        System.out.println(java.util.Arrays.toString(obj.makeEnds(new int[]{5})));
    }
}
