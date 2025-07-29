public class make2 {
    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int index = 0;

        for (int i = 0; i < a.length && index < 2; i++) {
            result[index++] = a[i];
        }

        for (int i = 0; i < b.length && index < 2; i++) {
            result[index++] = b[i];
        }

        return result;
    }

    public static void main(String[] args) {
        make2 obj = new make2();
        System.out.println(java.util.Arrays.toString(obj.make2(new int[]{4, 5}, new int[]{1, 2, 3}))); 
        System.out.println(java.util.Arrays.toString(obj.make2(new int[]{4}, new int[]{1, 2, 3})));
        System.out.println(java.util.Arrays.toString(obj.make2(new int[]{}, new int[]{1, 2})));
        System.out.println(java.util.Arrays.toString(obj.make2(new int[]{6}, new int[]{7})));
    }
}
