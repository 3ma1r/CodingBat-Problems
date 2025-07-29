public class front11 {
    public int[] front11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            return new int[]{a[0], b[0]};
        } else if (a.length > 0) {
            return new int[]{a[0]};
        } else if (b.length > 0) {
            return new int[]{b[0]};
        } else {
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        front11 obj = new front11();
        System.out.println(java.util.Arrays.toString(obj.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8}))); 
        System.out.println(java.util.Arrays.toString(obj.front11(new int[]{1}, new int[]{2})));
        System.out.println(java.util.Arrays.toString(obj.front11(new int[]{1, 7}, new int[]{})));
        System.out.println(java.util.Arrays.toString(obj.front11(new int[]{}, new int[]{9})));
    }
}
