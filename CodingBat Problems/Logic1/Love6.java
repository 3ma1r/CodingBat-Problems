public class Love6 {
    public boolean love6(int a, int b) {
        return a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6;
    }

    public static void main(String[] args) {
        Love6 l = new Love6();
        System.out.println(l.love6(6, 4)); 
        System.out.println(l.love6(4, 5));
        System.out.println(l.love6(1, 5));
        System.out.println(l.love6(12, 6));
    }
}
