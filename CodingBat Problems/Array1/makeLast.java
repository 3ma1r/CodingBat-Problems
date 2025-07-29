public class makeLast {
    public int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }

    public static void main(String[] args) {
        makeLast obj = new makeLast();
        System.out.println(java.util.Arrays.toString(obj.makeLast(new int[]{4, 5, 6})));
        System.out.println(java.util.Arrays.toString(obj.makeLast(new int[]{1, 2})));
        System.out.println(java.util.Arrays.toString(obj.makeLast(new int[]{3})));
        System.out.println(java.util.Arrays.toString(obj.makeLast(new int[]{9, 8, 7})));
    }
}
