public class has23 {
    public boolean has23(int[] nums) {
        return nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3;
    }

    public static void main(String[] args) {
        has23 obj = new has23();
        System.out.println(obj.has23(new int[]{2, 5}));
        System.out.println(obj.has23(new int[]{4, 3}));
        System.out.println(obj.has23(new int[]{4, 5}));
        System.out.println(obj.has23(new int[]{3, 2}));
    }
}
