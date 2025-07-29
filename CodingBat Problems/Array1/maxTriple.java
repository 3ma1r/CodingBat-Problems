public class maxTriple {
    public int maxTriple(int[] nums) {
        int mid = nums.length / 2;
        return Math.max(nums[0], Math.max(nums[mid], nums[nums.length - 1]));
    }

    public static void main(String[] args) {
        maxTriple obj = new maxTriple();
        System.out.println(obj.maxTriple(new int[]{1, 2, 3}));
        System.out.println(obj.maxTriple(new int[]{1, 5, 3}));
        System.out.println(obj.maxTriple(new int[]{5, 2, 3}));
        System.out.println(obj.maxTriple(new int[]{8, 1, 4, 9, 2}));
    }
}
