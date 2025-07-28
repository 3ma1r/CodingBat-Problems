public class inOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return bOk ? c > b : b > a && c > b;
    }

    public static void main(String[] args) {
        inOrder obj = new inOrder();
        System.out.println(obj.inOrder(1, 2, 4, false));
        System.out.println(obj.inOrder(1, 2, 1, false));
        System.out.println(obj.inOrder(1, 1, 2, true));
        System.out.println(obj.inOrder(5, 5, 6, false));
    }
}
