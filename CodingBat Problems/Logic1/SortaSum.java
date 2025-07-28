public class SortaSum {
    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    public static void main(String[] args) {
        SortaSum ss = new SortaSum();
        System.out.println(ss.sortaSum(3, 4));   
        System.out.println(ss.sortaSum(9, 4));
        System.out.println(ss.sortaSum(10, 11));
        System.out.println(ss.sortaSum(5, 5));
    }
}
