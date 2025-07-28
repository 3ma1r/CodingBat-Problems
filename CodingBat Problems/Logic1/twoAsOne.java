public class twoAsOne {
    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public static void main(String[] args) {
        twoAsOne obj = new twoAsOne();
        System.out.println(obj.twoAsOne(1, 2, 3));
        System.out.println(obj.twoAsOne(3, 1, 2));
        System.out.println(obj.twoAsOne(3, 2, 2));
        System.out.println(obj.twoAsOne(0, 0, 0));
    }
}
