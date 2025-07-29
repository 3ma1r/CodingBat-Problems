public class plusTwo {
    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public static void main(String[] args) {
        plusTwo obj = new plusTwo();
        System.out.println(java.util.Arrays.toString(obj.plusTwo(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(java.util.Arrays.toString(obj.plusTwo(new int[]{4, 4}, new int[]{2, 2})));
        System.out.println(java.util.Arrays.toString(obj.plusTwo(new int[]{9, 2}, new int[]{3, 4})));
        System.out.println(java.util.Arrays.toString(obj.plusTwo(new int[]{0, 0}, new int[]{5, 6})));
    }
}
