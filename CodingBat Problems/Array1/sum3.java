public class sum3 {
    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public static void main(String[] args) {
        sum3 obj = new sum3();
        System.out.println(obj.sum3(new int[]{1, 2, 3}));
        System.out.println(obj.sum3(new int[]{5, 11, 2}));
        System.out.println(obj.sum3(new int[]{7, 0, 0}));
        System.out.println(obj.sum3(new int[]{4, 4, 4}));
    }
}
