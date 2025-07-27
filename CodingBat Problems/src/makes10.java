public class makes10 {

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    public static void main(String[] args) {
        makes10 obj = new makes10();
        System.out.println(obj.makes10(9, 10));
        System.out.println(obj.makes10(9, 9));
        System.out.println(obj.makes10(1, 9));
    }
}
