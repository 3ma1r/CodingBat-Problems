public class double23 {
    public boolean double23(int[] nums) {
        return (nums.length == 2) &&
                ((nums[0] == 2 && nums[1] == 2) ||
                        (nums[0] == 3 && nums[1] == 3));
    }

    public static void main(String[] args) {
        double23 obj = new double23();
        System.out.println(obj.double23(new int[]{2, 2}));
        System.out.println(obj.double23(new int[]{3, 3}));
        System.out.println(obj.double23(new int[]{2, 3}));
        System.out.println(obj.double23(new int[]{3}));
    }
}
