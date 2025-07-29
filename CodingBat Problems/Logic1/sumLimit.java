public class sumLimit {
    public static int sumLimit(int a, int b) {
        int sum = a + b;
        if (String.valueOf(sum).length() == String.valueOf(a).length()) {
            return sum;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(sumLimit(2, 3));  
        System.out.println(sumLimit(8, 3));
        System.out.println(sumLimit(8, 1));
        System.out.println(sumLimit(99, 1));
    }
}
