public class teenSum {
    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        return a + b;
    }

    public static void main(String[] args) {
        teenSum obj = new teenSum();
        System.out.println(obj.teenSum(3, 4));
        System.out.println(obj.teenSum(10, 13));
        System.out.println(obj.teenSum(13, 2));
        System.out.println(obj.teenSum(15, 19));
    }
}
