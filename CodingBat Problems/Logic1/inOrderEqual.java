public class inOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return equalOk ? a <= b && b <= c : a < b && b < c;
    }

    public static void main(String[] args) {
        inOrderEqual obj = new inOrderEqual();
        System.out.println(obj.inOrderEqual(2, 5, 11, false));
        System.out.println(obj.inOrderEqual(5, 7, 6, false));
        System.out.println(obj.inOrderEqual(5, 5, 7, true));
        System.out.println(obj.inOrderEqual(5, 5, 5, true));
    }
}
