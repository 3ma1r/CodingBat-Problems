public class biggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        return (sumB > sumA) ? b : a;
    }

    public static void main(String[] args) {
        biggerTwo obj = new biggerTwo();
        System.out.println(java.util.Arrays.toString(obj.biggerTwo(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(java.util.Arrays.toString(obj.biggerTwo(new int[]{3, 4}, new int[]{1, 2})));
        System.out.println(java.util.Arrays.toString(obj.biggerTwo(new int[]{1, 1}, new int[]{1, 2})));
        System.out.println(java.util.Arrays.toString(obj.biggerTwo(new int[]{5, 5}, new int[]{6, 4})));
    }
}
