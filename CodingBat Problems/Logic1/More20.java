public class More20 {
    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public static void main(String[] args) {
        More20 m = new More20();
        System.out.println(m.more20(20));  
        System.out.println(m.more20(21));
        System.out.println(m.more20(22));
        System.out.println(m.more20(42));
    }
}
