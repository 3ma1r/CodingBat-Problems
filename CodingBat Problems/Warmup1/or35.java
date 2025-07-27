public class or35 {

    public boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }

    public static void main(String[] args) {
        or35 obj = new or35();
        System.out.println(obj.or35(3));
        System.out.println(obj.or35(10));
        System.out.println(obj.or35(8));
    }
}
