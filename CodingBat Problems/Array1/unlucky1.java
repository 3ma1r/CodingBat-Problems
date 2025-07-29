public class unlucky1 {
    public boolean unlucky1(int[] nums) {
        int len = nums.length;
        if (len < 2) return false;

        if ((nums[0] == 1 && nums[1] == 3) ||
                (len >= 3 && nums[1] == 1 && nums[2] == 3) ||
                (nums[len - 2] == 1 && nums[len - 1] == 3)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        unlucky1 obj = new unlucky1();
        System.out.println(obj.unlucky1(new int[]{1, 3, 4, 5}));     
        System.out.println(obj.unlucky1(new int[]{2, 1, 3, 4, 5}));
        System.out.println(obj.unlucky1(new int[]{1, 1, 1}));
        System.out.println(obj.unlucky1(new int[]{3, 1, 3}));
    }
}
