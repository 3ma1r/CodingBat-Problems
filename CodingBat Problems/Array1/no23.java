public class no23 {
    public boolean no23(int[] nums) {
        return nums[0] != 2 && nums[1] != 2 && nums[0] != 3 && nums[1] != 3;
    }

    public static void main(String[] args) {
        no23 obj = new no23();
        System.out.println(obj.no23(new int[]{4, 5}));
        System.out.println(obj.no23(new int[]{4, 2}));
        System.out.println(obj.no23(new int[]{3, 5}));
        System.out.println(obj.no23(new int[]{1, 7}));
    }
}
