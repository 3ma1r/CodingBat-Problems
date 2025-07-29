public class commonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public static void main(String[] args) {
        commonEnd obj = new commonEnd();
        System.out.println(obj.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        System.out.println(obj.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        System.out.println(obj.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
        System.out.println(obj.commonEnd(new int[]{4}, new int[]{4}));
    }
}
